
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
 * <p>Java class for COCT_MT230100UV.Medicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.Medicine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="id" type="{urn:ihe:pharm}II" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:ihe:pharm}TN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{urn:ihe:pharm}ED" minOccurs="0"/&gt;
 *         &lt;element name="riskCode" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="handlingCode" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="formCode" type="{urn:ihe:pharm}CE" minOccurs="0"/&gt;
 *         &lt;element name="lotNumberText" type="{urn:ihe:pharm}ST" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{urn:ihe:pharm}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="stabilityTime" type="{urn:ihe:pharm}IVL_TS" minOccurs="0"/&gt;
 *         &lt;element name="asDistributedProduct" type="{urn:ihe:pharm}COCT_MT230100UV.DistributedProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asMedicineManufacturer" type="{urn:ihe:pharm}COCT_MT230100UV.MedicineManufacturer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asContent" type="{urn:ihe:pharm}COCT_MT230100UV.Content" minOccurs="0"/&gt;
 *         &lt;element name="asSpecializedKind" type="{urn:ihe:pharm}COCT_MT230100UV.SpecializedKind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="part" type="{urn:ihe:pharm}COCT_MT230100UV.Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ingredient" type="{urn:ihe:pharm}COCT_MT230100UV.Ingredient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:ihe:pharm}EntityClassManufacturedMaterial" /&gt;
 *       &lt;attribute name="determinerCode" use="required" type="{urn:ihe:pharm}EntityDeterminer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.Medicine", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "id",
    "code",
    "names",
    "desc",
    "riskCode",
    "handlingCode",
    "formCode",
    "lotNumberText",
    "expirationTime",
    "stabilityTime",
    "asDistributedProducts",
    "asMedicineManufacturers",
    "asContent",
    "asSpecializedKinds",
    "parts",
    "ingredients"
})
public class COCTMT230100UVMedicine {

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
    protected ED desc;
    protected CE riskCode;
    protected CE handlingCode;
    protected CE formCode;
    protected ST lotNumberText;
    protected IVLTS expirationTime;
    protected IVLTS stabilityTime;
    @XmlElement(name = "asDistributedProduct", nillable = true)
    protected List<COCTMT230100UVDistributedProduct> asDistributedProducts;
    @XmlElement(name = "asMedicineManufacturer", nillable = true)
    protected List<COCTMT230100UVMedicineManufacturer> asMedicineManufacturers;
    @XmlElementRef(name = "asContent", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVContent> asContent;
    @XmlElement(name = "asSpecializedKind", nillable = true)
    protected List<COCTMT230100UVSpecializedKind> asSpecializedKinds;
    @XmlElement(name = "part", nillable = true)
    protected List<COCTMT230100UVPart> parts;
    @XmlElement(name = "ingredient", nillable = true)
    protected List<COCTMT230100UVIngredient> ingredients;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setDesc(ED value) {
        this.desc = value;
    }

    /**
     * Gets the value of the riskCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setRiskCode(CE value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getHandlingCode() {
        return handlingCode;
    }

    /**
     * Sets the value of the handlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setHandlingCode(CE value) {
        this.handlingCode = value;
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
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setExpirationTime(IVLTS value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the stabilityTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getStabilityTime() {
        return stabilityTime;
    }

    /**
     * Sets the value of the stabilityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setStabilityTime(IVLTS value) {
        this.stabilityTime = value;
    }

    /**
     * Gets the value of the asDistributedProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asDistributedProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsDistributedProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVDistributedProduct }
     * 
     * 
     */
    public List<COCTMT230100UVDistributedProduct> getAsDistributedProducts() {
        if (asDistributedProducts == null) {
            asDistributedProducts = new ArrayList<COCTMT230100UVDistributedProduct>();
        }
        return this.asDistributedProducts;
    }

    /**
     * Gets the value of the asMedicineManufacturers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asMedicineManufacturers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsMedicineManufacturers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVMedicineManufacturer }
     * 
     * 
     */
    public List<COCTMT230100UVMedicineManufacturer> getAsMedicineManufacturers() {
        if (asMedicineManufacturers == null) {
            asMedicineManufacturers = new ArrayList<COCTMT230100UVMedicineManufacturer>();
        }
        return this.asMedicineManufacturers;
    }

    /**
     * Gets the value of the asContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVContent> getAsContent() {
        return asContent;
    }

    /**
     * Sets the value of the asContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}
     *     
     */
    public void setAsContent(JAXBElement<COCTMT230100UVContent> value) {
        this.asContent = value;
    }

    /**
     * Gets the value of the asSpecializedKinds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asSpecializedKinds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsSpecializedKinds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVSpecializedKind }
     * 
     * 
     */
    public List<COCTMT230100UVSpecializedKind> getAsSpecializedKinds() {
        if (asSpecializedKinds == null) {
            asSpecializedKinds = new ArrayList<COCTMT230100UVSpecializedKind>();
        }
        return this.asSpecializedKinds;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVPart }
     * 
     * 
     */
    public List<COCTMT230100UVPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<COCTMT230100UVPart>();
        }
        return this.parts;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COCTMT230100UVIngredient }
     * 
     * 
     */
    public List<COCTMT230100UVIngredient> getIngredients() {
        if (ingredients == null) {
            ingredients = new ArrayList<COCTMT230100UVIngredient>();
        }
        return this.ingredients;
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
