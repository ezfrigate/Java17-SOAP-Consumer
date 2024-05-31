
package ws.psmClasses;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartConfigurationPermissiveModeWithSpecificBehaviourResult" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}PsmConfigurationSession" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startConfigurationPermissiveModeWithSpecificBehaviourResult"
})
@XmlRootElement(name = "StartConfigurationPermissiveModeWithSpecificBehaviourResponse")
public class StartConfigurationPermissiveModeWithSpecificBehaviourResponse {

    @XmlElementRef(name = "StartConfigurationPermissiveModeWithSpecificBehaviourResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PsmConfigurationSession> startConfigurationPermissiveModeWithSpecificBehaviourResult;

    /**
     * Gets the value of the startConfigurationPermissiveModeWithSpecificBehaviourResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     *     
     */
    public JAXBElement<PsmConfigurationSession> getStartConfigurationPermissiveModeWithSpecificBehaviourResult() {
        return startConfigurationPermissiveModeWithSpecificBehaviourResult;
    }

    /**
     * Sets the value of the startConfigurationPermissiveModeWithSpecificBehaviourResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     *     
     */
    public void setStartConfigurationPermissiveModeWithSpecificBehaviourResult(JAXBElement<PsmConfigurationSession> value) {
        this.startConfigurationPermissiveModeWithSpecificBehaviourResult = value;
    }

}
