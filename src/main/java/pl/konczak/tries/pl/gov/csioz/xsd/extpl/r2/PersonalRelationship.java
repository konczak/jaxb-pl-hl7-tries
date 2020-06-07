
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.CD;


/**
 * <p>Java class for PersonalRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.csioz.gov.pl/xsd/extPL/r2}InfrastructureRoot"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:hl7-org:v3}CD"/&gt;
 *         &lt;element name="person" type="{http://www.csioz.gov.pl/xsd/extPL/r2}RelatedPerson"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}RoleClass" fixed="PRS" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalRelationship", propOrder = {
    "code",
    "person"
})
public class PersonalRelationship
    extends InfrastructureRoot
{

    @XmlElement(required = true)
    protected CD code;
    @XmlElement(required = true)
    protected RelatedPerson person;
    @XmlAttribute(name = "classCode", required = true)
    protected List<String> classCodes;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPerson }
     *     
     */
    public RelatedPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPerson }
     *     
     */
    public void setPerson(RelatedPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the classCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClassCodes() {
        if (classCodes == null) {
            classCodes = new ArrayList<String>();
        }
        return this.classCodes;
    }

}
