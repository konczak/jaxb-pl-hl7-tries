package pl.konczak.jaxbplhl7tries.t05;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class Try05Test {

    private Try05 try05 = new Try05();

    @Disabled("fails - tried different ways but during transform auto unmarshalling from StremSource to object fails")
    @Test
    public void shouldTransformClinicalDocumentIntoOtherClinicalDocument() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t05\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";

        Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocument = try01.unmarshallFileToClinicalDocument(filePath);

        // when
        final ClinicalDocument result = try05.transformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(clinicalDocument);

        // then
        assertThat(result)
                .isNotNull();
        fail("when find a working solution requires additional assertions");
    }
}
