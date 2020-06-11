
package pl.konczak.tries.ihe.pharm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *             A concept descriptor represents any kind of concept usually
 *             by giving a code defined in a code system.  A concept
 *             descriptor can contain the original text or phrase that
 *             served as the basis of the coding and one or more
 *             translations into different coding systems. A concept
 *             descriptor can also contain qualifiers to describe, e.g.,
 *             the concept of a "left foot" as a postcoordinated term built
 *             from the primary code "FOOT" and the qualifier "LEFT".
 *             In exceptional cases, the concept descriptor need not
 *             contain a code but only the original text describing
 *             that concept.
 *          
 * 
 * <p>Java class for CD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalText" type="{urn:ihe:pharm}ED" minOccurs="0"/&gt;
 *         &lt;element name="qualifier" type="{urn:ihe:pharm}CR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="translation" type="{urn:ihe:pharm}CD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" type="{urn:ihe:pharm}cs" /&gt;
 *       &lt;attribute name="codeSystem" type="{urn:ihe:pharm}uid" /&gt;
 *       &lt;attribute name="codeSystemName" type="{urn:ihe:pharm}st" /&gt;
 *       &lt;attribute name="codeSystemVersion" type="{urn:ihe:pharm}st" /&gt;
 *       &lt;attribute name="displayName" type="{urn:ihe:pharm}st" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD", propOrder = {
    "originalText",
    "qualifiers",
    "translations"
})
@XmlSeeAlso({
    SXCMCD.class,
    CE.class,
    BXITCD.class
})
public class CD
    extends ANY
{

    protected ED originalText;
    @XmlElement(name = "qualifier")
    protected List<CR> qualifiers;
    @XmlElement(name = "translation")
    protected List<CD> translations;
    @XmlAttribute(name = "code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String code;
    @XmlAttribute(name = "codeSystem")
    protected String codeSystem;
    @XmlAttribute(name = "codeSystemName")
    protected String codeSystemName;
    @XmlAttribute(name = "codeSystemVersion")
    protected String codeSystemVersion;
    @XmlAttribute(name = "displayName")
    protected String displayName;

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setOriginalText(ED value) {
        this.originalText = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CR }
     * 
     * 
     */
    public List<CR> getQualifiers() {
        if (qualifiers == null) {
            qualifiers = new ArrayList<CR>();
        }
        return this.qualifiers;
    }

    /**
     * Gets the value of the translations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CD }
     * 
     * 
     */
    public List<CD> getTranslations() {
        if (translations == null) {
            translations = new ArrayList<CD>();
        }
        return this.translations;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the codeSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Sets the value of the codeSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

    /**
     * Gets the value of the codeSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    /**
     * Sets the value of the codeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemVersion(String value) {
        this.codeSystemVersion = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}
