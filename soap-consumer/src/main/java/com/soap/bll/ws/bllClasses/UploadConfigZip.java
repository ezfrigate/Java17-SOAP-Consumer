
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadConfigZip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadConfigZip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zipStrEncoded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadConfigZip", propOrder = {
    "zipStrEncoded"
})
public class UploadConfigZip {

    protected String zipStrEncoded;

    /**
     * Gets the value of the zipStrEncoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipStrEncoded() {
        return zipStrEncoded;
    }

    /**
     * Sets the value of the zipStrEncoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipStrEncoded(String value) {
        this.zipStrEncoded = value;
    }

}
