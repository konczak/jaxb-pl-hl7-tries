
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_RoleClassAccommodationRequestor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassAccommodationRequestor"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="AGNT"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassAccommodationRequestor")
@XmlEnum
public enum XRoleClassAccommodationRequestor {

    AGNT,
    PAT,
    PROV,
    PRS;

    public String value() {
        return name();
    }

    public static XRoleClassAccommodationRequestor fromValue(String v) {
        return valueOf(v);
    }

}
