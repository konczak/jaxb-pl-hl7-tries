
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrityCheckAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrityCheckAlgorithm"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="SHA-1"/&gt;
 *     &lt;enumeration value="SHA-256"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntegrityCheckAlgorithm")
@XmlEnum
public enum IntegrityCheckAlgorithm {

    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1"),
    @XmlEnumValue("SHA-256")
    SHA_256("SHA-256");
    private final String value;

    IntegrityCheckAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntegrityCheckAlgorithm fromValue(String v) {
        for (IntegrityCheckAlgorithm c: IntegrityCheckAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
