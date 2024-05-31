
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createConfigForKB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createConfigForKB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kbVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "createConfigForKB", propOrder = {
    "kbName",
    "kbVersion",
    "languageCode",
    "setDefaults"
})
public class CreateConfigForKB {

    protected String kbName;
    protected String kbVersion;
    protected String languageCode;
    protected String setDefaults;

    /**
     * Gets the value of the kbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbName() {
        return kbName;
    }

    /**
     * Sets the value of the kbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbName(String value) {
        this.kbName = value;
    }

    /**
     * Gets the value of the kbVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbVersion() {
        return kbVersion;
    }

    /**
     * Sets the value of the kbVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbVersion(String value) {
        this.kbVersion = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
