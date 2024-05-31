
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hiveXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadConfig", propOrder = {
    "hiveXml"
})
public class UploadConfig {

    protected String hiveXml;

    /**
     * Gets the value of the hiveXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiveXml() {
        return hiveXml;
    }

    /**
     * Sets the value of the hiveXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiveXml(String value) {
        this.hiveXml = value;
    }

}
