
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimingEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingEvent"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="ACD"/&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="ACV"/&gt;
 *     &lt;enumeration value="HS"/&gt;
 *     &lt;enumeration value="IC"/&gt;
 *     &lt;enumeration value="ICD"/&gt;
 *     &lt;enumeration value="ICM"/&gt;
 *     &lt;enumeration value="ICV"/&gt;
 *     &lt;enumeration value="PC"/&gt;
 *     &lt;enumeration value="PCD"/&gt;
 *     &lt;enumeration value="PCM"/&gt;
 *     &lt;enumeration value="PCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimingEvent")
@XmlEnum
public enum TimingEvent {

    AC,
    ACD,
    ACM,
    ACV,
    HS,
    IC,
    ICD,
    ICM,
    ICV,
    PC,
    PCD,
    PCM,
    PCV;

    public String value() {
        return name();
    }

    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}
