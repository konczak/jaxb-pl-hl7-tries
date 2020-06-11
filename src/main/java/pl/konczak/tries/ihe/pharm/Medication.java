
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTemplateId;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTypeId;
import pl.konczak.tries.org.hl7.v3.CS;


/**
 * <p>Java class for COCT_MT230100UV.Medication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.Medication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="administerableMedicine" type="{urn:ihe:pharm}COCT_MT230100UV.Medicine"/&gt;
 *         &lt;element name="subjectOf1" type="{urn:ihe:pharm}COCT_MT230100UV.Subject2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf2" type="{urn:ihe:pharm}COCT_MT230100UV.Subject1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf3" type="{urn:ihe:pharm}COCT_MT230100UV.Subject22" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf4" type="{urn:ihe:pharm}COCT_MT230100UV.Subject3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subjectOf5" type="{urn:ihe:pharm}COCT_MT230100UV.Subject7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:ihe:pharm}RoleClassAdministerableMaterial" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.Medication", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "administerableMedicine",
    "subjectOf1S",
    "subjectOf2S",
    "subjectOf3S",
    "subjectOf4S",
    "subjectOf5"
})
@XmlRootElement(name = "medication")
public class Medication {

    @XmlElement(name = "realmCode", namespace = "urn:hl7-org:v3")
    protected List<CS> realmCodes;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected AllInfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId", namespace = "urn:hl7-org:v3")
    protected List<AllInfrastructureRootTemplateId> templateIds;
    @XmlElement(required = true)
    protected COCTMT230100UVMedicine administerableMedicine;
    @XmlElement(name = "subjectOf1", nillable = true)
    protected List<COCTMT230100UVSubject2> subjectOf1S;
    @XmlElement(name = "subjectOf2", nillable = true)
    protected List<COCTMT230100UVSubject1> subjectOf2S;
    @XmlElement(name = "subjectOf3", nillable = true)
    protected List<COCTMT230100UVSubject22> subjectOf3S;
    @XmlElement(name = "subjectOf4", nillable = true)
    protected List<COCTMT230100UVSubject3> subjectOf4S;
    @XmlElementRef(name = "subjectOf5", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSubject7> subjectOf5;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassAdministerableMaterial classCode;

    /**
     * Gets the value of the realmCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCodes() {
        if (realmCodes == null) {
            realmCodes = new ArrayList<CS>();
        }
        return this.realmCodes;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link AllInfrastructureRootTypeId }
     *     
     */
    public AllInfrastructureRootTypeId getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllInfrastructureRootTypeId }
     *     
     */
    public void setTypeId(AllInfrastructureRootTypeId value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllInfrastructureRootTemplateId }
     * 
     * 
     */
    public List<AllInfrastructureRootTemplateId> getTemplateIds() {
        if (templateIds == null) {
            templateIds = new ArrayList<AllInfrastructureRootTemplateId>();
        }
        return this.templateIds;
    }

    /**
     * Gets the value of the administerableMedicine property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT230100UVMedicine }
     *     
     */
    public COCTMT230100UVMedicine getAdministerableMedicine() {
        return administerableMedicine;
    }

    /**
     * Sets the value of the administerableMedicine property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT230100UVMedicine }
     *     
     */
    public void setAdministerableMedicine(COCTMT230100UVMedicine value) {
        this.administerableMedicine = value;
    }

    /**
     * Gets the value of the subjectOf1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSubject2 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject2> getSubjectOf1s() {
        if (subjectOf1S == null) {
            subjectOf1S = new ArrayList<COCTMT230100UVSubject2>();
        }
        return this.subjectOf1S;
    }

    /**
     * Gets the value of the subjectOf2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSubject1 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject1> getSubjectOf2s() {
        if (subjectOf2S == null) {
            subjectOf2S = new ArrayList<COCTMT230100UVSubject1>();
        }
        return this.subjectOf2S;
    }

    /**
     * Gets the value of the subjectOf3S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf3S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf3s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSubject22 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject22> getSubjectOf3s() {
        if (subjectOf3S == null) {
            subjectOf3S = new ArrayList<COCTMT230100UVSubject22>();
        }
        return this.subjectOf3S;
    }

    /**
     * Gets the value of the subjectOf4S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf4S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf4s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSubject3 }
     * 
     * 
     */
    public List<COCTMT230100UVSubject3> getSubjectOf4s() {
        if (subjectOf4S == null) {
            subjectOf4S = new ArrayList<COCTMT230100UVSubject3>();
        }
        return this.subjectOf4S;
    }

    /**
     * Gets the value of the subjectOf5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSubject7> getSubjectOf5() {
        return subjectOf5;
    }

    /**
     * Sets the value of the subjectOf5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}
     *     
     */
    public void setSubjectOf5(JAXBElement<COCTMT230100UVSubject7> value) {
        this.subjectOf5 = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public RoleClassAdministerableMaterial getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassAdministerableMaterial }
     *     
     */
    public void setClassCode(RoleClassAdministerableMaterial value) {
        this.classCode = value;
    }

}
