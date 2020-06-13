package pl.konczak.jaxbplhl7tries.t08;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t02.Try02;
import pl.konczak.jaxbplhl7tries.t06.Try06;
import pl.konczak.jaxbplhl7tries.t07.Try07;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.org.hl7.v3.POCDMT000040Section;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Try08Test {

    private Try08 try08 = new Try08();

    @Test
    public void shouldApplyNarrativeBlockSectionElementsIntoClinicalDocument() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t08\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";
        final ClinicalDocument clinicalDocument = new Try06().unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);
        final ClinicalDocument narrativeBlock = new Try07().manuallyTransformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(clinicalDocument);

        // when
        try08.applyNarrativeBlockSectionsIntoClinicalDocument(clinicalDocument, narrativeBlock);

        // then
        final POCDMT000040Section ereceptaSection = clinicalDocument.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(0)
                .getSection();
        assertThat(ereceptaSection.getTitle())
                .isNotNull();
        assertThat(ereceptaSection.getText())
                .isNotNull();

        final POCDMT000040Section ubezpieczenieSection = clinicalDocument.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(1)
                .getSection();
        assertThat(ubezpieczenieSection.getTitle())
                .isNotNull();
        assertThat(ubezpieczenieSection.getText())
                .isNotNull();
    }

    @Test
    public void shouldProperlyMarshallClinicalDocumentWhenAppliedNarrativeBlockSectionElements() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t08\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";
        final ClinicalDocument clinicalDocument = new Try06().unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);
        final ClinicalDocument narrativeBlock = new Try07().manuallyTransformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(clinicalDocument);
        try08.applyNarrativeBlockSectionsIntoClinicalDocument(clinicalDocument, narrativeBlock);

        // when
        final String result = new Try02().clinicalDocumentToXmlString(clinicalDocument, true);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t08\\expected.xml"))
                .replace("\r\n", "\n");

        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedContent);
    }
}
