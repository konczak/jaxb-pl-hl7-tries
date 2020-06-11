package pl.konczak.jaxbplhl7tries.t06;

import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Sixth try:
 * - unmarshall XML file and do not put indents as objects to List's content
 */
public class Try06 {

    public ClinicalDocument unmarshallFileToClinicalDocumentAndSkipIndentsInMixedContent(final String filePath) throws Exception {
        final Path path = Paths.get(filePath);
        final StreamSource streamSource = new StreamSource(path.toFile());

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
