
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassIsSpeciesEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassIsSpeciesEntity"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="GRIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassIsSpeciesEntity")
@XmlEnum
public enum RoleClassIsSpeciesEntity {

    GEN,
    GRIC;

    public String value() {
        return name();
    }

    public static RoleClassIsSpeciesEntity fromValue(String v) {
        return valueOf(v);
    }

}
