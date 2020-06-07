
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActRelationshipEntry.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipEntry"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="DRIV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipEntry")
@XmlEnum
public enum XActRelationshipEntry {

    COMP,
    DRIV;

    public String value() {
        return name();
    }

    public static XActRelationshipEntry fromValue(String v) {
        return valueOf(v);
    }

}
