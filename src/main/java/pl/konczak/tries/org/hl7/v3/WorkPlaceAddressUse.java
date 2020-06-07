
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkPlaceAddressUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkPlaceAddressUse"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="WP"/&gt;
 *     &lt;enumeration value="DIR"/&gt;
 *     &lt;enumeration value="PUB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkPlaceAddressUse")
@XmlEnum
public enum WorkPlaceAddressUse {

    WP,
    DIR,
    PUB;

    public String value() {
        return name();
    }

    public static WorkPlaceAddressUse fromValue(String v) {
        return valueOf(v);
    }

}
