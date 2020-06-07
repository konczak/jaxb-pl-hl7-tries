
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Coded data, consists of a coded value (CV)
 *             and, optionally, coded value(s) from other coding systems
 *             that identify the same concept. Used when alternative
 *             codes may exist.
 *          
 * 
 * <p>Java class for CE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:hl7-org:v3}CD"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalText" type="{urn:hl7-org:v3}ED" minOccurs="0"/&gt;
 *         &lt;element name="qualifier" type="{urn:hl7-org:v3}CR" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="translation" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{urn:hl7-org:v3}cs" /&gt;
 *       &lt;attribute name="codeSystem" type="{urn:hl7-org:v3}uid" /&gt;
 *       &lt;attribute name="codeSystemName" type="{urn:hl7-org:v3}st" /&gt;
 *       &lt;attribute name="codeSystemVersion" type="{urn:hl7-org:v3}st" /&gt;
 *       &lt;attribute name="displayName" type="{urn:hl7-org:v3}st" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CE")
@XmlSeeAlso({
    CV.class,
    EIVLEvent.class,
    HXITCE.class
})
public class CE
    extends CD
{


}
