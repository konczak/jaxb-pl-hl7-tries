
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                      A thumbnail is an abbreviated rendition of the full
 *                      data. A thumbnail requires significantly fewer
 *                      resources than the full data, while still maintaining
 *                      some distinctive similarity with the full data. A
 *                      thumbnail is typically used with by-reference
 *                      encapsulated data. It allows a user to select data
 *                      more efficiently before actually downloading through
 *                      the reference.
 *                   
 * 
 * <p>Java class for thumbnail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="thumbnail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:ihe:pharm}ED"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{urn:ihe:pharm}TEL" minOccurs="0"/&gt;
 *         &lt;element name="thumbnail" type="{urn:ihe:pharm}thumbnail" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thumbnail")
public class Thumbnail
    extends ED
{


}
