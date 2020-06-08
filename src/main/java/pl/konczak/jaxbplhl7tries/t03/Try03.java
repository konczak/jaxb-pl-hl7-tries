package pl.konczak.jaxbplhl7tries.t03;

import pl.konczak.jaxbplhl7tries.util.Constants;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;

/**
 * Third try:
 * - use delivered from CSIOZ transformation XML -> XML which produces narrative block section automatically for consistency purpose
 * - transformation produces String with output XML content
 */
public class Try03 {

    public String transformXmlFileOfClinicalDocumentToXmlStringOfNarrativeBlock(final String file) throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance();
        StreamSource xslt = new StreamSource(Constants.PROJECT_RESOURCES_PATH + "t03\\CDA_PL_PRE_NB_IG_1.3.1.xsl");
        Transformer transformer = tf.newTransformer(xslt);

        StringWriter stringWriter = new StringWriter();
        StreamResult result = new StreamResult(stringWriter);
        transformer.transform(new StreamSource(file), result);

        return stringWriter.toString();
    }
}
