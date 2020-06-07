
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ParticipationVrfRespSprfWit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationVrfRespSprfWit"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="VRF"/&gt;
 *     &lt;enumeration value="RESP"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationVrfRespSprfWit")
@XmlEnum
public enum XParticipationVrfRespSprfWit {

    VRF,
    RESP,
    SPRF,
    WIT;

    public String value() {
        return name();
    }

    public static XParticipationVrfRespSprfWit fromValue(String v) {
        return valueOf(v);
    }

}
