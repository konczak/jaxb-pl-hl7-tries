
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
 * <p>Java class for COCT_MT230100UV.PackagedMedicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.PackagedMedicine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:ihe:pharm}II" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:ihe:pharm}TN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="formCode" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="lotNumberText" type="{urn:ihe:pharm}ST" minOccurs="0"/&gt;
 *         &lt;element name="capacityQuantity" type="{urn:ihe:pharm}PQ" minOccurs="0"/&gt;
 *         &lt;element name="capTypeCode" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="asManufacturedProduct" type="{urn:ihe:pharm}COCT_MT230100UV.ManufacturedProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asSuperContent" type="{urn:ihe:pharm}COCT_MT230100UV.SuperContent" minOccurs="0"/&gt;
 *         &lt;element name="subContent" type="{urn:ihe:pharm}COCT_MT230100UV.SubContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:ihe:pharm}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:ihe:pharm}EntityClassContainer" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:ihe:pharm}EntityDeterminer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.PackagedMedicine", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "id",
    "code",
    "names",
    "formCode",
    "lotNumberText",
    "capacityQuantity",
    "capTypeCode",
    "asManufacturedProducts",
    "asSuperContent",
    "subContent"
})
public class COCTMT230100UVPackagedMedicine {

    @XmlElement(name = "realmCode", namespace = "urn:hl7-org:v3")
    protected List<CS> realmCodes;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected AllInfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId", namespace = "urn:hl7-org:v3")
    protected List<AllInfrastructureRootTemplateId> templateIds;
    protected Id id;
    protected CE code;
    @XmlElement(name = "name")
    protected List<TN> names;
    protected CE formCode;
    protected ST lotNumberText;
    protected PQ capacityQuantity;
    protected CE capTypeCode;
    @XmlElement(name = "asManufacturedProduct", nillable = true)
    protected List<COCTMT230100UVManufacturedProduct> asManufacturedProducts;
    @XmlElementRef(name = "asSuperContent", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSuperContent> asSuperContent;
    @XmlElementRef(name = "subContent", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVSubContent> subContent;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode", required = true)
    protected EntityClassContainer classCode;
    @XmlAttribute(name = "determinerCode", required = true)
    protected String determinerCode;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TN }
     * 
     * 
     */
    public List<TN> getNames() {
        if (names == null) {
            names = new ArrayList<TN>();
        }
        return this.names;
    }

    /**
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setFormCode(CE value) {
        this.formCode = value;
    }

    /**
     * Gets the value of the lotNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getLotNumberText() {
        return lotNumberText;
    }

    /**
     * Sets the value of the lotNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNumberText(ST value) {
        this.lotNumberText = value;
    }

    /**
     * Gets the value of the capacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     * Sets the value of the capacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setCapacityQuantity(PQ value) {
        this.capacityQuantity = value;
    }

    /**
     * Gets the value of the capTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCapTypeCode() {
        return capTypeCode;
    }

    /**
     * Sets the value of the capTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCapTypeCode(CE value) {
        this.capTypeCode = value;
    }

    /**
     * Gets the value of the asManufacturedProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asManufacturedProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsManufacturedProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVManufacturedProduct }
     * 
     * 
     */
    public List<COCTMT230100UVManufacturedProduct> getAsManufacturedProducts() {
        if (asManufacturedProducts == null) {
            asManufacturedProducts = new ArrayList<COCTMT230100UVManufacturedProduct>();
        }
        return this.asManufacturedProducts;
    }

    /**
     * Gets the value of the asSuperContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSuperContent> getAsSuperContent() {
        return asSuperContent;
    }

    /**
     * Sets the value of the asSuperContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}
     *     
     */
    public void setAsSuperContent(JAXBElement<COCTMT230100UVSuperContent> value) {
        this.asSuperContent = value;
    }

    /**
     * Gets the value of the subContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVSubContent> getSubContent() {
        return subContent;
    }

    /**
     * Sets the value of the subContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}
     *     
     */
    public void setSubContent(JAXBElement<COCTMT230100UVSubContent> value) {
        this.subContent = value;
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
     *     {@link EntityClassContainer }
     *     
     */
    public EntityClassContainer getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassContainer }
     *     
     */
    public void setClassCode(EntityClassContainer value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the determinerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminerCode() {
        return determinerCode;
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminerCode(String value) {
        this.determinerCode = value;
    }

}
