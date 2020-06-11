package pl.konczak.jaxbplhl7tries.t06;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.t02.Try02;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.org.hl7.v3.POCDMT000040Component3;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBElement;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Try06Test {

    private Try06 try06 = new Try06();

    @Test
    public void shouldReturnFilledClinicalDocumentObjectFromXmlFileWithoutIndentsInMixedContent() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t06\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";

        // when
        final ClinicalDocument result = try06.unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);

        // then
        assertThat(result)
                .isNotNull();

        assertThatNarrativeSectionDoesNotContainIndents(result);
        assertThatPatientAddressDoesNotContainIndents(result);
        assertThatOrganizationAddressDoesNotContainIndents(result);

        final Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocumentWithIndents = try01.unmarshallFileToClinicalDocument(filePath);
        assertThatThereIsDifferenceFromClinicalDocumentUnmarshalledWithoutIndentsSkipping(result, clinicalDocumentWithIndents);
    }

    @Test
    public void shouldBackMarshallToDocumentWithIndentsLikeOriginalOne() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t06\\2.16.840.1.113883.3.4424.13.10.1.26-1.xml";

        // when
        final ClinicalDocument result = try06.unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(filePath);

        // then
        String expectedContent = Files.readString(Paths.get(Constants.PROJECT_TEST_RESOURCES_PATH + "t06\\expected.xml"))
                .replace("\r\n", "\n");
        final String actual = new Try02().clinicalDocumentToXmlString(result, true);
        assertThat(actual)
                .isNotNull()
                .isEqualTo(expectedContent);
    }

    private void assertThatThereIsDifferenceFromClinicalDocumentUnmarshalledWithoutIndentsSkipping(ClinicalDocument result, ClinicalDocument clinicalDocumentWithIndents) {
        final List<POCDMT000040Component3> componentsOfResult = result.getComponent()
                .getStructuredBody()
                .getComponents();
        final List<POCDMT000040Component3> componentsOfIndentsLess = clinicalDocumentWithIndents.getComponent()
                .getStructuredBody()
                .getComponents();

        final List<Serializable> contentOfReceptaComponent = componentsOfResult
                .get(0)
                .getSection()
                .getText()
                .getContent();
        final List<Serializable> contentOfReceptaComponentOfIndentsLess = componentsOfIndentsLess
                .get(0)
                .getSection()
                .getText()
                .getContent();

        assertThat(contentOfReceptaComponent)
                .hasSizeLessThan(contentOfReceptaComponentOfIndentsLess.size());

        final List<Serializable> contentOfUbezpieczenieComponent = componentsOfResult
                .get(1)
                .getSection()
                .getText()
                .getContent();
        final List<Serializable> contentOfUbezpieczenieComponentOfIndentsLess = componentsOfIndentsLess
                .get(1)
                .getSection()
                .getText()
                .getContent();

        assertThat(contentOfUbezpieczenieComponent)
                .hasSizeLessThan(contentOfUbezpieczenieComponentOfIndentsLess.size());
    }

    private void assertThatNarrativeSectionDoesNotContainIndents(ClinicalDocument result) {
        final List<POCDMT000040Component3> components = result.getComponent()
                .getStructuredBody()
                .getComponents();

        assertThat(components)
                .isNotNull()
                .hasSize(2);

        final List<Serializable> contentOfReceptaComponent = components
                .get(0)
                .getSection()
                .getText()
                .getContent();

        assertThat(contentOfReceptaComponent)
                .isNotNull()
                .hasSize(4)
                .doesNotContainSequence(" ")
                .hasOnlyElementsOfType(JAXBElement.class);

        final List<Serializable> contentOfUbezpieczenieComponent = components
                .get(1)
                .getSection()
                .getText()
                .getContent();

        assertThat(contentOfUbezpieczenieComponent)
                .isNotNull()
                .hasSize(2)
                .doesNotContainSequence(" ")
                .hasOnlyElementsOfType(JAXBElement.class);
    }

    private void assertThatPatientAddressDoesNotContainIndents(ClinicalDocument result) {
        final List<Serializable> content = result
                .getRecordTargets()
                .get(0)
                .getPatientRole()
                .getAddrs()
                .get(0)
                .getContent();

        assertThat(content)
                .isNotNull()
                .hasSize(7)
                .doesNotContainSequence(" ")
                .hasOnlyElementsOfType(JAXBElement.class);
    }

    private void assertThatOrganizationAddressDoesNotContainIndents(ClinicalDocument result) {
        final List<Serializable> content = result
                .getAuthors()
                .get(0)
                .getAssignedAuthor()
                .getRepresentedOrganization()
                .getAddrs()
                .get(0)
                .getContent();

        assertThat(content)
                .isNotNull()
                .hasSize(4)
                .doesNotContainSequence(" ")
                .hasOnlyElementsOfType(JAXBElement.class);
    }
}
