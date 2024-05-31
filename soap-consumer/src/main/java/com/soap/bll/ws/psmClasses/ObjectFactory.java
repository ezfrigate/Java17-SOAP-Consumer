
package ws.psmClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.psmClasses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _PsmConfigurationSession_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmConfigurationSession");
    private final static QName _ArrayOfPsmCharacteristicGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ArrayOfPsmCharacteristicGroup");
    private final static QName _PsmCharacteristicGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmCharacteristicGroup");
    private final static QName _ArrayOfPsmCharacteristic_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ArrayOfPsmCharacteristic");
    private final static QName _PsmCharacteristic_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmCharacteristic");
    private final static QName _ArrayOfPsmCharacteristicValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ArrayOfPsmCharacteristicValue");
    private final static QName _PsmCharacteristicValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmCharacteristicValue");
    private final static QName _ArrayOfPsmSubReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ArrayOfPsmSubReference");
    private final static QName _PsmSubReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmSubReference");
    private final static QName _InvalidParameterFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "InvalidParameterFault");
    private final static QName _DataFormatterFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "DataFormatterFault");
    private final static QName _ConfigurationEngineFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ConfigurationEngineFault");
    private final static QName _PsmLayoutBehaviourTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "PsmLayoutBehaviourTypes");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _StartConfigurationConfigurableId_QNAME = new QName("http://tempuri.org/", "configurableId");
    private final static QName _StartConfigurationDatabase_QNAME = new QName("http://tempuri.org/", "database");
    private final static QName _StartConfigurationLanguage_QNAME = new QName("http://tempuri.org/", "language");
    private final static QName _StartConfigurationResponseStartConfigurationResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationResult");
    private final static QName _StartConfigurationWithSpecificBehaviourResponseStartConfigurationWithSpecificBehaviourResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationWithSpecificBehaviourResult");
    private final static QName _StartConfigurationPermissiveModeResponseStartConfigurationPermissiveModeResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationPermissiveModeResult");
    private final static QName _StartConfigurationPermissiveModeWithSpecificBehaviourResponseStartConfigurationPermissiveModeWithSpecificBehaviourResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationPermissiveModeWithSpecificBehaviourResult");
    private final static QName _StartConfigurationFromReferenceReference_QNAME = new QName("http://tempuri.org/", "reference");
    private final static QName _StartConfigurationFromReferenceResponseStartConfigurationFromReferenceResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationFromReferenceResult");
    private final static QName _StartConfigurationFromReferenceWithSpecificBehaviourResponseStartConfigurationFromReferenceWithSpecificBehaviourResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationFromReferenceWithSpecificBehaviourResult");
    private final static QName _StartConfigurationFromReferencePermissiveModeResponseStartConfigurationFromReferencePermissiveModeResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationFromReferencePermissiveModeResult");
    private final static QName _StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponseStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResult_QNAME = new QName("http://tempuri.org/", "StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResult");
    private final static QName _SetCharacteristicValuesCharacteristicId_QNAME = new QName("http://tempuri.org/", "characteristicId");
    private final static QName _SetCharacteristicValuesValues_QNAME = new QName("http://tempuri.org/", "values");
    private final static QName _SetCharacteristicValuesResponseSetCharacteristicValuesResult_QNAME = new QName("http://tempuri.org/", "SetCharacteristicValuesResult");
    private final static QName _GetConfigurationResponseGetConfigurationResult_QNAME = new QName("http://tempuri.org/", "GetConfigurationResult");
    private final static QName _ConfigurationEngineFaultDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Details");
    private final static QName _ConfigurationEngineFaultIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Issue");
    private final static QName _InvalidParameterFaultFaultyParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "FaultyParameter");
    private final static QName _PsmSubReferenceReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Reference");
    private final static QName _PsmCharacteristicValueId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Id");
    private final static QName _PsmCharacteristicValueName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Name");
    private final static QName _PsmCharacteristicDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Description");
    private final static QName _PsmCharacteristicValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Values");
    private final static QName _PsmCharacteristicGroupCharacteristics_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Characteristics");
    private final static QName _PsmConfigurationSessionCharacteristicGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "CharacteristicGroups");
    private final static QName _PsmConfigurationSessionConfigurableId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "ConfigurableId");
    private final static QName _PsmConfigurationSessionDatabase_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Database");
    private final static QName _PsmConfigurationSessionLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "Language");
    private final static QName _PsmConfigurationSessionRequestedLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "RequestedLanguage");
    private final static QName _PsmConfigurationSessionSelectedMacroRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "SelectedMacroRef");
    private final static QName _PsmConfigurationSessionSelectedSubReferences_QNAME = new QName("http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", "SelectedSubReferences");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.psmClasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartConfiguration }
     * 
     */
    public StartConfiguration createStartConfiguration() {
        return new StartConfiguration();
    }

    /**
     * Create an instance of {@link StartConfigurationResponse }
     * 
     */
    public StartConfigurationResponse createStartConfigurationResponse() {
        return new StartConfigurationResponse();
    }

    /**
     * Create an instance of {@link PsmConfigurationSession }
     * 
     */
    public PsmConfigurationSession createPsmConfigurationSession() {
        return new PsmConfigurationSession();
    }

    /**
     * Create an instance of {@link StartConfigurationWithSpecificBehaviour }
     * 
     */
    public StartConfigurationWithSpecificBehaviour createStartConfigurationWithSpecificBehaviour() {
        return new StartConfigurationWithSpecificBehaviour();
    }

    /**
     * Create an instance of {@link StartConfigurationWithSpecificBehaviourResponse }
     * 
     */
    public StartConfigurationWithSpecificBehaviourResponse createStartConfigurationWithSpecificBehaviourResponse() {
        return new StartConfigurationWithSpecificBehaviourResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationPermissiveMode }
     * 
     */
    public StartConfigurationPermissiveMode createStartConfigurationPermissiveMode() {
        return new StartConfigurationPermissiveMode();
    }

    /**
     * Create an instance of {@link StartConfigurationPermissiveModeResponse }
     * 
     */
    public StartConfigurationPermissiveModeResponse createStartConfigurationPermissiveModeResponse() {
        return new StartConfigurationPermissiveModeResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationPermissiveModeWithSpecificBehaviour }
     * 
     */
    public StartConfigurationPermissiveModeWithSpecificBehaviour createStartConfigurationPermissiveModeWithSpecificBehaviour() {
        return new StartConfigurationPermissiveModeWithSpecificBehaviour();
    }

    /**
     * Create an instance of {@link StartConfigurationPermissiveModeWithSpecificBehaviourResponse }
     * 
     */
    public StartConfigurationPermissiveModeWithSpecificBehaviourResponse createStartConfigurationPermissiveModeWithSpecificBehaviourResponse() {
        return new StartConfigurationPermissiveModeWithSpecificBehaviourResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReference }
     * 
     */
    public StartConfigurationFromReference createStartConfigurationFromReference() {
        return new StartConfigurationFromReference();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferenceResponse }
     * 
     */
    public StartConfigurationFromReferenceResponse createStartConfigurationFromReferenceResponse() {
        return new StartConfigurationFromReferenceResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferenceWithSpecificBehaviour }
     * 
     */
    public StartConfigurationFromReferenceWithSpecificBehaviour createStartConfigurationFromReferenceWithSpecificBehaviour() {
        return new StartConfigurationFromReferenceWithSpecificBehaviour();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferenceWithSpecificBehaviourResponse }
     * 
     */
    public StartConfigurationFromReferenceWithSpecificBehaviourResponse createStartConfigurationFromReferenceWithSpecificBehaviourResponse() {
        return new StartConfigurationFromReferenceWithSpecificBehaviourResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferencePermissiveMode }
     * 
     */
    public StartConfigurationFromReferencePermissiveMode createStartConfigurationFromReferencePermissiveMode() {
        return new StartConfigurationFromReferencePermissiveMode();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferencePermissiveModeResponse }
     * 
     */
    public StartConfigurationFromReferencePermissiveModeResponse createStartConfigurationFromReferencePermissiveModeResponse() {
        return new StartConfigurationFromReferencePermissiveModeResponse();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour }
     * 
     */
    public StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviour() {
        return new StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour();
    }

    /**
     * Create an instance of {@link StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse }
     * 
     */
    public StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse() {
        return new StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse();
    }

    /**
     * Create an instance of {@link SetCharacteristicValues }
     * 
     */
    public SetCharacteristicValues createSetCharacteristicValues() {
        return new SetCharacteristicValues();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link SetCharacteristicValuesResponse }
     * 
     */
    public SetCharacteristicValuesResponse createSetCharacteristicValuesResponse() {
        return new SetCharacteristicValuesResponse();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteConfiguration }
     * 
     */
    public DeleteConfiguration createDeleteConfiguration() {
        return new DeleteConfiguration();
    }

    /**
     * Create an instance of {@link DeleteConfigurationResponse }
     * 
     */
    public DeleteConfigurationResponse createDeleteConfigurationResponse() {
        return new DeleteConfigurationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPsmCharacteristicGroup }
     * 
     */
    public ArrayOfPsmCharacteristicGroup createArrayOfPsmCharacteristicGroup() {
        return new ArrayOfPsmCharacteristicGroup();
    }

    /**
     * Create an instance of {@link PsmCharacteristicGroup }
     * 
     */
    public PsmCharacteristicGroup createPsmCharacteristicGroup() {
        return new PsmCharacteristicGroup();
    }

    /**
     * Create an instance of {@link ArrayOfPsmCharacteristic }
     * 
     */
    public ArrayOfPsmCharacteristic createArrayOfPsmCharacteristic() {
        return new ArrayOfPsmCharacteristic();
    }

    /**
     * Create an instance of {@link PsmCharacteristic }
     * 
     */
    public PsmCharacteristic createPsmCharacteristic() {
        return new PsmCharacteristic();
    }

    /**
     * Create an instance of {@link ArrayOfPsmCharacteristicValue }
     * 
     */
    public ArrayOfPsmCharacteristicValue createArrayOfPsmCharacteristicValue() {
        return new ArrayOfPsmCharacteristicValue();
    }

    /**
     * Create an instance of {@link PsmCharacteristicValue }
     * 
     */
    public PsmCharacteristicValue createPsmCharacteristicValue() {
        return new PsmCharacteristicValue();
    }

    /**
     * Create an instance of {@link ArrayOfPsmSubReference }
     * 
     */
    public ArrayOfPsmSubReference createArrayOfPsmSubReference() {
        return new ArrayOfPsmSubReference();
    }

    /**
     * Create an instance of {@link PsmSubReference }
     * 
     */
    public PsmSubReference createPsmSubReference() {
        return new PsmSubReference();
    }

    /**
     * Create an instance of {@link InvalidParameterFault }
     * 
     */
    public InvalidParameterFault createInvalidParameterFault() {
        return new InvalidParameterFault();
    }

    /**
     * Create an instance of {@link DataFormatterFault }
     * 
     */
    public DataFormatterFault createDataFormatterFault() {
        return new DataFormatterFault();
    }

    /**
     * Create an instance of {@link ConfigurationEngineFault }
     * 
     */
    public ConfigurationEngineFault createConfigurationEngineFault() {
        return new ConfigurationEngineFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmConfigurationSession")
    public JAXBElement<PsmConfigurationSession> createPsmConfigurationSession(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_PsmConfigurationSession_QNAME, PsmConfigurationSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ArrayOfPsmCharacteristicGroup")
    public JAXBElement<ArrayOfPsmCharacteristicGroup> createArrayOfPsmCharacteristicGroup(ArrayOfPsmCharacteristicGroup value) {
        return new JAXBElement<ArrayOfPsmCharacteristicGroup>(_ArrayOfPsmCharacteristicGroup_QNAME, ArrayOfPsmCharacteristicGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmCharacteristicGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmCharacteristicGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmCharacteristicGroup")
    public JAXBElement<PsmCharacteristicGroup> createPsmCharacteristicGroup(PsmCharacteristicGroup value) {
        return new JAXBElement<PsmCharacteristicGroup>(_PsmCharacteristicGroup_QNAME, PsmCharacteristicGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ArrayOfPsmCharacteristic")
    public JAXBElement<ArrayOfPsmCharacteristic> createArrayOfPsmCharacteristic(ArrayOfPsmCharacteristic value) {
        return new JAXBElement<ArrayOfPsmCharacteristic>(_ArrayOfPsmCharacteristic_QNAME, ArrayOfPsmCharacteristic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmCharacteristic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmCharacteristic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmCharacteristic")
    public JAXBElement<PsmCharacteristic> createPsmCharacteristic(PsmCharacteristic value) {
        return new JAXBElement<PsmCharacteristic>(_PsmCharacteristic_QNAME, PsmCharacteristic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ArrayOfPsmCharacteristicValue")
    public JAXBElement<ArrayOfPsmCharacteristicValue> createArrayOfPsmCharacteristicValue(ArrayOfPsmCharacteristicValue value) {
        return new JAXBElement<ArrayOfPsmCharacteristicValue>(_ArrayOfPsmCharacteristicValue_QNAME, ArrayOfPsmCharacteristicValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmCharacteristicValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmCharacteristicValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmCharacteristicValue")
    public JAXBElement<PsmCharacteristicValue> createPsmCharacteristicValue(PsmCharacteristicValue value) {
        return new JAXBElement<PsmCharacteristicValue>(_PsmCharacteristicValue_QNAME, PsmCharacteristicValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ArrayOfPsmSubReference")
    public JAXBElement<ArrayOfPsmSubReference> createArrayOfPsmSubReference(ArrayOfPsmSubReference value) {
        return new JAXBElement<ArrayOfPsmSubReference>(_ArrayOfPsmSubReference_QNAME, ArrayOfPsmSubReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmSubReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmSubReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmSubReference")
    public JAXBElement<PsmSubReference> createPsmSubReference(PsmSubReference value) {
        return new JAXBElement<PsmSubReference>(_PsmSubReference_QNAME, PsmSubReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParameterFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidParameterFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "InvalidParameterFault")
    public JAXBElement<InvalidParameterFault> createInvalidParameterFault(InvalidParameterFault value) {
        return new JAXBElement<InvalidParameterFault>(_InvalidParameterFault_QNAME, InvalidParameterFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataFormatterFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataFormatterFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "DataFormatterFault")
    public JAXBElement<DataFormatterFault> createDataFormatterFault(DataFormatterFault value) {
        return new JAXBElement<DataFormatterFault>(_DataFormatterFault_QNAME, DataFormatterFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationEngineFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfigurationEngineFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ConfigurationEngineFault")
    public JAXBElement<ConfigurationEngineFault> createConfigurationEngineFault(ConfigurationEngineFault value) {
        return new JAXBElement<ConfigurationEngineFault>(_ConfigurationEngineFault_QNAME, ConfigurationEngineFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmLayoutBehaviourTypes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmLayoutBehaviourTypes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "PsmLayoutBehaviourTypes")
    public JAXBElement<PsmLayoutBehaviourTypes> createPsmLayoutBehaviourTypes(PsmLayoutBehaviourTypes value) {
        return new JAXBElement<PsmLayoutBehaviourTypes>(_PsmLayoutBehaviourTypes_QNAME, PsmLayoutBehaviourTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfiguration.class)
    public JAXBElement<String> createStartConfigurationConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfiguration.class)
    public JAXBElement<String> createStartConfigurationDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfiguration.class)
    public JAXBElement<String> createStartConfigurationLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationResult", scope = StartConfigurationResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationResponseStartConfigurationResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationResponseStartConfigurationResult_QNAME, PsmConfigurationSession.class, StartConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationWithSpecificBehaviourConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationWithSpecificBehaviourDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationWithSpecificBehaviourLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationWithSpecificBehaviourResult", scope = StartConfigurationWithSpecificBehaviourResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationWithSpecificBehaviourResponseStartConfigurationWithSpecificBehaviourResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationWithSpecificBehaviourResponseStartConfigurationWithSpecificBehaviourResult_QNAME, PsmConfigurationSession.class, StartConfigurationWithSpecificBehaviourResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationPermissiveMode.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationPermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationPermissiveMode.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationPermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationPermissiveMode.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationPermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationPermissiveModeResult", scope = StartConfigurationPermissiveModeResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationPermissiveModeResponseStartConfigurationPermissiveModeResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationPermissiveModeResponseStartConfigurationPermissiveModeResult_QNAME, PsmConfigurationSession.class, StartConfigurationPermissiveModeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationPermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeWithSpecificBehaviourConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationPermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationPermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeWithSpecificBehaviourDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationPermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationPermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationPermissiveModeWithSpecificBehaviourLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationPermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationPermissiveModeWithSpecificBehaviourResult", scope = StartConfigurationPermissiveModeWithSpecificBehaviourResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationPermissiveModeWithSpecificBehaviourResponseStartConfigurationPermissiveModeWithSpecificBehaviourResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationPermissiveModeWithSpecificBehaviourResponseStartConfigurationPermissiveModeWithSpecificBehaviourResult_QNAME, PsmConfigurationSession.class, StartConfigurationPermissiveModeWithSpecificBehaviourResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationFromReference.class)
    public JAXBElement<String> createStartConfigurationFromReferenceConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationFromReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reference", scope = StartConfigurationFromReference.class)
    public JAXBElement<String> createStartConfigurationFromReferenceReference(String value) {
        return new JAXBElement<String>(_StartConfigurationFromReferenceReference_QNAME, String.class, StartConfigurationFromReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationFromReference.class)
    public JAXBElement<String> createStartConfigurationFromReferenceDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationFromReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationFromReference.class)
    public JAXBElement<String> createStartConfigurationFromReferenceLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationFromReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationFromReferenceResult", scope = StartConfigurationFromReferenceResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationFromReferenceResponseStartConfigurationFromReferenceResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationFromReferenceResponseStartConfigurationFromReferenceResult_QNAME, PsmConfigurationSession.class, StartConfigurationFromReferenceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationFromReferenceWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferenceWithSpecificBehaviourConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationFromReferenceWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reference", scope = StartConfigurationFromReferenceWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferenceWithSpecificBehaviourReference(String value) {
        return new JAXBElement<String>(_StartConfigurationFromReferenceReference_QNAME, String.class, StartConfigurationFromReferenceWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationFromReferenceWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferenceWithSpecificBehaviourDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationFromReferenceWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationFromReferenceWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferenceWithSpecificBehaviourLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationFromReferenceWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationFromReferenceWithSpecificBehaviourResult", scope = StartConfigurationFromReferenceWithSpecificBehaviourResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationFromReferenceWithSpecificBehaviourResponseStartConfigurationFromReferenceWithSpecificBehaviourResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationFromReferenceWithSpecificBehaviourResponseStartConfigurationFromReferenceWithSpecificBehaviourResult_QNAME, PsmConfigurationSession.class, StartConfigurationFromReferenceWithSpecificBehaviourResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationFromReferencePermissiveMode.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationFromReferencePermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reference", scope = StartConfigurationFromReferencePermissiveMode.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeReference(String value) {
        return new JAXBElement<String>(_StartConfigurationFromReferenceReference_QNAME, String.class, StartConfigurationFromReferencePermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationFromReferencePermissiveMode.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationFromReferencePermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationFromReferencePermissiveMode.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationFromReferencePermissiveMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationFromReferencePermissiveModeResult", scope = StartConfigurationFromReferencePermissiveModeResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationFromReferencePermissiveModeResponseStartConfigurationFromReferencePermissiveModeResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationFromReferencePermissiveModeResponseStartConfigurationFromReferencePermissiveModeResult_QNAME, PsmConfigurationSession.class, StartConfigurationFromReferencePermissiveModeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "configurableId", scope = StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourConfigurableId(String value) {
        return new JAXBElement<String>(_StartConfigurationConfigurableId_QNAME, String.class, StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reference", scope = StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourReference(String value) {
        return new JAXBElement<String>(_StartConfigurationFromReferenceReference_QNAME, String.class, StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "database", scope = StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourDatabase(String value) {
        return new JAXBElement<String>(_StartConfigurationDatabase_QNAME, String.class, StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "language", scope = StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class)
    public JAXBElement<String> createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourLanguage(String value) {
        return new JAXBElement<String>(_StartConfigurationLanguage_QNAME, String.class, StartConfigurationFromReferencePermissiveModeWithSpecificBehaviour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResult", scope = StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse.class)
    public JAXBElement<PsmConfigurationSession> createStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponseStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponseStartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResult_QNAME, PsmConfigurationSession.class, StartConfigurationFromReferencePermissiveModeWithSpecificBehaviourResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "characteristicId", scope = SetCharacteristicValues.class)
    public JAXBElement<String> createSetCharacteristicValuesCharacteristicId(String value) {
        return new JAXBElement<String>(_SetCharacteristicValuesCharacteristicId_QNAME, String.class, SetCharacteristicValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "values", scope = SetCharacteristicValues.class)
    public JAXBElement<ArrayOfstring> createSetCharacteristicValuesValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SetCharacteristicValuesValues_QNAME, ArrayOfstring.class, SetCharacteristicValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SetCharacteristicValuesResult", scope = SetCharacteristicValuesResponse.class)
    public JAXBElement<PsmConfigurationSession> createSetCharacteristicValuesResponseSetCharacteristicValuesResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_SetCharacteristicValuesResponseSetCharacteristicValuesResult_QNAME, PsmConfigurationSession.class, SetCharacteristicValuesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PsmConfigurationSession }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetConfigurationResult", scope = GetConfigurationResponse.class)
    public JAXBElement<PsmConfigurationSession> createGetConfigurationResponseGetConfigurationResult(PsmConfigurationSession value) {
        return new JAXBElement<PsmConfigurationSession>(_GetConfigurationResponseGetConfigurationResult_QNAME, PsmConfigurationSession.class, GetConfigurationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Details", scope = ConfigurationEngineFault.class)
    public JAXBElement<String> createConfigurationEngineFaultDetails(String value) {
        return new JAXBElement<String>(_ConfigurationEngineFaultDetails_QNAME, String.class, ConfigurationEngineFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Issue", scope = ConfigurationEngineFault.class)
    public JAXBElement<String> createConfigurationEngineFaultIssue(String value) {
        return new JAXBElement<String>(_ConfigurationEngineFaultIssue_QNAME, String.class, ConfigurationEngineFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Details", scope = DataFormatterFault.class)
    public JAXBElement<String> createDataFormatterFaultDetails(String value) {
        return new JAXBElement<String>(_ConfigurationEngineFaultDetails_QNAME, String.class, DataFormatterFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Issue", scope = DataFormatterFault.class)
    public JAXBElement<String> createDataFormatterFaultIssue(String value) {
        return new JAXBElement<String>(_ConfigurationEngineFaultIssue_QNAME, String.class, DataFormatterFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Details", scope = InvalidParameterFault.class)
    public JAXBElement<String> createInvalidParameterFaultDetails(String value) {
        return new JAXBElement<String>(_ConfigurationEngineFaultDetails_QNAME, String.class, InvalidParameterFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "FaultyParameter", scope = InvalidParameterFault.class)
    public JAXBElement<String> createInvalidParameterFaultFaultyParameter(String value) {
        return new JAXBElement<String>(_InvalidParameterFaultFaultyParameter_QNAME, String.class, InvalidParameterFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Reference", scope = PsmSubReference.class)
    public JAXBElement<String> createPsmSubReferenceReference(String value) {
        return new JAXBElement<String>(_PsmSubReferenceReference_QNAME, String.class, PsmSubReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Id", scope = PsmCharacteristicValue.class)
    public JAXBElement<String> createPsmCharacteristicValueId(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueId_QNAME, String.class, PsmCharacteristicValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Name", scope = PsmCharacteristicValue.class)
    public JAXBElement<String> createPsmCharacteristicValueName(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueName_QNAME, String.class, PsmCharacteristicValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Description", scope = PsmCharacteristic.class)
    public JAXBElement<String> createPsmCharacteristicDescription(String value) {
        return new JAXBElement<String>(_PsmCharacteristicDescription_QNAME, String.class, PsmCharacteristic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Id", scope = PsmCharacteristic.class)
    public JAXBElement<String> createPsmCharacteristicId(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueId_QNAME, String.class, PsmCharacteristic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Name", scope = PsmCharacteristic.class)
    public JAXBElement<String> createPsmCharacteristicName(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueName_QNAME, String.class, PsmCharacteristic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Values", scope = PsmCharacteristic.class)
    public JAXBElement<ArrayOfPsmCharacteristicValue> createPsmCharacteristicValues(ArrayOfPsmCharacteristicValue value) {
        return new JAXBElement<ArrayOfPsmCharacteristicValue>(_PsmCharacteristicValues_QNAME, ArrayOfPsmCharacteristicValue.class, PsmCharacteristic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristic }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Characteristics", scope = PsmCharacteristicGroup.class)
    public JAXBElement<ArrayOfPsmCharacteristic> createPsmCharacteristicGroupCharacteristics(ArrayOfPsmCharacteristic value) {
        return new JAXBElement<ArrayOfPsmCharacteristic>(_PsmCharacteristicGroupCharacteristics_QNAME, ArrayOfPsmCharacteristic.class, PsmCharacteristicGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Id", scope = PsmCharacteristicGroup.class)
    public JAXBElement<String> createPsmCharacteristicGroupId(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueId_QNAME, String.class, PsmCharacteristicGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Name", scope = PsmCharacteristicGroup.class)
    public JAXBElement<String> createPsmCharacteristicGroupName(String value) {
        return new JAXBElement<String>(_PsmCharacteristicValueName_QNAME, String.class, PsmCharacteristicGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmCharacteristicGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "CharacteristicGroups", scope = PsmConfigurationSession.class)
    public JAXBElement<ArrayOfPsmCharacteristicGroup> createPsmConfigurationSessionCharacteristicGroups(ArrayOfPsmCharacteristicGroup value) {
        return new JAXBElement<ArrayOfPsmCharacteristicGroup>(_PsmConfigurationSessionCharacteristicGroups_QNAME, ArrayOfPsmCharacteristicGroup.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "ConfigurableId", scope = PsmConfigurationSession.class)
    public JAXBElement<String> createPsmConfigurationSessionConfigurableId(String value) {
        return new JAXBElement<String>(_PsmConfigurationSessionConfigurableId_QNAME, String.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Database", scope = PsmConfigurationSession.class)
    public JAXBElement<String> createPsmConfigurationSessionDatabase(String value) {
        return new JAXBElement<String>(_PsmConfigurationSessionDatabase_QNAME, String.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "Language", scope = PsmConfigurationSession.class)
    public JAXBElement<String> createPsmConfigurationSessionLanguage(String value) {
        return new JAXBElement<String>(_PsmConfigurationSessionLanguage_QNAME, String.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "RequestedLanguage", scope = PsmConfigurationSession.class)
    public JAXBElement<String> createPsmConfigurationSessionRequestedLanguage(String value) {
        return new JAXBElement<String>(_PsmConfigurationSessionRequestedLanguage_QNAME, String.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "SelectedMacroRef", scope = PsmConfigurationSession.class)
    public JAXBElement<String> createPsmConfigurationSessionSelectedMacroRef(String value) {
        return new JAXBElement<String>(_PsmConfigurationSessionSelectedMacroRef_QNAME, String.class, PsmConfigurationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPsmSubReference }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService", name = "SelectedSubReferences", scope = PsmConfigurationSession.class)
    public JAXBElement<ArrayOfPsmSubReference> createPsmConfigurationSessionSelectedSubReferences(ArrayOfPsmSubReference value) {
        return new JAXBElement<ArrayOfPsmSubReference>(_PsmConfigurationSessionSelectedSubReferences_QNAME, ArrayOfPsmSubReference.class, PsmConfigurationSession.class, value);
    }

}
