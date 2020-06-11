
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A telephone number (voice or fax), e-mail address, or
 *             other locator for a resource (information or service)
 *             mediated by telecommunication equipment. The address
 *             is specified as a Universal Resource Locator (URL)
 *             qualified by time specification and use codes that help
 *             in deciding which address to use for a given time and
 *             purpose.
 *          
 * 
 * <p>Java class for TEL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}URL"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useablePeriod" type="{urn:hl7-org:v3}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{urn:hl7-org:v3}set_TelecommunicationAddressUse" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEL", propOrder = {
    "useablePeriods"
})
public class TEL
    extends URL
{

    @XmlElement(name = "useablePeriod")
    protected List<SXCMTS> useablePeriods;
    @XmlAttribute(name = "use")
    protected List<String> uses;

    /**
     * Gets the value of the useablePeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useablePeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseablePeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SXCMTS }
     * 
     * 
     */
    public List<SXCMTS> getUseablePeriods() {
        if (useablePeriods == null) {
            useablePeriods = new ArrayList<SXCMTS>();
        }
        return this.useablePeriods;
    }

    /**
     * Gets the value of the uses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUses() {
        if (uses == null) {
            uses = new ArrayList<String>();
        }
        return this.uses;
    }

}
