
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
 *         &lt;element name="StartConfigurationWithSpecificBehaviourResult" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}PsmConfigurationSession" minOccurs="0"/&gt;
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
    "startConfigurationWithSpecificBehaviourResult"
})
@XmlRootElement(name = "StartConfigurationWithSpecificBehaviourResponse")
public class StartConfigurationWithSpecificBehaviourResponse {

    @XmlElementRef(name = "StartConfigurationWithSpecificBehaviourResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PsmConfigurationSession> startConfigurationWithSpecificBehaviourResult;

    /**
     * Gets the value of the startConfigurationWithSpecificBehaviourResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     *     
     */
    public JAXBElement<PsmConfigurationSession> getStartConfigurationWithSpecificBehaviourResult() {
        return startConfigurationWithSpecificBehaviourResult;
    }

    /**
     * Sets the value of the startConfigurationWithSpecificBehaviourResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     *     
     */
    public void setStartConfigurationWithSpecificBehaviourResult(JAXBElement<PsmConfigurationSession> value) {
        this.startConfigurationWithSpecificBehaviourResult = value;
    }

}
