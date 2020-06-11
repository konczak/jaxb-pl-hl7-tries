package pl.konczak.jaxbplhl7tries.t05;

import pl.konczak.jaxbplhl7tries.util.Constants;
import pl.konczak.jaxbplhl7tries.util.MyNamespaceMapper;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBResult;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

/**
 * Fifth try:
 * - use as source ClinicalDocument instance and transform it into other ClinicalDocument instance using narrative block transformation
 */
public class Try05 {


    // it does not work,
    public ClinicalDocument transformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(final ClinicalDocument clinicalDocument) throws Exception {
        // Create Transformer
        TransformerFactory tf = TransformerFactory.newInstance();
        StreamSource xslt = new StreamSource(Constants.PROJECT_RESOURCES_PATH + "t05\\CDA_PL_PRE_NB_IG_1.3.1.xsl");

        Transformer transformer = tf.newTransformer(xslt);

        JAXBSource source = prepareJaxbSource(clinicalDocument);


        JAXBResult result = prepareJaxbResult();
        transformer.transform(source, result);

        Object output = result.getResult();
        return (ClinicalDocument) output;
    }

    private JAXBSource prepareJaxbSource(final ClinicalDocument clinicalDocument)  throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);
        final Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new MyNamespaceMapper());

        // Source
        JAXBElement<ClinicalDocument> jaxbElement =
                new JAXBElement<>(new QName("urn:hl7-org:v3", "ClinicalDocument"),
                        ClinicalDocument.class,
                        clinicalDocument);

        return new JAXBSource(jaxbContext, jaxbElement);
    }

    private JAXBResult prepareJaxbResult() throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Try05ObjectFactory.class, ObjectFactory.class, pl.konczak.tries.org.hl7.v3.ObjectFactory.class);

        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

        return new JAXBResult(unmarshaller);
    }

}
