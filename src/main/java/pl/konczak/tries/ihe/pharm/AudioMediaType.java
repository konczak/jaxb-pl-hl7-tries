
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioMediaType"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="audio/basic"/&gt;
 *     &lt;enumeration value="audio/k32adpcm"/&gt;
 *     &lt;enumeration value="audio/mpeg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudioMediaType")
@XmlEnum
public enum AudioMediaType {

    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    @XmlEnumValue("audio/k32adpcm")
    AUDIO_K_32_ADPCM("audio/k32adpcm"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg");
    private final String value;

    AudioMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioMediaType fromValue(String v) {
        for (AudioMediaType c: AudioMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
