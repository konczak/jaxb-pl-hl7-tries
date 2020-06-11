
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Note: because this type is defined as an extension of SXCM_T,
 *             all of the attributes and elements accepted for T are also
 *             accepted by this definition.  However, they are NOT allowed
 *             by the normative description of this type.  Unfortunately,
 *             we cannot write a general purpose schematron contraints to
 *             provide that extra validation, thus applications must be
 *             aware that instance (fragments) that pass validation with
 *             this might might still not be legal.
 *          
 * 
 * <p>Java class for PIVL_PPD_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVL_PPD_TS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}SXCM_PPD_TS"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase" type="{urn:ihe:pharm}IVL_PPD_TS" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{urn:ihe:pharm}PPD_PQ" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alignment" type="{urn:ihe:pharm}CalendarCycle" /&gt;
 *       &lt;attribute name="institutionSpecified" type="{urn:ihe:pharm}bl" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVL_PPD_TS", propOrder = {
    "phase",
    "period"
})
public class PIVLPPDTS
    extends SXCMPPDTS
{

    protected IVLPPDTS phase;
    protected PPDPQ period;
    @XmlAttribute(name = "alignment")
    protected List<String> alignments;
    @XmlAttribute(name = "institutionSpecified")
    protected Boolean institutionSpecified;

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link IVLPPDTS }
     *     
     */
    public IVLPPDTS getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLPPDTS }
     *     
     */
    public void setPhase(IVLPPDTS value) {
        this.phase = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PPDPQ }
     *     
     */
    public PPDPQ getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPDPQ }
     *     
     */
    public void setPeriod(PPDPQ value) {
        this.period = value;
    }

    /**
     * Gets the value of the alignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlignments() {
        if (alignments == null) {
            alignments = new ArrayList<String>();
        }
        return this.alignments;
    }

    /**
     * Gets the value of the institutionSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstitutionSpecified() {
        if (institutionSpecified == null) {
            return false;
        } else {
            return institutionSpecified;
        }
    }

    /**
     * Sets the value of the institutionSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstitutionSpecified(Boolean value) {
        this.institutionSpecified = value;
    }

}
