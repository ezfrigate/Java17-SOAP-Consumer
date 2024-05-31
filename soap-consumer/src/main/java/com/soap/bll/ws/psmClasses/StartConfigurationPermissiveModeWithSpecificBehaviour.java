
package ws.psmClasses;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="configurableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="layoutBehaviourType" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}PsmLayoutBehaviourTypes" minOccurs="0"/&gt;
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
    "configurableId",
    "database",
    "language",
    "layoutBehaviourType"
})
@XmlRootElement(name = "StartConfigurationPermissiveModeWithSpecificBehaviour")
public class StartConfigurationPermissiveModeWithSpecificBehaviour {

    @XmlElementRef(name = "configurableId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> configurableId;
    @XmlElementRef(name = "database", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> database;
    @XmlElementRef(name = "language", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlSchemaType(name = "string")
    protected PsmLayoutBehaviourTypes layoutBehaviourType;

    /**
     * Gets the value of the configurableId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfigurableId() {
        return configurableId;
    }

    /**
     * Sets the value of the configurableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfigurableId(JAXBElement<String> value) {
        this.configurableId = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatabase(JAXBElement<String> value) {
        this.database = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Gets the value of the layoutBehaviourType property.
     * 
     * @return
     *     possible object is
     *     {@link PsmLayoutBehaviourTypes }
     *     
     */
    public PsmLayoutBehaviourTypes getLayoutBehaviourType() {
        return layoutBehaviourType;
    }

    /**
     * Sets the value of the layoutBehaviourType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmLayoutBehaviourTypes }
     *     
     */
    public void setLayoutBehaviourType(PsmLayoutBehaviourTypes value) {
        this.layoutBehaviourType = value;
    }

}
