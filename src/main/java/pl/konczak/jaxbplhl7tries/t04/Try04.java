package pl.konczak.jaxbplhl7tries.t04;

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
 * Fourth try:
 * - use as source ClinicalDocument instance and transform it into String representation using narrative block transformation
 */
public class Try04 {

    public String transformClinicalDocumentToXmlStringOfNarrativeBlock(final ClinicalDocument clinicalDocument) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);

        // Create Transformer
        TransformerFactory tf = TransformerFactory.newInstance();
        StreamSource xslt = new StreamSource(Constants.PROJECT_RESOURCES_PATH + "t04\\CDA_PL_PRE_NB_IG_1.3.1.xsl");
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
