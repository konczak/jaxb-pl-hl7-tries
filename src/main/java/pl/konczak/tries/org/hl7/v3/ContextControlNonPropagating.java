
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextControlNonPropagating.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContextControlNonPropagating"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContextControlNonPropagating")
@XmlEnum
public enum ContextControlNonPropagating {

    AN,
    ON;

    public String value() {
        return name();
    }

    public static ContextControlNonPropagating fromValue(String v) {
        return valueOf(v);
    }

}
