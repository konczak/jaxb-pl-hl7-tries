
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasSupport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hasSupport"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="SPRT"/&gt;
 *     &lt;enumeration value="SPRTBND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "hasSupport")
@XmlEnum
public enum HasSupport {

    SPRT,
    SPRTBND;

    public String value() {
        return name();
    }

    public static HasSupport fromValue(String v) {
        return valueOf(v);
    }

}
