
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_PPD_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}SXCM_PPD_TS"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{urn:ihe:pharm}IVXB_PPD_TS"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{urn:ihe:pharm}PPD_PQ" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{urn:ihe:pharm}IVXB_PPD_TS" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{urn:ihe:pharm}IVXB_PPD_TS"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{urn:ihe:pharm}PPD_PQ"/&gt;
 *           &lt;element name="high" type="{urn:ihe:pharm}IVXB_PPD_TS" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{urn:ihe:pharm}PPD_TS"/&gt;
 *           &lt;element name="width" type="{urn:ihe:pharm}PPD_PQ" minOccurs="0"/&gt;
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
@XmlType(name = "IVL_PPD_TS", propOrder = {
    "center",
    "low",
    "width",
    "high"
})
public class IVLPPDTS
    extends SXCMPPDTS
{

    protected PPDTS center;
    protected IVXBPPDTS low;
    protected PPDPQ width;
    protected IVXBPPDTS high;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link PPDTS }
     *     
     */
    public PPDTS getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPDTS }
     *     
     */
    public void setCenter(PPDTS value) {
        this.center = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBPPDTS }
     *     
     */
    public IVXBPPDTS getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBPPDTS }
     *     
     */
    public void setLow(IVXBPPDTS value) {
        this.low = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link PPDPQ }
     *     
     */
    public PPDPQ getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPDPQ }
     *     
     */
    public void setWidth(PPDPQ value) {
        this.width = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBPPDTS }
     *     
     */
    public IVXBPPDTS getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBPPDTS }
     *     
     */
    public void setHigh(IVXBPPDTS value) {
        this.high = value;
    }

}
