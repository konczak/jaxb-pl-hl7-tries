package pl.konczak.jaxbplhl7tries.t02;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Try02Test {

    private Try02 try02 = new Try02();

    @Test
    public void shouldReturnStringWithXmlSameAsInputFileMinified() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t02\\2.16.840.1.113883.3.4424.13.10.1.26-1-minified.xml";

        Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocument = try01.unmarshallFileToClinicalDocument(filePath);

        // when
        String result = try02.clinicalDocumentToXmlString(clinicalDocument, false);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t02\\expected-minified.xml"))
                .replace("\r\n", "\n");

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }
}
