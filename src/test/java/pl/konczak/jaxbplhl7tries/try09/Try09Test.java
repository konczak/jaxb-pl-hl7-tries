package pl.konczak.jaxbplhl7tries.try09;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t06.Try06;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Try09Test {

    private Try09 try09 = new Try09();

    @Test
    public void shouldReturnStringWithHtmlCompliantToCsiozExpectedVisualization() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t09\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";
        final ClinicalDocument clinicalDocument = new Try06().unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);

        // when
        final String result = try09.transformClinicalDocumentToHtmlStringOfPresentation(clinicalDocument);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t09\\expected.html"));

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }

    @Disabled("there are differences in mixed content between what produces msxsl and what developed transformed - worse it influence visualization and some spaces are missing")
    @Test
    public void shouldReturnStringWithHtmlCompliantToWhatMsxslProduces() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t09\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";
        final ClinicalDocument clinicalDocument = new Try06().unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);

        // when
        final String result = try09.transformClinicalDocumentToHtmlStringOfPresentation(clinicalDocument);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t09\\expected-made-using-msxsl.html"));

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }

}
