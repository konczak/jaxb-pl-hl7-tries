
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextMediaType"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="text/html"/&gt;
 *     &lt;enumeration value="text/plain"/&gt;
 *     &lt;enumeration value="text/rtf"/&gt;
 *     &lt;enumeration value="text/sgml"/&gt;
 *     &lt;enumeration value="text/x-hl7-ft"/&gt;
 *     &lt;enumeration value="text/xml"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TextMediaType")
@XmlEnum
public enum TextMediaType {

    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    @XmlEnumValue("text/x-hl7-ft")
    TEXT_X_HL_7_FT("text/x-hl7-ft"),
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml");
    private final String value;

    TextMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextMediaType fromValue(String v) {
        for (TextMediaType c: TextMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
