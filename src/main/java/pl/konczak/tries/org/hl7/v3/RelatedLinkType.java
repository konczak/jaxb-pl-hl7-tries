
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedLinkType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="REL"/&gt;
 *     &lt;enumeration value="BACKUP"/&gt;
 *     &lt;enumeration value="DIRAUTH"/&gt;
 *     &lt;enumeration value="INDAUTH"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RelatedLinkType")
@XmlEnum
public enum RelatedLinkType {

    REL,
    BACKUP,
    DIRAUTH,
    INDAUTH,
    PART,
    REPL;

    public String value() {
        return name();
    }

    public static RelatedLinkType fromValue(String v) {
        return valueOf(v);
    }

}
