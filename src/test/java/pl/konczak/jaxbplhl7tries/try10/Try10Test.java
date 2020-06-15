package pl.konczak.jaxbplhl7tries.try10;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Try10Test {

    private Try10 try10 = new Try10();

    @Test
    public void shouldReturnTransformedFragmentAsXmlString() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t10\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";

        Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocument = try01.unmarshallFileToClinicalDocument(filePath);

        // when
        final String result = try10.transformClinicalDocumentToXmlStringOfPrintableInfo(
                clinicalDocument,
                "00010203040506070809101112131415161718192024",
                "2343"
        );

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t10\\expected-printable-info.html"))
                .replace("\r\n", "\n");

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }
}
