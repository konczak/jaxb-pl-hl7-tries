
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StrucDoc.Table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.Table"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caption" type="{urn:hl7-org:v3}StrucDoc.Caption" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="col" type="{urn:hl7-org:v3}StrucDoc.Col" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="colgroup" type="{urn:hl7-org:v3}StrucDoc.Colgroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="thead" type="{urn:hl7-org:v3}StrucDoc.Thead" minOccurs="0"/&gt;
 *         &lt;element name="tfoot" type="{urn:hl7-org:v3}StrucDoc.Tfoot" minOccurs="0"/&gt;
 *         &lt;element name="tbody" type="{urn:hl7-org:v3}StrucDoc.Tbody" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" /&gt;
 *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="border" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="frame"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="void"/&gt;
 *             &lt;enumeration value="above"/&gt;
 *             &lt;enumeration value="below"/&gt;
 *             &lt;enumeration value="hsides"/&gt;
 *             &lt;enumeration value="lhs"/&gt;
 *             &lt;enumeration value="rhs"/&gt;
 *             &lt;enumeration value="vsides"/&gt;
 *             &lt;enumeration value="box"/&gt;
 *             &lt;enumeration value="border"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rules"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="groups"/&gt;
 *             &lt;enumeration value="rows"/&gt;
 *             &lt;enumeration value="cols"/&gt;
 *             &lt;enumeration value="all"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.Table", propOrder = {
    "caption",
    "colgroups",
    "cols",
    "thead",
    "tfoot",
    "tbodies"
})
public class StrucDocTable {

    protected StrucDocCaption caption;
    @XmlElement(name = "colgroup")
    protected List<StrucDocColgroup> colgroups;
    @XmlElement(name = "col")
    protected List<StrucDocCol> cols;
    protected StrucDocThead thead;
    protected StrucDocTfoot tfoot;
    @XmlElement(name = "tbody", required = true)
    protected List<StrucDocTbody> tbodies;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlAttribute(name = "styleCode")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> styleCodes;
    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "rules")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rules;
    @XmlAttribute(name = "cellspacing")
    protected String cellspacing;
    @XmlAttribute(name = "cellpadding")
    protected String cellpadding;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link StrucDocCaption }
     *     
     */
    public StrucDocCaption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocCaption }
     *     
     */
    public void setCaption(StrucDocCaption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the colgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrucDocColgroup }
     * 
     * 
     */
    public List<StrucDocColgroup> getColgroups() {
        if (colgroups == null) {
            colgroups = new ArrayList<StrucDocColgroup>();
        }
        return this.colgroups;
    }

    /**
     * Gets the value of the cols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrucDocCol }
     * 
     * 
     */
    public List<StrucDocCol> getCols() {
        if (cols == null) {
            cols = new ArrayList<StrucDocCol>();
        }
        return this.cols;
    }

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link StrucDocThead }
     *     
     */
    public StrucDocThead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocThead }
     *     
     */
    public void setThead(StrucDocThead value) {
        this.thead = value;
    }

    /**
     * Gets the value of the tfoot property.
     * 
     * @return
     *     possible object is
     *     {@link StrucDocTfoot }
     *     
     */
    public StrucDocTfoot getTfoot() {
        return tfoot;
    }

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocTfoot }
     *     
     */
    public void setTfoot(StrucDocTfoot value) {
        this.tfoot = value;
    }

    /**
     * Gets the value of the tbodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrucDocTbody }
     * 
     * 
     */
    public List<StrucDocTbody> getTbodies() {
        if (tbodies == null) {
            tbodies = new ArrayList<StrucDocTbody>();
        }
        return this.tbodies;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the styleCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleCodes() {
        if (styleCodes == null) {
            styleCodes = new ArrayList<String>();
        }
        return this.styleCodes;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRules(String value) {
        this.rules = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

}
