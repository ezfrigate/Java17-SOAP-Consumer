
package ws.psmClasses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PsmLayoutBehaviourTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PsmLayoutBehaviourTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StaticLayoutBehaviour"/&gt;
 *     &lt;enumeration value="DynamicLayoutBehavior"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PsmLayoutBehaviourTypes", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService")
@XmlEnum
public enum PsmLayoutBehaviourTypes {

    @XmlEnumValue("StaticLayoutBehaviour")
    STATIC_LAYOUT_BEHAVIOUR("StaticLayoutBehaviour"),
    @XmlEnumValue("DynamicLayoutBehavior")
    DYNAMIC_LAYOUT_BEHAVIOR("DynamicLayoutBehavior");
    private final String value;

    PsmLayoutBehaviourTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PsmLayoutBehaviourTypes fromValue(String v) {
        for (PsmLayoutBehaviourTypes c: PsmLayoutBehaviourTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
