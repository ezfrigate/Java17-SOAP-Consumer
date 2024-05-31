
package ws.bllClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCstics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCstics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setCstics" type="{http://schneider.com/bll/ws/}setCsticDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="autoUnsetUserHiddenCstics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCstics", propOrder = {
    "configId",
    "setCstics",
    "autoUnsetUserHiddenCstics"
})
public class DeleteCstics {

    protected String configId;
    protected List<SetCsticDef> setCstics;
    protected String autoUnsetUserHiddenCstics;

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
     * Gets the value of the autoUnsetUserHiddenCstics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoUnsetUserHiddenCstics() {
        return autoUnsetUserHiddenCstics;
    }

    /**
     * Sets the value of the autoUnsetUserHiddenCstics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoUnsetUserHiddenCstics(String value) {
        this.autoUnsetUserHiddenCstics = value;
    }

}
