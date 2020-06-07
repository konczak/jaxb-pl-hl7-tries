
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SXPR_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SXPR_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}SXCM_TS"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comp" type="{urn:ihe:pharm}SXCM_TS" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXPR_TS", propOrder = {
    "comps"
})
public class SXPRTS
    extends SXCMTS
{

    @XmlElement(name = "comp", required = true)
    protected List<SXCMTS> comps;

    /**
     * Gets the value of the comps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getComps() {
        if (comps == null) {
            comps = new ArrayList<SXCMTS>();
        }
        return this.comps;
    }

}
