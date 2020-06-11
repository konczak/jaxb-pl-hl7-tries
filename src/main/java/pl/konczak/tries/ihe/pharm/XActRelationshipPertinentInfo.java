
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActRelationshipPertinentInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPertinentInfo"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="SPRT"/&gt;
 *     &lt;enumeration value="CAUS"/&gt;
 *     &lt;enumeration value="MFST"/&gt;
 *     &lt;enumeration value="REFR"/&gt;
 *     &lt;enumeration value="SUBJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPertinentInfo")
@XmlEnum
public enum XActRelationshipPertinentInfo {

    SPRT,
    CAUS,
    MFST,
    REFR,
    SUBJ;

    public String value() {
        return name();
    }

    public static XActRelationshipPertinentInfo fromValue(String v) {
        return valueOf(v);
    }

}
