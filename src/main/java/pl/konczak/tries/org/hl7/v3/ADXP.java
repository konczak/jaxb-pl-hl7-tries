
package pl.konczak.tries.org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string that may have a type-tag signifying its
 *             role in the address. Typical parts that exist in about
 *             every address are street, house number, or post box,
 *             postal code, city, country but other roles may be defined
 *             regionally, nationally, or on an enterprise level (e.g. in
 *             military addresses). Addresses are usually broken up into
 *             lines, which are indicated by special line-breaking
 *             delimiter elements (e.g., DEL).
 *          
 * 
 * <p>Java class for ADXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADXP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:v3}ST"&gt;
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADXP")
@XmlSeeAlso({
    AdxpDelimiter.class,
    AdxpCountry.class,
    AdxpState.class,
    AdxpCounty.class,
    AdxpCity.class,
    AdxpPostalCode.class,
    AdxpStreetAddressLine.class,
    AdxpHouseNumber.class,
    AdxpHouseNumberNumeric.class,
    AdxpDirection.class,
    AdxpStreetName.class,
    AdxpStreetNameBase.class,
    AdxpStreetNameType.class,
    AdxpAdditionalLocator.class,
    AdxpUnitID.class,
    AdxpUnitType.class,
    AdxpCareOf.class,
    AdxpCensusTract.class,
    AdxpDeliveryAddressLine.class,
    AdxpDeliveryInstallationType.class,
    AdxpDeliveryInstallationArea.class,
    AdxpDeliveryInstallationQualifier.class,
    AdxpDeliveryMode.class,
    AdxpDeliveryModeIdentifier.class,
    AdxpBuildingNumberSuffix.class,
    AdxpPostBox.class,
    AdxpPrecinct.class
})
public class ADXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected List<String> partTypes;

    /**
     * Gets the value of the partTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartTypes() {
        if (partTypes == null) {
            partTypes = new ArrayList<String>();
        }
        return this.partTypes;
    }

}
