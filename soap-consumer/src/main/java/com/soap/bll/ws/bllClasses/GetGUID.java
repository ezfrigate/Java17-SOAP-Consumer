
package ws.bllClasses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGUID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGUID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="du_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kb_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alias_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="project_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="du_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="du_build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="du_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="std_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="project_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGUID", propOrder = {
    "duCode",
    "kbCode",
    "scope",
    "language",
    "aliasCode",
    "projectCode",
    "duStatus",
    "duBuild",
    "duVersion",
    "stdVersion",
    "projectVersion",
    "country"
})
public class GetGUID {

    @XmlElement(name = "du_code")
    protected String duCode;
    @XmlElement(name = "kb_code")
    protected String kbCode;
    protected String scope;
    protected String language;
    @XmlElement(name = "alias_code")
    protected String aliasCode;
    @XmlElement(name = "project_code")
    protected String projectCode;
    @XmlElement(name = "du_status")
    protected String duStatus;
    @XmlElement(name = "du_build")
    protected String duBuild;
    @XmlElement(name = "du_version")
    protected String duVersion;
    @XmlElement(name = "std_version")
    protected String stdVersion;
    @XmlElement(name = "project_version")
    protected String projectVersion;
    protected String country;

    /**
     * Gets the value of the duCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuCode() {
        return duCode;
    }

    /**
     * Sets the value of the duCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuCode(String value) {
        this.duCode = value;
    }

    /**
     * Gets the value of the kbCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKbCode() {
        return kbCode;
    }

    /**
     * Sets the value of the kbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKbCode(String value) {
        this.kbCode = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the aliasCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasCode() {
        return aliasCode;
    }

    /**
     * Sets the value of the aliasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasCode(String value) {
        this.aliasCode = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the duStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuStatus() {
        return duStatus;
    }

    /**
     * Sets the value of the duStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuStatus(String value) {
        this.duStatus = value;
    }

    /**
     * Gets the value of the duBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuBuild() {
        return duBuild;
    }

    /**
     * Sets the value of the duBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuBuild(String value) {
        this.duBuild = value;
    }

    /**
     * Gets the value of the duVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuVersion() {
        return duVersion;
    }

    /**
     * Sets the value of the duVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuVersion(String value) {
        this.duVersion = value;
    }

    /**
     * Gets the value of the stdVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdVersion() {
        return stdVersion;
    }

    /**
     * Sets the value of the stdVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdVersion(String value) {
        this.stdVersion = value;
    }

    /**
     * Gets the value of the projectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectVersion() {
        return projectVersion;
    }

    /**
     * Sets the value of the projectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectVersion(String value) {
        this.projectVersion = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
