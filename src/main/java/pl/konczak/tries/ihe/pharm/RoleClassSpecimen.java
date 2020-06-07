
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassSpecimen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassSpecimen"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="SPEC"/&gt;
 *     &lt;enumeration value="ALQT"/&gt;
 *     &lt;enumeration value="ISLT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassSpecimen")
@XmlEnum
public enum RoleClassSpecimen {

    SPEC,
    ALQT,
    ISLT;

    public String value() {
        return name();
    }

    public static RoleClassSpecimen fromValue(String v) {
        return valueOf(v);
    }

}
