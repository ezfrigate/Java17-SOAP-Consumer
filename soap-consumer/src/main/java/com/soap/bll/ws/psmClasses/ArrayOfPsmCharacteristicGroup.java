
package ws.psmClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPsmCharacteristicGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPsmCharacteristicGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PsmCharacteristicGroup" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}PsmCharacteristicGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPsmCharacteristicGroup", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", propOrder = {
    "psmCharacteristicGroup"
})
public class ArrayOfPsmCharacteristicGroup {

    @XmlElement(name = "PsmCharacteristicGroup", nillable = true)
    protected List<PsmCharacteristicGroup> psmCharacteristicGroup;

    /**
     * Gets the value of the psmCharacteristicGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the psmCharacteristicGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPsmCharacteristicGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PsmCharacteristicGroup }
     * 
     * 
     */
    public List<PsmCharacteristicGroup> getPsmCharacteristicGroup() {
        if (psmCharacteristicGroup == null) {
            psmCharacteristicGroup = new ArrayList<PsmCharacteristicGroup>();
        }
        return this.psmCharacteristicGroup;
    }

}
