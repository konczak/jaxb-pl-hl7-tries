
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSubject1;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSubject2;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSubject22;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSubject3;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSubject7;


/**
 * <p>Java class for POCD_MT000040.ManufacturedProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.ManufacturedProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="manufacturedLabeledDrug" type="{urn:hl7-org:v3}POCD_MT000040.LabeledDrug"/&gt;
 *           &lt;element name="manufacturedMaterial" type="{urn:hl7-org:v3}POCD_MT000040.Material"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="manufacturerOrganization" type="{urn:hl7-org:v3}POCD_MT000040.Organization" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}subjectOf1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}subjectOf2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}subjectOf3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}subjectOf4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}subjectOf5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClassManufacturedProduct" fixed="MANU" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.ManufacturedProduct", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "ids",
    "manufacturedMaterial",
    "manufacturedLabeledDrug",
    "manufacturerOrganization",
    "subjectOf1S",
    "subjectOf2S",
    "subjectOf3S",
    "subjectOf4S",
    "subjectOf5"
})
public class POCDMT000040ManufacturedProduct {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    @XmlElement(name = "id")
    protected List<II> ids;
    protected POCDMT000040Material manufacturedMaterial;
    protected POCDMT000040LabeledDrug manufacturedLabeledDrug;
    protected POCDMT000040Organization manufacturerOrganization;
    @XmlElement(name = "subjectOf1", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVSubject2> subjectOf1S;
    @XmlElement(name = "subjectOf2", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVSubject1> subjectOf2S;
    @XmlElement(name = "subjectOf3", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVSubject22> subjectOf3S;
    @XmlElement(name = "subjectOf4", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVSubject3> subjectOf4S;
    @XmlElement(namespace = "urn:ihe:pharm", nillable = false)
    protected COCTMT230100UVSubject7 subjectOf5;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode")
    protected RoleClassManufacturedProduct classCode;

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
     *     {@link POCDMT000040InfrastructureRootTypeId }
     *     
     */
    public POCDMT000040InfrastructureRootTypeId getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040InfrastructureRootTypeId }
     *     
     */
    public void setTypeId(POCDMT000040InfrastructureRootTypeId value) {
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
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateIds() {
        if (templateIds == null) {
            templateIds = new ArrayList<II>();
        }
        return this.templateIds;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getIds() {
        if (ids == null) {
            ids = new ArrayList<II>();
        }
        return this.ids;
    }

    /**
     * Gets the value of the manufacturedMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Material }
     *     
     */
    public POCDMT000040Material getManufacturedMaterial() {
        return manufacturedMaterial;
    }

    /**
     * Sets the value of the manufacturedMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Material }
     *     
     */
    public void setManufacturedMaterial(POCDMT000040Material value) {
        this.manufacturedMaterial = value;
    }

    /**
     * Gets the value of the manufacturedLabeledDrug property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040LabeledDrug }
     *     
     */
    public POCDMT000040LabeledDrug getManufacturedLabeledDrug() {
        return manufacturedLabeledDrug;
    }

    /**
     * Sets the value of the manufacturedLabeledDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040LabeledDrug }
     *     
     */
    public void setManufacturedLabeledDrug(POCDMT000040LabeledDrug value) {
        this.manufacturedLabeledDrug = value;
    }

    /**
     * Gets the value of the manufacturerOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Organization }
     *     
     */
    public POCDMT000040Organization getManufacturerOrganization() {
        return manufacturerOrganization;
    }

    /**
     * Sets the value of the manufacturerOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Organization }
     *     
     */
    public void setManufacturerOrganization(POCDMT000040Organization value) {
        this.manufacturerOrganization = value;
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
     *     {@link COCTMT230100UVSubject7 }
     *     
     */
    public COCTMT230100UVSubject7 getSubjectOf5() {
        return subjectOf5;
    }

    /**
     * Sets the value of the subjectOf5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT230100UVSubject7 }
     *     
     */
    public void setSubjectOf5(COCTMT230100UVSubject7 value) {
        this.subjectOf5 = value;
    }

    /**
     * Gets the value of the nullFlavors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavors() {
        if (nullFlavors == null) {
            nullFlavors = new ArrayList<String>();
        }
        return this.nullFlavors;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public RoleClassManufacturedProduct getClassCode() {
        if (classCode == null) {
            return RoleClassManufacturedProduct.MANU;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassManufacturedProduct }
     *     
     */
    public void setClassCode(RoleClassManufacturedProduct value) {
        this.classCode = value;
    }

}
