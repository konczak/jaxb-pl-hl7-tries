
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationVerifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationVerifier"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="AUTHEN"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationVerifier")
@XmlEnum
public enum ParticipationVerifier {

    VRF,
    AUTHEN,
    LA;

    public String value() {
        return name();
    }

    public static ParticipationVerifier fromValue(String v) {
        return valueOf(v);
    }

}
