
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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Mailing and home or office addresses. A sequence of
 *             address parts, such as street or post office Box, city,
 *             postal code, country, etc.
 *          
 * 
 * <p>Java class for AD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}ANY"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="delimiter" type="{urn:ihe:pharm}adxp.delimiter"/&gt;
 *           &lt;element name="country" type="{urn:ihe:pharm}adxp.country"/&gt;
 *           &lt;element name="state" type="{urn:ihe:pharm}adxp.state"/&gt;
 *           &lt;element name="county" type="{urn:ihe:pharm}adxp.county"/&gt;
 *           &lt;element name="city" type="{urn:ihe:pharm}adxp.city"/&gt;
 *           &lt;element name="postalCode" type="{urn:ihe:pharm}adxp.postalCode"/&gt;
 *           &lt;element name="streetAddressLine" type="{urn:ihe:pharm}adxp.streetAddressLine"/&gt;
 *           &lt;element name="houseNumber" type="{urn:ihe:pharm}adxp.houseNumber"/&gt;
 *           &lt;element name="houseNumberNumeric" type="{urn:ihe:pharm}adxp.houseNumberNumeric"/&gt;
 *           &lt;element name="direction" type="{urn:ihe:pharm}adxp.direction"/&gt;
 *           &lt;element name="streetName" type="{urn:ihe:pharm}adxp.streetName"/&gt;
 *           &lt;element name="streetNameBase" type="{urn:ihe:pharm}adxp.streetNameBase"/&gt;
 *           &lt;element name="streetNameType" type="{urn:ihe:pharm}adxp.streetNameType"/&gt;
 *           &lt;element name="additionalLocator" type="{urn:ihe:pharm}adxp.additionalLocator"/&gt;
 *           &lt;element name="unitID" type="{urn:ihe:pharm}adxp.unitID"/&gt;
 *           &lt;element name="unitType" type="{urn:ihe:pharm}adxp.unitType"/&gt;
 *           &lt;element name="careOf" type="{urn:ihe:pharm}adxp.careOf"/&gt;
 *           &lt;element name="censusTract" type="{urn:ihe:pharm}adxp.censusTract"/&gt;
 *           &lt;element name="deliveryAddressLine" type="{urn:ihe:pharm}adxp.deliveryAddressLine"/&gt;
 *           &lt;element name="deliveryInstallationType" type="{urn:ihe:pharm}adxp.deliveryInstallationType"/&gt;
 *           &lt;element name="deliveryInstallationArea" type="{urn:ihe:pharm}adxp.deliveryInstallationArea"/&gt;
 *           &lt;element name="deliveryInstallationQualifier" type="{urn:ihe:pharm}adxp.deliveryInstallationQualifier"/&gt;
 *           &lt;element name="deliveryMode" type="{urn:ihe:pharm}adxp.deliveryMode"/&gt;
 *           &lt;element name="deliveryModeIdentifier" type="{urn:ihe:pharm}adxp.deliveryModeIdentifier"/&gt;
 *           &lt;element name="buildingNumberSuffix" type="{urn:ihe:pharm}adxp.buildingNumberSuffix"/&gt;
 *           &lt;element name="postBox" type="{urn:ihe:pharm}adxp.postBox"/&gt;
 *           &lt;element name="precinct" type="{urn:ihe:pharm}adxp.precinct"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="useablePeriod" type="{urn:ihe:pharm}SXCM_TS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="use" type="{urn:ihe:pharm}set_PostalAddressUse" /&gt;
 *       &lt;attribute name="isNotOrdered" type="{urn:ihe:pharm}bl" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AD", propOrder = {
    "content"
})
public class AD
    extends ANY
{

    @XmlElementRefs({
        @XmlElementRef(name = "delimiter", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "state", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "county", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "city", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postalCode", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetAddressLine", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "houseNumber", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "houseNumberNumeric", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "direction", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetName", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetNameBase", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "streetNameType", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "additionalLocator", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unitID", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unitType", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "careOf", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "censusTract", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryAddressLine", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationType", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationArea", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryInstallationQualifier", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryMode", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "deliveryModeIdentifier", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "buildingNumberSuffix", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "postBox", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precinct", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "useablePeriod", namespace = "urn:ihe:pharm", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "use")
    protected List<String> uses;
    @XmlAttribute(name = "isNotOrdered")
    protected Boolean isNotOrdered;

    /**
     * 
     *             Mailing and home or office addresses. A sequence of
     *             address parts, such as street or post office Box, city,
     *             postal code, country, etc.
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
     * {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpState }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}
     * {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}
     * {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}
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

    /**
     * Gets the value of the isNotOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotOrdered() {
        return isNotOrdered;
    }

    /**
     * Sets the value of the isNotOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotOrdered(Boolean value) {
        this.isNotOrdered = value;
    }

}