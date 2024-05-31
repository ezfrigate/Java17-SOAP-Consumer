
package ws.psmClasses;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "InvalidParameterFault", targetNamespace = "http://schemas.datacontract.org/2004/07/SchneiderElectric.CustomerSoftware.PACE.PsmWcfService")
public class IPsmConfigurationServiceStartConfigurationFromReferenceWithSpecificBehaviourInvalidParameterFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidParameterFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IPsmConfigurationServiceStartConfigurationFromReferenceWithSpecificBehaviourInvalidParameterFaultFaultFaultMessage(String message, InvalidParameterFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IPsmConfigurationServiceStartConfigurationFromReferenceWithSpecificBehaviourInvalidParameterFaultFaultFaultMessage(String message, InvalidParameterFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ws.psmClasses.InvalidParameterFault
     */
    public InvalidParameterFault getFaultInfo() {
        return faultInfo;
    }

}
