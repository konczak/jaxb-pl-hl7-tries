
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URLScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URLScheme"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="fax"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="ftp"/&gt;
 *     &lt;enumeration value="http"/&gt;
 *     &lt;enumeration value="mailto"/&gt;
 *     &lt;enumeration value="mllp"/&gt;
 *     &lt;enumeration value="modem"/&gt;
 *     &lt;enumeration value="nfs"/&gt;
 *     &lt;enumeration value="tel"/&gt;
 *     &lt;enumeration value="telnet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "URLScheme")
@XmlEnum
public enum URLScheme {

    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("ftp")
    FTP("ftp"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    @XmlEnumValue("mllp")
    MLLP("mllp"),
    @XmlEnumValue("modem")
    MODEM("modem"),
    @XmlEnumValue("nfs")
    NFS("nfs"),
    @XmlEnumValue("tel")
    TEL("tel"),
    @XmlEnumValue("telnet")
    TELNET("telnet");
    private final String value;

    URLScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URLScheme fromValue(String v) {
        for (URLScheme c: URLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
