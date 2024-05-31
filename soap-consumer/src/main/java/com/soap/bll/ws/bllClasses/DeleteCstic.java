
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCstic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCstic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bompath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="csticId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "deleteCstic", propOrder = {
    "configId",
    "bompath",
    "csticId",
    "autoUnsetUserHiddenCstics"
})
public class DeleteCstic {

    protected String configId;
    protected String bompath;
    protected String csticId;
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
     * Gets the value of the bompath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBompath() {
        return bompath;
    }

    /**
     * Sets the value of the bompath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBompath(String value) {
        this.bompath = value;
    }

    /**
     * Gets the value of the csticId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsticId() {
        return csticId;
    }

    /**
     * Sets the value of the csticId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsticId(String value) {
        this.csticId = value;
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
