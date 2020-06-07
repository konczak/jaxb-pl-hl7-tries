
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassLocatedEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassLocatedEntity"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="LOCE"/&gt;
 *     &lt;enumeration value="STOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassLocatedEntity")
@XmlEnum
public enum RoleClassLocatedEntity {

    LOCE,
    STOR;

    public String value() {
        return name();
    }

    public static RoleClassLocatedEntity fromValue(String v) {
        return valueOf(v);
    }

}
