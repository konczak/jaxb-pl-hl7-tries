
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BoundedByParticipation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundedByParticipation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.csioz.gov.pl/xsd/extPL/r2}InfrastructureRoot"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reimbursementRelatedContract" type="{http://www.csioz.gov.pl/xsd/extPL/r2}ReimbursementRelatedContract"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}cs" fixed="PART" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundedByParticipation", propOrder = {
    "reimbursementRelatedContract"
})
public class BoundedByParticipation
    extends InfrastructureRoot
{

    @XmlElement(required = true)
    protected ReimbursementRelatedContract reimbursementRelatedContract;
    @XmlAttribute(name = "typeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;

    /**
     * Gets the value of the reimbursementRelatedContract property.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursementRelatedContract }
     *     
     */
    public ReimbursementRelatedContract getReimbursementRelatedContract() {
        return reimbursementRelatedContract;
    }

    /**
     * Sets the value of the reimbursementRelatedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursementRelatedContract }
     *     
     */
    public void setReimbursementRelatedContract(ReimbursementRelatedContract value) {
        this.reimbursementRelatedContract = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        if (typeCode == null) {
            return "PART";
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
