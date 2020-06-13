package pl.konczak.jaxbplhl7tries.try09;

import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;

/**
 * Ninth try:
 * - transform ClinicalDocument to HTML String using delivered from CSIOZ transformation - which allows present e-recepta to m.d.
 * - note using it against ClinicalDocument without narrative block will still produce HTML but it will be incomplete!
 */
public class Try09 {

    public String transformClinicalDocumentToHtmlStringOfPresentation(final ClinicalDocument clinicalDocument) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);

        // Create Transformer
        TransformerFactory tf = TransformerFactory.newInstance();
        StreamSource xslt = new StreamSource(Constants.PROJECT_RESOURCES_PATH + "t09\\CDA_PL_IG_1.3.1.xsl");
        Transformer transformer = tf.newTransformer(xslt);

        // Source
        JAXBElement<ClinicalDocument> jaxbElement =
                new JAXBElement<>(new QName("urn:hl7-org:v3", "ClinicalDocument"),
                        ClinicalDocument.class,
                        clinicalDocument);
        JAXBSource source = new JAXBSource(jaxbContext, jaxbElement);

        StringWriter stringWriter = new StringWriter();
        StreamResult result = new StreamResult(stringWriter);
        transformer.transform(source, result);

        return stringWriter.toString();
    }
}
