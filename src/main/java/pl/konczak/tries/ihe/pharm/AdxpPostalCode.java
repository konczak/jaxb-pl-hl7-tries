
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adxp.postalCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adxp.postalCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{urn:ihe:pharm}ADXP"&gt;
 *       &lt;attribute name="partType" type="{urn:ihe:pharm}AddressPartType" fixed="ZIP" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adxp.postalCode")
public class AdxpPostalCode
    extends ADXP
{


}
