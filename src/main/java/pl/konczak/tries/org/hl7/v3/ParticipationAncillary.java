
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationAncillary.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationAncillary"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="ATND"/&gt;
 *     &lt;enumeration value="CALLBCK"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="ESC"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationAncillary")
@XmlEnum
public enum ParticipationAncillary {

    ADM,
    ATND,
    CALLBCK,
    CON,
    DIS,
    ESC,
    REF;

    public String value() {
        return name();
    }

    public static ParticipationAncillary fromValue(String v) {
        return valueOf(v);
    }

}
