
package ws.bllClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createConfigFromRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createConfigFromRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kbVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setCstics" type="{http://schneider.com/bll/ws/}setCsticDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hardset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "createConfigFromRef", propOrder = {
    "kbName",
    "kbVersion",
    "languageCode",
    "setCstics",
    "hardset",
    "setDefaults"
})
public class CreateConfigFromRef {

    protected String kbName;
    protected String kbVersion;
    protected String languageCode;
    protected List<SetCsticDef> setCstics;
    protected String hardset;
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
     * Gets the value of the setCstics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the setCstics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetCstics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetCsticDef }
     * 
     * 
     */
    public List<SetCsticDef> getSetCstics() {
        if (setCstics == null) {
            setCstics = new ArrayList<SetCsticDef>();
        }
        return this.setCstics;
    }

    /**
     * Gets the value of the hardset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardset() {
        return hardset;
    }

    /**
     * Sets the value of the hardset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardset(String value) {
        this.hardset = value;
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
