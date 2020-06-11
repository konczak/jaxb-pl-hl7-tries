
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_PQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PQ"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_PQ"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ"/&gt;
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{urn:hl7-org:v3}PQ"/&gt;
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/&gt;
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
@XmlType(name = "IVL_PQ", propOrder = {
    "center",
    "low",
    "width",
    "high"
})
@XmlSeeAlso({
    BXITIVLPQ.class
})
public class IVLPQ
    extends SXCMPQ
{

    protected PQ center;
    protected IVXBPQ low;
    protected PQ width;
    protected IVXBPQ high;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setCenter(PQ value) {
        this.center = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBPQ }
     *     
     */
    public IVXBPQ getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBPQ }
     *     
     */
    public void setLow(IVXBPQ value) {
        this.low = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setWidth(PQ value) {
        this.width = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBPQ }
     *     
     */
    public IVXBPQ getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBPQ }
     *     
     */
    public void setHigh(IVXBPQ value) {
        this.high = value;
    }

}
