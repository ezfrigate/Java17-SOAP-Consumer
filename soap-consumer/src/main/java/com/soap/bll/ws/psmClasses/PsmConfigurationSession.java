
package ws.psmClasses;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PsmConfigurationSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PsmConfigurationSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharacteristicGroups" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}ArrayOfPsmCharacteristicGroup" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurableId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPermissiveMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SelectedMacroRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSubReferences" type="{http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService}ArrayOfPsmSubReference" minOccurs="0"/&gt;
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PsmConfigurationSession", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", propOrder = {
    "characteristicGroups",
    "configurableId",
    "database",
    "isConfigured",
    "isPermissiveMode",
    "language",
    "requestedLanguage",
    "selectedMacroRef",
    "selectedSubReferences",
    "sessionId"
})
public class PsmConfigurationSession {

    @XmlElementRef(name = "CharacteristicGroups", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPsmCharacteristicGroup> characteristicGroups;
    @XmlElementRef(name = "ConfigurableId", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> configurableId;
    @XmlElementRef(name = "Database", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> database;
    @XmlElement(name = "IsConfigured")
    protected Boolean isConfigured;
    @XmlElement(name = "IsPermissiveMode")
    protected Boolean isPermissiveMode;
    @XmlElementRef(name = "Language", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "RequestedLanguage", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestedLanguage;
    @XmlElementRef(name = "SelectedMacroRef", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedMacroRef;
    @XmlElementRef(name = "SelectedSubReferences", namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPsmSubReference> selectedSubReferences;
    @XmlElement(name = "SessionId")
    protected Integer sessionId;

    /**
     * Gets the value of the characteristicGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPsmCharacteristicGroup> getCharacteristicGroups() {
        return characteristicGroups;
    }

    /**
     * Sets the value of the characteristicGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     *     
     */
    public void setCharacteristicGroups(JAXBElement<ArrayOfPsmCharacteristicGroup> value) {
        this.characteristicGroups = value;
    }

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
     * Gets the value of the isConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfigured() {
        return isConfigured;
    }

    /**
     * Sets the value of the isConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfigured(Boolean value) {
        this.isConfigured = value;
    }

    /**
     * Gets the value of the isPermissiveMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPermissiveMode() {
        return isPermissiveMode;
    }

    /**
     * Sets the value of the isPermissiveMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPermissiveMode(Boolean value) {
        this.isPermissiveMode = value;
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
     * Gets the value of the requestedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestedLanguage() {
        return requestedLanguage;
    }

    /**
     * Sets the value of the requestedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestedLanguage(JAXBElement<String> value) {
        this.requestedLanguage = value;
    }

    /**
     * Gets the value of the selectedMacroRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedMacroRef() {
        return selectedMacroRef;
    }

    /**
     * Sets the value of the selectedMacroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedMacroRef(JAXBElement<String> value) {
        this.selectedMacroRef = value;
    }

    /**
     * Gets the value of the selectedSubReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPsmSubReference> getSelectedSubReferences() {
        return selectedSubReferences;
    }

    /**
     * Sets the value of the selectedSubReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     *     
     */
    public void setSelectedSubReferences(JAXBElement<ArrayOfPsmSubReference> value) {
        this.selectedSubReferences = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionId(Integer value) {
        this.sessionId = value;
    }

}
