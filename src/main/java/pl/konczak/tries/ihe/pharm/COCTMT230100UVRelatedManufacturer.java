
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTemplateId;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTypeId;
import pl.konczak.tries.org.hl7.v3.CS;


/**
 * <p>Java class for COCT_MT230100UV.RelatedManufacturer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.RelatedManufacturer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:ihe:pharm}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="representedManufacturer" type="{urn:ihe:pharm}COCT_MT230100UV.Manufacturer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:ihe:pharm}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:ihe:pharm}RoleClassAssignedEntity" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.RelatedManufacturer", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "ids",
    "representedManufacturer"
})
public class COCTMT230100UVRelatedManufacturer {

    @XmlElement(name = "realmCode", namespace = "urn:hl7-org:v3")
    protected List<CS> realmCodes;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected AllInfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId", namespace = "urn:hl7-org:v3")
    protected List<AllInfrastructureRootTemplateId> templateIds;
    @XmlElement(name = "id")
    protected List<Id> ids;
    @XmlElementRef(name = "representedManufacturer", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVManufacturer> representedManufacturer;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;

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
     * {@link Id }
     * 
     * 
     */
    public List<Id> getIds() {
        if (ids == null) {
            ids = new ArrayList<Id>();
        }
        return this.ids;
    }

    /**
     * Gets the value of the representedManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVManufacturer> getRepresentedManufacturer() {
        return representedManufacturer;
    }

    /**
     * Sets the value of the representedManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}
     *     
     */
    public void setRepresentedManufacturer(JAXBElement<COCTMT230100UVManufacturer> value) {
        this.representedManufacturer = value;
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
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

}
