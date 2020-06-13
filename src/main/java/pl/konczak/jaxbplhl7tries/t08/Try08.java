package pl.konczak.jaxbplhl7tries.t08;

import pl.konczak.tries.org.hl7.v3.POCDMT000040Section;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

/**
 * Eight try:
 * - apply narrative block sections to ClinicalDocument
 */
public class Try08 {

    public void applyNarrativeBlockSectionsIntoClinicalDocument(ClinicalDocument clinicalDocument, ClinicalDocument narrativeBlock) {
        // questionable if all components are in compliant order

        final POCDMT000040Section ereceptaSection = clinicalDocument.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(0)
                .getSection();

        final POCDMT000040Section ereceptaNarrativeBlockSection = narrativeBlock.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(0)
                .getSection();

        mergeReceptaSections(ereceptaSection, ereceptaNarrativeBlockSection);

        final POCDMT000040Section ubezpieczenieSection = clinicalDocument.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(1)
                .getSection();

        final POCDMT000040Section ubezpieczenieNarrativeBlockSection = narrativeBlock.getComponent()
                .getStructuredBody()
                .getComponents()
                .get(1)
                .getSection();

        mergeUbezpieczenieSections(ubezpieczenieSection, ubezpieczenieNarrativeBlockSection);
    }

    private void mergeReceptaSections(POCDMT000040Section ereceptaSection, POCDMT000040Section ereceptaNarrativeBlockSection) {
        ereceptaSection.setText(ereceptaNarrativeBlockSection.getText());
        ereceptaSection.setTitle(ereceptaNarrativeBlockSection.getTitle());
    }

    private void mergeUbezpieczenieSections(POCDMT000040Section ereceptaSection, POCDMT000040Section ereceptaNarrativeBlockSection) {
        ereceptaSection.setText(ereceptaNarrativeBlockSection.getText());
        ereceptaSection.setTitle(ereceptaNarrativeBlockSection.getTitle());
    }
}
