
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The character string data type stands for text data,
 *             primarily intended for machine processing (e.g.,
 *             sorting, querying, indexing, etc.) Used for names,
 *             symbols, and formal expressions.
 *          
 * 
 * <p>Java class for ST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:ihe:pharm}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{urn:ihe:pharm}TEL" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="thumbnail" type="{urn:ihe:pharm}ED" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="representation" type="{urn:ihe:pharm}BinaryDataEncoding" fixed="TXT" /&gt;
 *       &lt;attribute name="mediaType" type="{urn:ihe:pharm}cs" fixed="text/plain" /&gt;
 *       &lt;attribute name="language" type="{urn:ihe:pharm}cs" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST")
@XmlSeeAlso({
    SC.class,
    ADXP.class,
    ENXP.class
})
public class ST
    extends ED
{


}
