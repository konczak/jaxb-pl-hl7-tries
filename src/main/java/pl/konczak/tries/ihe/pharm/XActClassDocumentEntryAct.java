
package pl.konczak.tries.ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for x_ActClassDocumentEntryAct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassDocumentEntryAct"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ACCM"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="CTTEVENT"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="INFRM"/&gt;
 *     &lt;enumeration value="PCPR"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="SPCTRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryAct")
@XmlEnum
public enum XActClassDocumentEntryAct {

    ACT,
    ACCM,
    CONS,
    CTTEVENT,
    INC,
    INFRM,
    PCPR,
    REG,
    SPCTRT;

    public String value() {
        return name();
    }

    public static XActClassDocumentEntryAct fromValue(String v) {
        return valueOf(v);
    }

}
