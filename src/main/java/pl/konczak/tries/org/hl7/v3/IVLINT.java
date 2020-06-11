
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_INT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_INT"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_INT"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_INT" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_INT"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}INT"/&gt;
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_INT" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{urn:hl7-org:v3}INT"/&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
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
@XmlType(name = "IVL_INT", propOrder = {
    "center",
    "low",
    "width",
    "high"
})
public class IVLINT
    extends SXCMINT
{

    protected INT center;
    protected IVXBINT low;
    protected INT width;
    protected IVXBINT high;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setCenter(INT value) {
        this.center = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBINT }
     *     
     */
    public IVXBINT getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBINT }
     *     
     */
    public void setLow(IVXBINT value) {
        this.low = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setWidth(INT value) {
        this.width = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBINT }
     *     
     */
    public IVXBINT getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBINT }
     *     
     */
    public void setHigh(IVXBINT value) {
        this.high = value;
    }

}
