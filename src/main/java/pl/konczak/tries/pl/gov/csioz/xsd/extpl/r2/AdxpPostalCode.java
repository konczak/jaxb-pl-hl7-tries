
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adxp.postalCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adxp.postalCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}adxp.postalCode"&gt;
 *       &lt;attribute name="postCity" type="{urn:hl7-org:v3}st" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adxp.postalCode")
public class AdxpPostalCode
    extends pl.konczak.tries.org.hl7.v3.AdxpPostalCode
{

    @XmlAttribute(name = "postCity")
    protected String postCity;

    /**
     * Gets the value of the postCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCity() {
        return postCity;
    }

    /**
     * Sets the value of the postCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCity(String value) {
        this.postCity = value;
    }

}
