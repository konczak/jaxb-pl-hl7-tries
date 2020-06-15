package pl.konczak.jaxbplhl7tries.try10;

import net.sf.saxon.TransformerFactoryImpl;
import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;

/**
 * Ninth try:
 * - transforms ClinicalDocument with variables into HTML for printable info (XSL made by CSIOZ)
 * - it depends on Saxon as transformer implementation because default (Xalan) could not parse xsl file as contains too long sections
 * https://www.drillio.com/en/2009/java-encoded-string-too-long-64kb-limit/
 */
public class Try10 {

    public String transformClinicalDocumentToXmlStringOfPrintableInfo(final ClinicalDocument clinicalDocument,
                                                                      final String kluczPakietu,
                                                                      final String kodPakietu) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);

        // Create Transformer
        final TransformerFactoryImpl tf = new TransformerFactoryImpl();
        StreamSource xslt = new StreamSource(Constants.PROJECT_RESOURCES_PATH + "t10\\pl_informacja_o_receptach_1.3.1.xsl");
        Transformer transformer = tf.newTransformer(xslt);

        // 44 digits code like a unique bar code
        transformer.setParameter("kluczPakietu", kluczPakietu);
        // 4 digits code with paired with PESEL allows to buy e-prescription
        transformer.setParameter("kodPakietu", kodPakietu);

        // instead of generate SVG allows to fallback to image - however seems to produce different result
        transformer.setParameter("SVG", "enabled");

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
