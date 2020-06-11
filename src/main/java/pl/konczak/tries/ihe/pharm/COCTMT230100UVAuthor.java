
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTemplateId;
import pl.konczak.tries.org.hl7.v3.AllInfrastructureRootTypeId;
import pl.konczak.tries.org.hl7.v3.CS;


/**
 * <p>Java class for COCT_MT230100UV.Author complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COCT_MT230100UV.Author"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/&gt;
 *         &lt;element name="time" type="{urn:ihe:pharm}TS" minOccurs="0"/&gt;
 *         &lt;element name="territorialAuthority" type="{urn:ihe:pharm}COCT_MT230100UV.TerritorialAuthority"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="typeCode" use="required" type="{urn:ihe:pharm}ParticipationAuthorOriginator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COCT_MT230100UV.Author", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "time",
    "territorialAuthority"
})
public class COCTMT230100UVAuthor {

    @XmlElement(name = "realmCode", namespace = "urn:hl7-org:v3")
    protected List<CS> realmCodes;
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected AllInfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId", namespace = "urn:hl7-org:v3")
    protected List<AllInfrastructureRootTemplateId> templateIds;
    protected TS time;
    @XmlElement(required = true)
    protected COCTMT230100UVTerritorialAuthority territorialAuthority;
    @XmlAttribute(name = "typeCode", required = true)
    protected ParticipationAuthorOriginator typeCode;

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
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setTime(TS value) {
        this.time = value;
    }

    /**
     * Gets the value of the territorialAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link COCTMT230100UVTerritorialAuthority }
     *     
     */
    public COCTMT230100UVTerritorialAuthority getTerritorialAuthority() {
        return territorialAuthority;
    }

    /**
     * Sets the value of the territorialAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCTMT230100UVTerritorialAuthority }
     *     
     */
    public void setTerritorialAuthority(COCTMT230100UVTerritorialAuthority value) {
        this.territorialAuthority = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationAuthorOriginator }
     *     
     */
    public ParticipationAuthorOriginator getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationAuthorOriginator }
     *     
     */
    public void setTypeCode(ParticipationAuthorOriginator value) {
        this.typeCode = value;
    }

}
