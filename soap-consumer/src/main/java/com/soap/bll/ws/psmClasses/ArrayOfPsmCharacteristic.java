
package ws.psmClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPsmCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPsmCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PsmCharacteristic" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}PsmCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPsmCharacteristic", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", propOrder = {
    "psmCharacteristic"
})
public class ArrayOfPsmCharacteristic {

    @XmlElement(name = "PsmCharacteristic", nillable = true)
    protected List<PsmCharacteristic> psmCharacteristic;

    /**
     * Gets the value of the psmCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the psmCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsmCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PsmCharacteristic }
     * 
     * 
     */
    public List<PsmCharacteristic> getPsmCharacteristic() {
        if (psmCharacteristic == null) {
            psmCharacteristic = new ArrayList<PsmCharacteristic>();
        }
        return this.psmCharacteristic;
    }

}
