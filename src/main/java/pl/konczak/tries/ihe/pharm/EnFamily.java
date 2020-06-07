
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for en.family complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="en.family"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:ihe:pharm}ENXP"&gt;
 *       &lt;attribute name="partType" type="{urn:ihe:pharm}EntityNamePartType" fixed="FAM" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "en.family")
public class EnFamily
    extends ENXP
{


}
