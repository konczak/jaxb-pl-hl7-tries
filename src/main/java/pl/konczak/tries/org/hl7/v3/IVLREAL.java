
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_REAL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_REAL"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_REAL"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{urn:hl7-org:v3}REAL" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}REAL"/&gt;
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_REAL" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{urn:hl7-org:v3}REAL"/&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}REAL" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_REAL", propOrder = {
    "center",
    "low",
    "width",
    "high"
})
public class IVLREAL
    extends SXCMREAL
{

    protected REAL center;
    protected IVXBREAL low;
    protected REAL width;
    protected IVXBREAL high;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link REAL }
     *     
     */
    public REAL getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link REAL }
     *     
     */
    public void setCenter(REAL value) {
        this.center = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBREAL }
     *     
     */
    public IVXBREAL getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBREAL }
     *     
     */
    public void setLow(IVXBREAL value) {
        this.low = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link REAL }
     *     
     */
    public REAL getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link REAL }
     *     
     */
    public void setWidth(REAL value) {
        this.width = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBREAL }
     *     
     */
    public IVXBREAL getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBREAL }
     *     
     */
    public void setHigh(IVXBREAL value) {
        this.high = value;
    }

}
