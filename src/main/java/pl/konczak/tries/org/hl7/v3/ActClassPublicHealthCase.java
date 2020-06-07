
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClassPublicHealthCase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPublicHealthCase"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="OUTB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassPublicHealthCase")
@XmlEnum
public enum ActClassPublicHealthCase {

    CASE,
    OUTB;

    public String value() {
        return name();
    }

    public static ActClassPublicHealthCase fromValue(String v) {
        return valueOf(v);
    }

}
