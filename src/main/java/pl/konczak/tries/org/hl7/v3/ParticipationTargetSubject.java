
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationTargetSubject.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetSubject"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SBJ"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetSubject")
@XmlEnum
public enum ParticipationTargetSubject {

    SBJ,
    SPC;

    public String value() {
        return name();
    }

    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
