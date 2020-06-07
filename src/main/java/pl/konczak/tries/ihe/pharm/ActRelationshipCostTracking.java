
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActRelationshipCostTracking.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipCostTracking"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="CHRG"/&gt;
 *     &lt;enumeration value="COST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipCostTracking")
@XmlEnum
public enum ActRelationshipCostTracking {

    CHRG,
    COST;

    public String value() {
        return name();
    }

    public static ActRelationshipCostTracking fromValue(String v) {
        return valueOf(v);
    }

}
