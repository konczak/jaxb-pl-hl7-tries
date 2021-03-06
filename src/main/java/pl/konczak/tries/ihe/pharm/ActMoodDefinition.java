
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActMoodDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodDefinition"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActMoodDefinition")
@XmlEnum
public enum ActMoodDefinition {

    DEF;

    public String value() {
        return name();
    }

    public static ActMoodDefinition fromValue(String v) {
        return valueOf(v);
    }

}
