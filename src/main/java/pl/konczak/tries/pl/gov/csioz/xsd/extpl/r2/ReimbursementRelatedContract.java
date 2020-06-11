
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.CD;
import pl.konczak.tries.org.hl7.v3.II;


/**
 * <p>Java class for ReimbursementRelatedContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReimbursementRelatedContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.csioz.gov.pl/xsd/extPL/r2}InfrastructureRoot"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD" minOccurs="0"/&gt;
 *         &lt;element name="bounding" type="{http://www.csioz.gov.pl/xsd/extPL/r2}BoundingParticipation"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}ActClass" fixed="CNTRCT" /&gt;
 *       &lt;attribute name="moodCode" use="required" type="{urn:hl7-org:v3}ActMood" fixed="EVN" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReimbursementRelatedContract", propOrder = {
    "id",
    "code",
    "bounding"
})
public class ReimbursementRelatedContract
    extends InfrastructureRoot
{

    @XmlElement(required = true)
    protected II id;
    protected CD code;
    @XmlElement(required = true)
    protected BoundingParticipation bounding;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCodes;
    @XmlAttribute(name = "moodCode", required = true)
    protected List<String> moodCodes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the bounding property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingParticipation }
     *     
     */
    public BoundingParticipation getBounding() {
        return bounding;
    }

    /**
     * Sets the value of the bounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingParticipation }
     *     
     */
    public void setBounding(BoundingParticipation value) {
        this.bounding = value;
    }

    /**
     * Gets the value of the classCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCodes() {
        if (classCodes == null) {
            classCodes = new ArrayList<String>();
        }
        return this.classCodes;
    }

    /**
     * Gets the value of the moodCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moodCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoodCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCodes() {
        if (moodCodes == null) {
            moodCodes = new ArrayList<String>();
        }
        return this.moodCodes;
    }

}
