
package pl.konczak.tries.ihe.pharm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A name for a person, organization, place or thing. A
 *             sequence of name parts, such as given name or family
 *             name, prefix, suffix, etc. Examples for entity name
 *             values are "Jim Bob Walton, Jr.", "Health Level Seven,
 *             Inc.", "Lake Tahoe", etc. An entity name may be as simple
 *             as a character string or may consist of several entity name
 *             parts, such as, "Jim", "Bob", "Walton", and "Jr.", "Health
 *             Level Seven" and "Inc.", "Lake" and "Tahoe".
 *          
 * 
 * <p>Java class for EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="delimiter" type="{urn:ihe:pharm}en.delimiter"/&gt;
 *           &lt;element name="family" type="{urn:ihe:pharm}en.family"/&gt;
 *           &lt;element name="given" type="{urn:ihe:pharm}en.given"/&gt;
 *           &lt;element name="prefix" type="{urn:ihe:pharm}en.prefix"/&gt;
 *           &lt;element name="suffix" type="{urn:ihe:pharm}en.suffix"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="validTime" type="{urn:ihe:pharm}IVL_TS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{urn:ihe:pharm}set_EntityNameUse" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN", propOrder = {
    "content"
})
@XmlSeeAlso({
    PN.class,
    ON.class,
    TN.class
})
public class EN
    extends ANY
{

    @XmlElementRefs({
        @XmlElementRef(name = "delimiter", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "family", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "given", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prefix", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "suffix", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "validTime", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "use")
    protected List<String> uses;

    /**
     * 
     *             A name for a person, organization, place or thing. A
     *             sequence of name parts, such as given name or family
     *             name, prefix, suffix, etc. Examples for entity name
     *             values are "Jim Bob Walton, Jr.", "Health Level Seven,
     *             Inc.", "Lake Tahoe", etc. An entity name may be as simple
     *             as a character string or may consist of several entity name
     *             parts, such as, "Jim", "Bob", "Walton", and "Jr.", "Health
     *             Level Seven" and "Inc.", "Lake" and "Tahoe".
     *          Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}
     * {@link JAXBElement }{@code <}{@link EnFamily }{@code >}
     * {@link JAXBElement }{@code <}{@link EnGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}
     * {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link IVLTS }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the uses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUses() {
        if (uses == null) {
            uses = new ArrayList<String>();
        }
        return this.uses;
    }

}
