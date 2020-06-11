
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Coded data, consists of a code, display name, code system,
 *             and original text. Used when a single code value must be sent.
 *          
 * 
 * <p>Java class for CV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:ihe:pharm}CE"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalText" type="{urn:ihe:pharm}ED" minOccurs="0"/&gt;
 *         &lt;element name="translation" type="{urn:ihe:pharm}CD" maxOccurs="0" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{urn:ihe:pharm}cs" /&gt;
 *       &lt;attribute name="codeSystem" type="{urn:ihe:pharm}uid" /&gt;
 *       &lt;attribute name="codeSystemName" type="{urn:ihe:pharm}st" /&gt;
 *       &lt;attribute name="codeSystemVersion" type="{urn:ihe:pharm}st" /&gt;
 *       &lt;attribute name="displayName" type="{urn:ihe:pharm}st" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CV")
@XmlSeeAlso({
    CS.class,
    CO.class,
    PQR.class
})
public class CV
    extends CE
{


}
