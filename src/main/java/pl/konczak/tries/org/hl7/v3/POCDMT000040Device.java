
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040.Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Device"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="manufacturerModelName" type="{urn:hl7-org:v3}SC" minOccurs="0"/&gt;
 *         &lt;element name="softwareName" type="{urn:hl7-org:v3}SC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClassDevice" default="DEV" /&gt;
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminer" fixed="INSTANCE" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Device", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "code",
    "manufacturerModelName",
    "softwareName"
})
public class POCDMT000040Device {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    protected CE code;
    protected SC manufacturerModelName;
    protected SC softwareName;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode")
    protected EntityClassDevice classCode;
    @XmlAttribute(name = "determinerCode")
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
     * Gets the value of the manufacturerModelName property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getManufacturerModelName() {
        return manufacturerModelName;
    }

    /**
     * Sets the value of the manufacturerModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setManufacturerModelName(SC value) {
        this.manufacturerModelName = value;
    }

    /**
     * Gets the value of the softwareName property.
     * 
     * @return
     *     possible object is
     *     {@link SC }
     *     
     */
    public SC getSoftwareName() {
        return softwareName;
    }

    /**
     * Sets the value of the softwareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SC }
     *     
     */
    public void setSoftwareName(SC value) {
        this.softwareName = value;
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
     *     {@link EntityClassDevice }
     *     
     */
    public EntityClassDevice getClassCode() {
        if (classCode == null) {
            return EntityClassDevice.DEV;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityClassDevice }
     *     
     */
    public void setClassCode(EntityClassDevice value) {
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
        if (determinerCode == null) {
            return "INSTANCE";
        } else {
            return determinerCode;
        }
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
