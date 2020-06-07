
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleClassTerritoryOfAuthority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassTerritoryOfAuthority"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="TERR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoleClassTerritoryOfAuthority")
@XmlEnum
public enum RoleClassTerritoryOfAuthority {

    TERR;

    public String value() {
        return name();
    }

    public static RoleClassTerritoryOfAuthority fromValue(String v) {
        return valueOf(v);
    }

}
