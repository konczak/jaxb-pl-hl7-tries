
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationInformationGenerator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationGenerator"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="ENT"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="WIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationInformationGenerator")
@XmlEnum
public enum ParticipationInformationGenerator {

    AUT,
    ENT,
    INF,
    WIT;

    public String value() {
        return name();
    }

    public static ParticipationInformationGenerator fromValue(String v) {
        return valueOf(v);
    }

}
