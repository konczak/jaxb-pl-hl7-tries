
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POCD_MT000040.Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Subject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="awarenessCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/&gt;
 *         &lt;element name="relatedSubject" type="{urn:hl7-org:v3}POCD_MT000040.RelatedSubject"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ParticipationTargetSubject" fixed="SBJ" /&gt;
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" fixed="OP" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Subject", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "awarenessCode",
    "relatedSubject"
})
public class POCDMT000040Subject {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    protected CE awarenessCode;
    @XmlElement(required = true)
    protected POCDMT000040RelatedSubject relatedSubject;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "typeCode")
    protected ParticipationTargetSubject typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected String contextControlCode;

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
     * Gets the value of the awarenessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getAwarenessCode() {
        return awarenessCode;
    }

    /**
     * Sets the value of the awarenessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setAwarenessCode(CE value) {
        this.awarenessCode = value;
    }

    /**
     * Gets the value of the relatedSubject property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040RelatedSubject }
     *     
     */
    public POCDMT000040RelatedSubject getRelatedSubject() {
        return relatedSubject;
    }

    /**
     * Sets the value of the relatedSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040RelatedSubject }
     *     
     */
    public void setRelatedSubject(POCDMT000040RelatedSubject value) {
        this.relatedSubject = value;
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
     *     {@link ParticipationTargetSubject }
     *     
     */
    public ParticipationTargetSubject getTypeCode() {
        if (typeCode == null) {
            return ParticipationTargetSubject.SBJ;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationTargetSubject }
     *     
     */
    public void setTypeCode(ParticipationTargetSubject value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the contextControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextControlCode() {
        if (contextControlCode == null) {
            return "OP";
        } else {
            return contextControlCode;
        }
    }

    /**
     * Sets the value of the contextControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextControlCode(String value) {
        this.contextControlCode = value;
    }

}
