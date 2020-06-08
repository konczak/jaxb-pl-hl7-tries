package pl.konczak.jaxbplhl7tries.t04;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.function.Try;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Try04Test {

    private Try04 try04 = new Try04();

    @Test
    public void shouldReturnTransformedFragmentAsXmlString() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t04\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";

        Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocument = try01.unmarshallFileToClinicalDocument(filePath);

        // when
        final String result = try04.transformClinicalDocumentToXmlStringOfNarrativeBlock(clinicalDocument);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t04\\expected-narrative-block.xml"));

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }

}
