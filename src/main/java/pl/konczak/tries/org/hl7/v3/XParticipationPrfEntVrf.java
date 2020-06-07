
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ParticipationPrfEntVrf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationPrfEntVrf"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationPrfEntVrf")
@XmlEnum
public enum XParticipationPrfEntVrf {

    PRF,
    VRF,
    ENT;

    public String value() {
        return name();
    }

    public static XParticipationPrfEntVrf fromValue(String v) {
        return valueOf(v);
    }

}
