
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2.ClinicalDocument;


/**
 * <p>Java class for POCD_MT000040.ClinicalDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.ClinicalDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId"/&gt;
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{urn:hl7-org:v3}II"/&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="title" type="{urn:hl7-org:v3}ST" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}TS"/&gt;
 *         &lt;element name="confidentialityCode" type="{urn:hl7-org:v3}CE"/&gt;
 *         &lt;element name="languageCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/&gt;
 *         &lt;element name="setId" type="{urn:hl7-org:v3}II" minOccurs="0"/&gt;
 *         &lt;element name="versionNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="copyTime" type="{urn:hl7-org:v3}TS" minOccurs="0"/&gt;
 *         &lt;element name="recordTarget" type="{urn:hl7-org:v3}POCD_MT000040.RecordTarget" maxOccurs="unbounded"/&gt;
 *         &lt;element name="author" type="{urn:hl7-org:v3}POCD_MT000040.Author" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dataEnterer" type="{urn:hl7-org:v3}POCD_MT000040.DataEnterer" minOccurs="0"/&gt;
 *         &lt;element name="informant" type="{urn:hl7-org:v3}POCD_MT000040.Informant12" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="custodian" type="{urn:hl7-org:v3}POCD_MT000040.Custodian"/&gt;
 *         &lt;element name="informationRecipient" type="{urn:hl7-org:v3}POCD_MT000040.InformationRecipient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legalAuthenticator" type="{urn:hl7-org:v3}POCD_MT000040.LegalAuthenticator" minOccurs="0"/&gt;
 *         &lt;element name="authenticator" type="{urn:hl7-org:v3}POCD_MT000040.Authenticator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="participant" type="{urn:hl7-org:v3}POCD_MT000040.Participant1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inFulfillmentOf" type="{urn:hl7-org:v3}POCD_MT000040.InFulfillmentOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="documentationOf" type="{urn:hl7-org:v3}POCD_MT000040.DocumentationOf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedDocument" type="{urn:hl7-org:v3}POCD_MT000040.RelatedDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authorization" type="{urn:hl7-org:v3}POCD_MT000040.Authorization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="componentOf" type="{urn:hl7-org:v3}POCD_MT000040.Component1" minOccurs="0"/&gt;
 *         &lt;element name="component" type="{urn:hl7-org:v3}POCD_MT000040.Component2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" /&gt;
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClinicalDocument" fixed="DOCCLIN" /&gt;
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.ClinicalDocument", propOrder = {
    "realmCodes",
    "typeId",
    "templateIds",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "setId",
    "versionNumber",
    "copyTime",
    "recordTargets",
    "authors",
    "dataEnterer",
    "informants",
    "custodian",
    "informationRecipients",
    "legalAuthenticator",
    "authenticators",
    "participants",
    "inFulfillmentOves",
    "documentationOves",
    "relatedDocuments",
    "authorizations",
    "componentOf",
    "component"
})
@XmlSeeAlso({
    ClinicalDocument.class
})
public class POCDMT000040ClinicalDocument {

    @XmlElement(name = "realmCode")
    protected List<CS> realmCodes;
    @XmlElement(required = true)
    protected POCDMT000040InfrastructureRootTypeId typeId;
    @XmlElement(name = "templateId")
    protected List<II> templateIds;
    @XmlElement(required = true)
    protected II id;
    @XmlElement(required = true)
    protected CE code;
    protected ST title;
    @XmlElement(required = true)
    protected TS effectiveTime;
    @XmlElement(required = true)
    protected CE confidentialityCode;
    protected CS languageCode;
    protected II setId;
    protected INT versionNumber;
    protected TS copyTime;
    @XmlElement(name = "recordTarget", required = true)
    protected List<POCDMT000040RecordTarget> recordTargets;
    @XmlElement(name = "author", required = true)
    protected List<POCDMT000040Author> authors;
    protected POCDMT000040DataEnterer dataEnterer;
    @XmlElement(name = "informant")
    protected List<POCDMT000040Informant12> informants;
    @XmlElement(required = true)
    protected POCDMT000040Custodian custodian;
    @XmlElement(name = "informationRecipient")
    protected List<POCDMT000040InformationRecipient> informationRecipients;
    protected POCDMT000040LegalAuthenticator legalAuthenticator;
    @XmlElement(name = "authenticator")
    protected List<POCDMT000040Authenticator> authenticators;
    @XmlElement(name = "participant")
    protected List<POCDMT000040Participant1> participants;
    @XmlElement(name = "inFulfillmentOf")
    protected List<POCDMT000040InFulfillmentOf> inFulfillmentOves;
    @XmlElement(name = "documentationOf")
    protected List<POCDMT000040DocumentationOf> documentationOves;
    @XmlElement(name = "relatedDocument")
    protected List<POCDMT000040RelatedDocument> relatedDocuments;
    @XmlElement(name = "authorization")
    protected List<POCDMT000040Authorization> authorizations;
    protected POCDMT000040Component1 componentOf;
    @XmlElement(required = true)
    protected POCDMT000040Component2 component;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavors;
    @XmlAttribute(name = "classCode")
    protected ActClinicalDocument classCode;
    @XmlAttribute(name = "moodCode")
    protected List<String> moodCodes;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTitle(ST value) {
        this.title = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setEffectiveTime(TS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the confidentialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getConfidentialityCode() {
        return confidentialityCode;
    }

    /**
     * Sets the value of the confidentialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setConfidentialityCode(CE value) {
        this.confidentialityCode = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setLanguageCode(CS value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setSetId(II value) {
        this.setId = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setVersionNumber(INT value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the copyTime property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getCopyTime() {
        return copyTime;
    }

    /**
     * Sets the value of the copyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setCopyTime(TS value) {
        this.copyTime = value;
    }

    /**
     * Gets the value of the recordTargets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTargets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040RecordTarget }
     * 
     * 
     */
    public List<POCDMT000040RecordTarget> getRecordTargets() {
        if (recordTargets == null) {
            recordTargets = new ArrayList<POCDMT000040RecordTarget>();
        }
        return this.recordTargets;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Author }
     * 
     * 
     */
    public List<POCDMT000040Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<POCDMT000040Author>();
        }
        return this.authors;
    }

    /**
     * Gets the value of the dataEnterer property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040DataEnterer }
     *     
     */
    public POCDMT000040DataEnterer getDataEnterer() {
        return dataEnterer;
    }

    /**
     * Sets the value of the dataEnterer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040DataEnterer }
     *     
     */
    public void setDataEnterer(POCDMT000040DataEnterer value) {
        this.dataEnterer = value;
    }

    /**
     * Gets the value of the informants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Informant12 }
     * 
     * 
     */
    public List<POCDMT000040Informant12> getInformants() {
        if (informants == null) {
            informants = new ArrayList<POCDMT000040Informant12>();
        }
        return this.informants;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Custodian }
     *     
     */
    public POCDMT000040Custodian getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Custodian }
     *     
     */
    public void setCustodian(POCDMT000040Custodian value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the informationRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040InformationRecipient }
     * 
     * 
     */
    public List<POCDMT000040InformationRecipient> getInformationRecipients() {
        if (informationRecipients == null) {
            informationRecipients = new ArrayList<POCDMT000040InformationRecipient>();
        }
        return this.informationRecipients;
    }

    /**
     * Gets the value of the legalAuthenticator property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040LegalAuthenticator }
     *     
     */
    public POCDMT000040LegalAuthenticator getLegalAuthenticator() {
        return legalAuthenticator;
    }

    /**
     * Sets the value of the legalAuthenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040LegalAuthenticator }
     *     
     */
    public void setLegalAuthenticator(POCDMT000040LegalAuthenticator value) {
        this.legalAuthenticator = value;
    }

    /**
     * Gets the value of the authenticators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Authenticator }
     * 
     * 
     */
    public List<POCDMT000040Authenticator> getAuthenticators() {
        if (authenticators == null) {
            authenticators = new ArrayList<POCDMT000040Authenticator>();
        }
        return this.authenticators;
    }

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Participant1 }
     * 
     * 
     */
    public List<POCDMT000040Participant1> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<POCDMT000040Participant1>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the inFulfillmentOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFulfillmentOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFulfillmentOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040InFulfillmentOf }
     * 
     * 
     */
    public List<POCDMT000040InFulfillmentOf> getInFulfillmentOves() {
        if (inFulfillmentOves == null) {
            inFulfillmentOves = new ArrayList<POCDMT000040InFulfillmentOf>();
        }
        return this.inFulfillmentOves;
    }

    /**
     * Gets the value of the documentationOves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentationOves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentationOves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040DocumentationOf }
     * 
     * 
     */
    public List<POCDMT000040DocumentationOf> getDocumentationOves() {
        if (documentationOves == null) {
            documentationOves = new ArrayList<POCDMT000040DocumentationOf>();
        }
        return this.documentationOves;
    }

    /**
     * Gets the value of the relatedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040RelatedDocument }
     * 
     * 
     */
    public List<POCDMT000040RelatedDocument> getRelatedDocuments() {
        if (relatedDocuments == null) {
            relatedDocuments = new ArrayList<POCDMT000040RelatedDocument>();
        }
        return this.relatedDocuments;
    }

    /**
     * Gets the value of the authorizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POCDMT000040Authorization }
     * 
     * 
     */
    public List<POCDMT000040Authorization> getAuthorizations() {
        if (authorizations == null) {
            authorizations = new ArrayList<POCDMT000040Authorization>();
        }
        return this.authorizations;
    }

    /**
     * Gets the value of the componentOf property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Component1 }
     *     
     */
    public POCDMT000040Component1 getComponentOf() {
        return componentOf;
    }

    /**
     * Sets the value of the componentOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Component1 }
     *     
     */
    public void setComponentOf(POCDMT000040Component1 value) {
        this.componentOf = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link POCDMT000040Component2 }
     *     
     */
    public POCDMT000040Component2 getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Component2 }
     *     
     */
    public void setComponent(POCDMT000040Component2 value) {
        this.component = value;
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
     *     {@link ActClinicalDocument }
     *     
     */
    public ActClinicalDocument getClassCode() {
        if (classCode == null) {
            return ActClinicalDocument.DOCCLIN;
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClinicalDocument }
     *     
     */
    public void setClassCode(ActClinicalDocument value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moodCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoodCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMoodCodes() {
        if (moodCodes == null) {
            moodCodes = new ArrayList<String>();
        }
        return this.moodCodes;
    }

}
