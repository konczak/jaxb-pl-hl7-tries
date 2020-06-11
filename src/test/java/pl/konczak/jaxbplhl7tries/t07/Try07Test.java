package pl.konczak.jaxbplhl7tries.t07;

import org.junit.jupiter.api.Test;
import pl.konczak.jaxbplhl7tries.t01.Try01;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.org.hl7.v3.*;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class Try07Test {

    private Try07 try07 = new Try07();

    @Test
    public void shouldReturnClinicalDocumentWithOnlyNarrativeBlockElementsMadeByTransformation() throws Exception {
        // given
        final String filePath = Constants.PROJECT_TEST_RESOURCES_PATH + "t07\\2.16.840.1.113883.3.4424.13.10.1.26-1-narrative-block-less.xml";

        Try01 try01 = new Try01();
        final ClinicalDocument clinicalDocument = try01.unmarshallFileToClinicalDocument(filePath);

        // when
        final ClinicalDocument result = try07.manuallyTransformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(clinicalDocument);

        // then
        assertThat(result)
                .isNotNull();
        assertThat(result.getAuthors())
                .isNotNull()
                .isEmpty();
        assertThat(result.getLegalAuthenticator())
                .isNull();
        assertThat(result.getTitle())
                .isNull();
        assertThat(result.getCode())
                .isNull();
        final POCDMT000040Component2 component = result.getComponent();
        assertThat(component)
                .isNotNull();
        final POCDMT000040StructuredBody structuredBody = component.getStructuredBody();
        assertThat(structuredBody)
                .isNotNull();
        assertThat(structuredBody.getComponents())
                .isNotNull()
                .hasSize(2);
        final POCDMT000040Component3 receptaComponent = structuredBody.getComponents().get(0);
        assertReceptaComponent(receptaComponent);
        final POCDMT000040Component3 ubezpieczenieIUprawnieniaComponent = structuredBody.getComponents().get(1);
        assertUbezpieczenieIUprawnieniaComponent(ubezpieczenieIUprawnieniaComponent);
    }

    private void assertReceptaComponent(POCDMT000040Component3 receptaComponent) {
        final POCDMT000040Section section = receptaComponent.getSection();
        assertThat(section)
                .isNotNull();
        assertThat(section.getTitle())
                .isNotNull();
        assertThat(section.getTitle().getContent())
                .isNotNull()
                .hasSize(1)
                .containsExactly("Rpz (Cito)");
        final StrucDocText text = section.getText();
        assertThat(text)
                .isNotNull();
        assertThat(text.getContent())
                .isNotNull()
                .hasSize(4);
    }

    private void assertUbezpieczenieIUprawnieniaComponent(POCDMT000040Component3 ubezpieczenieIUprawnieniaComponent) {
        final POCDMT000040Section section = ubezpieczenieIUprawnieniaComponent.getSection();
        assertThat(section)
                .isNotNull();
        assertThat(section.getTitle())
                .isNotNull();
        assertThat(section.getTitle().getContent())
                .isNotNull()
                .hasSize(1)
                .containsExactly("Dane o ubezpieczeniu i uprawnieniach");
        final StrucDocText text = section.getText();
        assertThat(text)
                .isNotNull();
        assertThat(text.getContent())
                .isNotNull()
                .hasSize(2);
    }
}
