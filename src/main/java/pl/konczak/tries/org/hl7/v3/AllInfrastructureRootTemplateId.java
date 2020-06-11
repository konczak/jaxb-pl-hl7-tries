
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for all.InfrastructureRoot.templateId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="all.InfrastructureRoot.templateId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}II"&gt;
 *       &lt;attribute name="unsorted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all.InfrastructureRoot.templateId")
public class AllInfrastructureRootTemplateId
    extends II
{

    @XmlAttribute(name = "unsorted")
    protected Boolean unsorted;

    /**
     * Gets the value of the unsorted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnsorted() {
        if (unsorted == null) {
            return false;
        } else {
            return unsorted;
        }
    }

    /**
     * Sets the value of the unsorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnsorted(Boolean value) {
        this.unsorted = value;
    }

}
