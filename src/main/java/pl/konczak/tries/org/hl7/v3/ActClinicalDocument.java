
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClinicalDocument.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClinicalDocument"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DOCCLIN"/&gt;
 *     &lt;enumeration value="CDALVLONE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClinicalDocument")
@XmlEnum
public enum ActClinicalDocument {

    DOCCLIN,
    CDALVLONE;

    public String value() {
        return name();
    }

    public static ActClinicalDocument fromValue(String v) {
        return valueOf(v);
    }

}
