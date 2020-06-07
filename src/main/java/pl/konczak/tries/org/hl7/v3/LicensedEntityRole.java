
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicensedEntityRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicensedEntityRole"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LIC"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="PROV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LicensedEntityRole")
@XmlEnum
public enum LicensedEntityRole {

    LIC,
    NOT,
    PROV;

    public String value() {
        return name();
    }

    public static LicensedEntityRole fromValue(String v) {
        return valueOf(v);
    }

}
