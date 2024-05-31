
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createConfigForDu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createConfigForDu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "createConfigForDu", propOrder = {
    "duId",
    "setDefaults"
})
public class CreateConfigForDu {

    protected String duId;
    protected String setDefaults;

    /**
     * Gets the value of the duId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuId() {
        return duId;
    }

    /**
     * Sets the value of the duId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuId(String value) {
        this.duId = value;
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
