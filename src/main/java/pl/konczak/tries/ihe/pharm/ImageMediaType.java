
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageMediaType"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="image/g3fax"/&gt;
 *     &lt;enumeration value="image/gif"/&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/tiff"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageMediaType")
@XmlEnum
public enum ImageMediaType {

    @XmlEnumValue("image/g3fax")
    IMAGE_G_3_FAX("image/g3fax"),
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff");
    private final String value;

    ImageMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageMediaType fromValue(String v) {
        for (ImageMediaType c: ImageMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
