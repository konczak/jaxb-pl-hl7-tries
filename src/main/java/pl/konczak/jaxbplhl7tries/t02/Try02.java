package pl.konczak.jaxbplhl7tries.t02;

import pl.konczak.jaxbplhl7tries.util.MyNamespaceMapper;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

/**
 * Second try:
 * - converts ClinicalDocument object into an XML String
 * - pretty formatting disabled as it multiplicates blank lines during unmarshal->marshal->unmarshal->marshal and makes it harder to tests
 */
public class Try02 {

    public String clinicalDocumentToXmlString(ClinicalDocument clinicalDocument, boolean pretty) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // To format XML
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.valueOf(pretty));

        //as we cannot control source code and put XmlRootElement over it we need to instruct JAXB to handle that
        // actually through xjb and annox we could apply XmlRootElement to ClinicalDocument
        // however now ClinicalDocument is of namespace extPl not urn:hl7-org:v3 with extension
        // what can be wrong
        JAXBElement<ClinicalDocument> jaxbElement =
                new JAXBElement<>(new QName("urn:hl7-org:v3", "ClinicalDocument"),
                        ClinicalDocument.class,
                        clinicalDocument);

        jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new MyNamespaceMapper());

        jaxbMarshaller.setProperty("com.sun.xml.bind.xmlHeaders", "<?xml-stylesheet href=\"CDA_PL_IG_1.3.1.xsl\" type=\"text/xsl\"?>");

        StringWriter writer = new StringWriter();
        jaxbMarshaller.marshal(jaxbElement, writer);
        return writer.toString();
    }
}
