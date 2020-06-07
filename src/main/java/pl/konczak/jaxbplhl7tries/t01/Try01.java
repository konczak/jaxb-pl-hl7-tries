package pl.konczak.jaxbplhl7tries.t01;

import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * First try:
 * - read file with XML content
 * - unmarshall it into PL variant of ClinicalDocument
 */
public class Try01 {

    public ClinicalDocument unmarshallFileToClinicalDocument(final String filePath) throws Exception {
        final Path path = Paths.get(filePath);
        final StreamSource streamSource = new StreamSource(path.toFile());

        JAXBContext jaxbContext = JAXBContext.newInstance(ClinicalDocument.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        JAXBElement jaxbElement = (JAXBElement) unmarshaller.unmarshal(streamSource);
        return ((ClinicalDocument) jaxbElement.getValue());

    }
}
