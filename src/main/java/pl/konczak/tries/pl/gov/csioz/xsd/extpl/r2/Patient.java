
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.BL;
import pl.konczak.tries.org.hl7.v3.INT;
import pl.konczak.tries.org.hl7.v3.POCDMT000040Patient;


/**
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}POCD_MT000040.Patient"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="multipleBirthInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirthOrderNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/&gt;
 *         &lt;element name="personalRelationship" type="{http://www.csioz.gov.pl/xsd/extPL/r2}PersonalRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "multipleBirthInd",
    "multipleBirthOrderNumber",
    "personalRelationships"
})
public class Patient
    extends POCDMT000040Patient
{

    protected BL multipleBirthInd;
    protected INT multipleBirthOrderNumber;
    @XmlElement(name = "personalRelationship")
    protected List<PersonalRelationship> personalRelationships;

    /**
     * Gets the value of the multipleBirthInd property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getMultipleBirthInd() {
        return multipleBirthInd;
    }

    /**
     * Sets the value of the multipleBirthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setMultipleBirthInd(BL value) {
        this.multipleBirthInd = value;
    }

    /**
     * Gets the value of the multipleBirthOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getMultipleBirthOrderNumber() {
        return multipleBirthOrderNumber;
    }

    /**
     * Sets the value of the multipleBirthOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setMultipleBirthOrderNumber(INT value) {
        this.multipleBirthOrderNumber = value;
    }

    /**
     * Gets the value of the personalRelationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalRelationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalRelationship }
     * 
     * 
     */
    public List<PersonalRelationship> getPersonalRelationships() {
        if (personalRelationships == null) {
            personalRelationships = new ArrayList<PersonalRelationship>();
        }
        return this.personalRelationships;
    }

}
