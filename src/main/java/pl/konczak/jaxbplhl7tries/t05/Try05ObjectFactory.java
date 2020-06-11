package pl.konczak.jaxbplhl7tries.t05;

import pl.konczak.tries.org.hl7.v3.POCDMT000040Component2;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class Try05ObjectFactory {
    private static final QName CLINICAL_DOCUMENT_QNAME = new QName("", "ClinicalDocument");
    private static final QName COMPONENT_QNAME = new QName("", "component");

    @XmlElementDecl(namespace = "", name = "ClinicalDocument")
    public JAXBElement<ClinicalDocument> createClinicalDocument(final ClinicalDocument value) {
        return new JAXBElement<>(CLINICAL_DOCUMENT_QNAME, ClinicalDocument.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "component")
    public JAXBElement<POCDMT000040Component2> createPOCDMT000040Component2(final POCDMT000040Component2 value) {
        return new JAXBElement<>(COMPONENT_QNAME, POCDMT000040Component2.class, null, value);
    }
}
