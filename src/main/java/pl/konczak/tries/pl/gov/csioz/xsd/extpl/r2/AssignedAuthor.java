
package pl.konczak.tries.pl.gov.csioz.xsd.extpl.r2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import pl.konczak.tries.org.hl7.v3.POCDMT000040AssignedAuthor;


/**
 * <p>Java class for AssignedAuthor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignedAuthor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}POCD_MT000040.AssignedAuthor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundedBy" type="{http://www.csioz.gov.pl/xsd/extPL/r2}BoundedByParticipation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedAuthor", propOrder = {
    "boundedBy"
})
public class AssignedAuthor
    extends POCDMT000040AssignedAuthor
{

    protected BoundedByParticipation boundedBy;

    /**
     * Gets the value of the boundedBy property.
     * 
     * @return
     *     possible object is
     *     {@link BoundedByParticipation }
     *     
     */
    public BoundedByParticipation getBoundedBy() {
        return boundedBy;
    }

    /**
     * Sets the value of the boundedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundedByParticipation }
     *     
     */
    public void setBoundedBy(BoundedByParticipation value) {
        this.boundedBy = value;
    }

}
