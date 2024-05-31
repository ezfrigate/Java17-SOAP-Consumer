
package ws.psmClasses;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PsmCharacteristicGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PsmCharacteristicGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Characteristics" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}ArrayOfPsmCharacteristic" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PsmCharacteristicGroup", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", propOrder = {
    "characteristics",
    "id",
    "name",
    "visible"
})
public class PsmCharacteristicGroup {

    @XmlElementRef(name = "Characteristics", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPsmCharacteristic> characteristics;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Visible")
    protected Boolean visible;

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPsmCharacteristic> getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     *     
     */
    public void setCharacteristics(JAXBElement<ArrayOfPsmCharacteristic> value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
