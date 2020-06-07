
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipReplacement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipReplacement"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="RPLC"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipReplacement")
@XmlEnum
public enum ActRelationshipReplacement {

    RPLC,
    SUCC;

    public String value() {
        return name();
    }

    public static ActRelationshipReplacement fromValue(String v) {
        return valueOf(v);
    }

}
