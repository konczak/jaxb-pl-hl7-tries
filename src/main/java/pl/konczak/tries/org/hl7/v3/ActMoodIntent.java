
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActMoodIntent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodIntent"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="APT"/&gt;
 *     &lt;enumeration value="ARQ"/&gt;
 *     &lt;enumeration value="PRMS"/&gt;
 *     &lt;enumeration value="PRP"/&gt;
 *     &lt;enumeration value="RQO"/&gt;
 *     &lt;enumeration value="SLOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodIntent")
@XmlEnum
public enum ActMoodIntent {

    INT,
    APT,
    ARQ,
    PRMS,
    PRP,
    RQO,
    SLOT;

    public String value() {
        return name();
    }

    public static ActMoodIntent fromValue(String v) {
        return valueOf(v);
    }

}
