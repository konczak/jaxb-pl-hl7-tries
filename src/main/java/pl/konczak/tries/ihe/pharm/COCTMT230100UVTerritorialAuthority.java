
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
 * <p>Java class for COCT_MT230100UV.TerritorialAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.TerritorialAuthority"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="territory" type="{urn:ihe:pharm}COCT_MT230100UV.Agency" minOccurs="0"/&gt;
 *         &lt;element name="governingCountry" type="{urn:ihe:pharm}COCT_MT230100UV.Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:ihe:pharm}RoleClassTerritoryOfAuthority" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.TerritorialAuthority", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "territory",
    "governingCountry"
})
public class COCTMT230100UVTerritorialAuthority {

    @XmlElement(name = "realmCode", namespace = "urn:hl7-org:v3")
    protected List<CS> realmCodes;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected AllInfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId", namespace = "urn:hl7-org:v3")
    protected List<AllInfrastructureRootTemplateId> templateIds;
    @XmlElementRef(name = "territory", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVAgency> territory;
    @XmlElementRef(name = "governingCountry", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    protected JAXBElement<COCTMT230100UVCountry> governingCountry;
    @XmlAttribute(name = "classCode", required = true)
    protected RoleClassTerritoryOfAuthority classCode;

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
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVAgency> getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}
     *     
     */
    public void setTerritory(JAXBElement<COCTMT230100UVAgency> value) {
        this.territory = value;
    }

    /**
     * Gets the value of the governingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}
     *     
     */
    public JAXBElement<COCTMT230100UVCountry> getGoverningCountry() {
        return governingCountry;
    }

    /**
     * Sets the value of the governingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}
     *     
     */
    public void setGoverningCountry(JAXBElement<COCTMT230100UVCountry> value) {
        this.governingCountry = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClassTerritoryOfAuthority }
     *     
     */
    public RoleClassTerritoryOfAuthority getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClassTerritoryOfAuthority }
     *     
     */
    public void setClassCode(RoleClassTerritoryOfAuthority value) {
        this.classCode = value;
    }

}
