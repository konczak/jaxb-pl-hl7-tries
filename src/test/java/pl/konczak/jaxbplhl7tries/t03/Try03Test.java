package pl.konczak.jaxbplhl7tries.t03;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.util.Constants;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Try03Test {

    private Try03 try03 = new Try03();

    @Test
    public void shouldReturnTransformedFragmentAsXmlString() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t03\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";

        // when
        final String result = try03.transformXmlFileOfClinicalDocumentToXmlStringOfNarrativeBlock(filePath);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t03\\expected-narrative-block.xml"));

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }
}
