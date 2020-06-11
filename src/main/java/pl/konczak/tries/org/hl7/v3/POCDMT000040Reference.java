
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040.Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="seperatableInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="externalAct" type="{urn:hl7-org:v3}POCD_MT000040.ExternalAct"/&gt;
 *           &lt;element name="externalObservation" type="{urn:hl7-org:v3}POCD_MT000040.ExternalObservation"/&gt;
 *           &lt;element name="externalProcedure" type="{urn:hl7-org:v3}POCD_MT000040.ExternalProcedure"/&gt;
 *           &lt;element name="externalDocument" type="{urn:hl7-org:v3}POCD_MT000040.ExternalDocument"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" use="required" type="{urn:hl7-org:v3}x_ActRelationshipExternalReference" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Reference", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "seperatableInd",
    "externalDocument",
    "externalProcedure",
    "externalObservation",
    "externalAct"
})
public class POCDMT000040Reference {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    protected BL seperatableInd;
    protected POCDMT000040ExternalDocument externalDocument;
    protected POCDMT000040ExternalProcedure externalProcedure;
    protected POCDMT000040ExternalObservation externalObservation;
    protected POCDMT000040ExternalAct externalAct;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "typeCode", required = true)
    protected XActRelationshipExternalReference typeCode;

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
     * Gets the value of the seperatableInd property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getSeperatableInd() {
        return seperatableInd;
    }

    /**
     * Sets the value of the seperatableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setSeperatableInd(BL value) {
        this.seperatableInd = value;
    }

    /**
     * Gets the value of the externalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalDocument }
     *     
     */
    public POCDMT000040ExternalDocument getExternalDocument() {
        return externalDocument;
    }

    /**
     * Sets the value of the externalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalDocument }
     *     
     */
    public void setExternalDocument(POCDMT000040ExternalDocument value) {
        this.externalDocument = value;
    }

    /**
     * Gets the value of the externalProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalProcedure }
     *     
     */
    public POCDMT000040ExternalProcedure getExternalProcedure() {
        return externalProcedure;
    }

    /**
     * Sets the value of the externalProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalProcedure }
     *     
     */
    public void setExternalProcedure(POCDMT000040ExternalProcedure value) {
        this.externalProcedure = value;
    }

    /**
     * Gets the value of the externalObservation property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalObservation }
     *     
     */
    public POCDMT000040ExternalObservation getExternalObservation() {
        return externalObservation;
    }

    /**
     * Sets the value of the externalObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalObservation }
     *     
     */
    public void setExternalObservation(POCDMT000040ExternalObservation value) {
        this.externalObservation = value;
    }

    /**
     * Gets the value of the externalAct property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040ExternalAct }
     *     
     */
    public POCDMT000040ExternalAct getExternalAct() {
        return externalAct;
    }

    /**
     * Sets the value of the externalAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ExternalAct }
     *     
     */
    public void setExternalAct(POCDMT000040ExternalAct value) {
        this.externalAct = value;
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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link XActRelationshipExternalReference }
     *     
     */
    public XActRelationshipExternalReference getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link XActRelationshipExternalReference }
     *     
     */
    public void setTypeCode(XActRelationshipExternalReference value) {
        this.typeCode = value;
    }

}
