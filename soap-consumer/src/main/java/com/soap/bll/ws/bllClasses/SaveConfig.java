
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="persistedConfigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="headerReplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setDefaults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveConfig", propOrder = {
    "configId",
    "userId",
    "persistedConfigId",
    "type",
    "headerReplacement",
    "setDefaults"
})
public class SaveConfig {

    protected String configId;
    protected String userId;
    protected String persistedConfigId;
    protected String type;
    protected String headerReplacement;
    protected String setDefaults;

    /**
     * Gets the value of the configId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the persistedConfigId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistedConfigId() {
        return persistedConfigId;
    }

    /**
     * Sets the value of the persistedConfigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistedConfigId(String value) {
        this.persistedConfigId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the headerReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderReplacement() {
        return headerReplacement;
    }

    /**
     * Sets the value of the headerReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderReplacement(String value) {
        this.headerReplacement = value;
    }

    /**
     * Gets the value of the setDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetDefaults() {
        return setDefaults;
    }

    /**
     * Sets the value of the setDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetDefaults(String value) {
        this.setDefaults = value;
    }

}
