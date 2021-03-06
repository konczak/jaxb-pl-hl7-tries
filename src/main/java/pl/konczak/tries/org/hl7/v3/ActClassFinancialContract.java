
package pl.konczak.tries.org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActClassFinancialContract.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassFinancialContract"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="FCNTRCT"/&gt;
 *     &lt;enumeration value="COV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActClassFinancialContract")
@XmlEnum
public enum ActClassFinancialContract {

    FCNTRCT,
    COV;

    public String value() {
        return name();
    }

    public static ActClassFinancialContract fromValue(String v) {
        return valueOf(v);
    }

}
