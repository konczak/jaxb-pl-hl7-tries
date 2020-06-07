
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextControlAdditive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlAdditive"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContextControlAdditive")
@XmlEnum
public enum ContextControlAdditive {

    AN,
    AP;

    public String value() {
        return name();
    }

    public static ContextControlAdditive fromValue(String v) {
        return valueOf(v);
    }

}
