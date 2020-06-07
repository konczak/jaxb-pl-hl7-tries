
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameRepresentationUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameRepresentationUse"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ABC"/&gt;
 *     &lt;enumeration value="IDE"/&gt;
 *     &lt;enumeration value="SYL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameRepresentationUse")
@XmlEnum
public enum NameRepresentationUse {

    ABC,
    IDE,
    SYL;

    public String value() {
        return name();
    }

    public static NameRepresentationUse fromValue(String v) {
        return valueOf(v);
    }

}
