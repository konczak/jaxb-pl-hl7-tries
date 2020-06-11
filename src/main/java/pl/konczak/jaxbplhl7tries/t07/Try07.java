package pl.konczak.jaxbplhl7tries.t07;

import pl.konczak.jaxbplhl7tries.t02.Try02;
import pl.konczak.jaxbplhl7tries.t04.Try04;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

/**
 * Seventh try:
 * - transform prepared ClinicalDocument instance into XML String with only narrative block,
 * - adjust transformed String to compliant unmarshalable XML,
 * - unmarshal String to new ClinicalDocument instance using indent less strategy,
 */
public class Try07 {

    private Try04 try04 = new Try04();

    public ClinicalDocument manuallyTransformClinicalDocumentToClinicalDocumentWithNarrativeBlockOnly(ClinicalDocument clinicalDocument)
            throws Exception {

        String transformedNarrativeBlock = try04.transformClinicalDocumentToXmlStringOfNarrativeBlock(clinicalDocument);

        String updatedNarrativeBlock = adjustProducedXmlStringToUnmarshalableOne(transformedNarrativeBlock);

        return this.unmarshallStringToClinicalDocument(updatedNarrativeBlock);
    }

    private String adjustProducedXmlStringToUnmarshalableOne(String narrativeBlock) {
        return narrativeBlock.replace("xmlns:hl7=\"urn:hl7-org:v3\"", "xmlns=\"urn:hl7-org:v3\" xsi:type=\"extPL:ClinicalDocument\"")
                .replace("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"", "")
                .replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "<?xml version=\"1.0\" encoding=\"UTF-8\"?><?xml-stylesheet href=\"CDA_PL_IG_1.3.1.xsl\" type=\"text/xsl\"?>");
    }

    private ClinicalDocument unmarshallStringToClinicalDocument(final String xml) throws Exception {
        final StreamSource streamSource = new StreamSource(new StringReader(xml));

        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);

        // https://stackoverflow.com/a/22310800/3997870
        XMLInputFactory xif = XMLInputFactory.newFactory();
        XMLStreamReader xsr = xif.createXMLStreamReader(streamSource);
        xsr = xif.createFilteredReader(xsr, reader -> reader.getEventType() == XMLStreamReader.CHARACTERS ? reader.getText().trim().length() > 0 : true);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        JAXBElement jaxbElement = (JAXBElement) unmarshaller.unmarshal(xsr);
        return ((ClinicalDocument) jaxbElement.getValue());
    }
}
