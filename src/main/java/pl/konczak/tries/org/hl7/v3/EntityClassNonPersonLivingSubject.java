
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityClassNonPersonLivingSubject.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassNonPersonLivingSubject"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NLIV"/&gt;
 *     &lt;enumeration value="ANM"/&gt;
 *     &lt;enumeration value="MIC"/&gt;
 *     &lt;enumeration value="PLNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityClassNonPersonLivingSubject")
@XmlEnum
public enum EntityClassNonPersonLivingSubject {

    NLIV,
    ANM,
    MIC,
    PLNT;

    public String value() {
        return name();
    }

    public static EntityClassNonPersonLivingSubject fromValue(String v) {
        return valueOf(v);
    }

}
