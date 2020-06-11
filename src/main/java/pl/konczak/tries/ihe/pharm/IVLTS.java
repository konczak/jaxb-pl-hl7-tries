
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}SXCM_TS"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="low" type="{urn:ihe:pharm}IVXB_TS"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="width" type="{urn:ihe:pharm}PQ" minOccurs="0"/&gt;
 *             &lt;element name="high" type="{urn:ihe:pharm}IVXB_TS" minOccurs="0"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="high" type="{urn:ihe:pharm}IVXB_TS"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="width" type="{urn:ihe:pharm}PQ"/&gt;
 *           &lt;element name="high" type="{urn:ihe:pharm}IVXB_TS" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="center" type="{urn:ihe:pharm}TS"/&gt;
 *           &lt;element name="width" type="{urn:ihe:pharm}PQ" minOccurs="0"/&gt;
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
@XmlType(name = "IVL_TS", propOrder = {
    "center",
    "low",
    "width",
    "high"
})
public class IVLTS
    extends SXCMTS
{

    protected TS center;
    protected IVXBTS low;
    protected PQ width;
    protected IVXBTS high;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCenter(TS value) {
        this.center = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link IVXBTS }
     *     
     */
    public IVXBTS getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBTS }
     *     
     */
    public void setLow(IVXBTS value) {
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
     *     {@link IVXBTS }
     *     
     */
    public IVXBTS getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVXBTS }
     *     
     */
    public void setHigh(IVXBTS value) {
        this.high = value;
    }

}
