package pl.konczak.jaxbplhl7tries.t01;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.AdxpPostalCode;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBElement;

import static org.assertj.core.api.Assertions.assertThat;

public class Try01Test {

    private Try01 try01 = new Try01();

    @Test
    public void shouldReturnFilledClinicalDocumentObjectFromXmlFile() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t01\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";

        // when
        final ClinicalDocument result = try01.unmarshallFileToClinicalDocument(filePath);

        // then
        assertThat(result)
                .isNotNull();
        assertThatPatientAddressContainsPolishAxpPostalCode(result);
        assertThatOrganizationAddressContainsHl7AxpPostalCode(result);

    }

    private void assertThatPatientAddressContainsPolishAxpPostalCode(ClinicalDocument result) {
        final Object value = ((JAXBElement) result
                .getRecordTargets()
                .get(0)
                .getPatientRole()
                .getAddrs()
                .get(0)
                .getContent()
                .get(3))
                .getValue();

        assertThat(value)
                .isNotNull()
                .isInstanceOf(AdxpPostalCode.class);

        final AdxpPostalCode plAdxpPostalCode = (AdxpPostalCode) value;

        assertThat(plAdxpPostalCode.getPostCity())
                .isNotNull()
                .isEqualTo("Piaseczno");


        assertThat(plAdxpPostalCode.getContent())
                .isNotNull()
                .hasSize(1)
                .containsExactly("03-134");
    }

    private void assertThatOrganizationAddressContainsHl7AxpPostalCode(ClinicalDocument result) {
        final Object value = ((JAXBElement) result
                .getAuthors()
                .get(0)
                .getAssignedAuthor()
                .getRepresentedOrganization()
                .getAddrs()
                .get(0)
                .getContent()
                .get(1))
                .getValue();

        assertThat(value)
                .isNotNull()
                .isInstanceOf(pl.konczak.tries.org.hl7.v3.AdxpPostalCode.class);

        pl.konczak.tries.org.hl7.v3.AdxpPostalCode adxpPostalCode = (pl.konczak.tries.org.hl7.v3.AdxpPostalCode) value;
        assertThat(adxpPostalCode.getContent())
                .isNotNull()
                .hasSize(1)
                .containsExactly("00-950");
    }
}
