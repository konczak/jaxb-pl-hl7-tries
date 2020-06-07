
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_EncounterParticipant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterParticipant"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="ATND"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterParticipant")
@XmlEnum
public enum XEncounterParticipant {

    ADM,
    ATND,
    CON,
    DIS,
    REF;

    public String value() {
        return name();
    }

    public static XEncounterParticipant fromValue(String v) {
        return valueOf(v);
    }

}
