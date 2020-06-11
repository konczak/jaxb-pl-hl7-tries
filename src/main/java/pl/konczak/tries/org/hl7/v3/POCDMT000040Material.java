
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVContent;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVDistributedProduct;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVIngredient;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVMedicineManufacturer;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVPart;
import pl.konczak.tries.ihe.pharm.COCTMT230100UVSpecializedKind;
import pl.konczak.tries.ihe.pharm.ED;
import pl.konczak.tries.ihe.pharm.IVLTS;


/**
 * <p>Java class for POCD_MT000040.Material complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Material"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}riskCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}handlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}formCode" minOccurs="0"/&gt;
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}expirationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}stabilityTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}asDistributedProduct" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}asMedicineManufacturer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}asContent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}asSpecializedKind" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ihe:pharm}ingredient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClassManufacturedMaterial" fixed="MMAT" /&gt;
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminerDetermined" fixed="KIND" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Material", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "code",
    "name",
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
public class POCDMT000040Material {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    protected pl.konczak.tries.org.hl7.v3.CE code;
    protected EN name;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected ED desc;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected pl.konczak.tries.ihe.pharm.CE riskCode;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected pl.konczak.tries.ihe.pharm.CE handlingCode;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected pl.konczak.tries.ihe.pharm.CE formCode;
    protected ST lotNumberText;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected IVLTS expirationTime;
    @XmlElement(namespace = "urn:ihe:pharm")
    protected IVLTS stabilityTime;
    @XmlElement(name = "asDistributedProduct", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVDistributedProduct> asDistributedProducts;
    @XmlElement(name = "asMedicineManufacturer", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVMedicineManufacturer> asMedicineManufacturers;
    @XmlElement(namespace = "urn:ihe:pharm", nillable = false)
    protected COCTMT230100UVContent asContent;
    @XmlElement(name = "asSpecializedKind", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVSpecializedKind> asSpecializedKinds;
    @XmlElement(name = "part", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVPart> parts;
    @XmlElement(name = "ingredient", namespace = "urn:ihe:pharm", nillable = true)
    protected List<COCTMT230100UVIngredient> ingredients;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode")
    protected String classCode;
    @XmlAttribute(name = "determinerCode")
    protected EntityDeterminerDetermined determinerCode;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link pl.konczak.tries.org.hl7.v3.CE }
     *     
     */
    public pl.konczak.tries.org.hl7.v3.CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.konczak.tries.org.hl7.v3.CE }
     *     
     */
    public void setCode(pl.konczak.tries.org.hl7.v3.CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EN }
     *     
     */
    public EN getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EN }
     *     
     */
    public void setName(EN value) {
        this.name = value;
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
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public pl.konczak.tries.ihe.pharm.CE getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public void setRiskCode(pl.konczak.tries.ihe.pharm.CE value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public pl.konczak.tries.ihe.pharm.CE getHandlingCode() {
        return handlingCode;
    }

    /**
     * Sets the value of the handlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public void setHandlingCode(pl.konczak.tries.ihe.pharm.CE value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the formCode property.
     * 
     * @return
     *     possible object is
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public pl.konczak.tries.ihe.pharm.CE getFormCode() {
        return formCode;
    }

    /**
     * Sets the value of the formCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link pl.konczak.tries.ihe.pharm.CE }
     *     
     */
    public void setFormCode(pl.konczak.tries.ihe.pharm.CE value) {
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
     *     {@link COCTMT230100UVContent }
     *     
     */
    public COCTMT230100UVContent getAsContent() {
        return asContent;
    }

    /**
     * Sets the value of the asContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT230100UVContent }
     *     
     */
    public void setAsContent(COCTMT230100UVContent value) {
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
        if (classCode == null) {
            return "MMAT";
        } else {
            return classCode;
        }
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
     *     {@link EntityDeterminerDetermined }
     *     
     */
    public EntityDeterminerDetermined getDeterminerCode() {
        if (determinerCode == null) {
            return EntityDeterminerDetermined.KIND;
        } else {
            return determinerCode;
        }
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDeterminerDetermined }
     *     
     */
    public void setDeterminerCode(EntityDeterminerDetermined value) {
        this.determinerCode = value;
    }

}
