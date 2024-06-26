
package ws.psmClasses;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "PsmConfigurationService", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/Code%20Stuff/Java17-SOAP-Consumer/soap-consumer/src/main/resources/wsdl/PsmConfigurationService.wsdl")
public class PsmConfigurationService
    extends Service
{

    private final static URL PSMCONFIGURATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PSMCONFIGURATIONSERVICE_EXCEPTION;
    private final static QName PSMCONFIGURATIONSERVICE_QNAME = new QName("http://tempuri.org/", "PsmConfigurationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Code%20Stuff/Java17-SOAP-Consumer/soap-consumer/src/main/resources/wsdl/PsmConfigurationService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PSMCONFIGURATIONSERVICE_WSDL_LOCATION = url;
        PSMCONFIGURATIONSERVICE_EXCEPTION = e;
    }

    public PsmConfigurationService() {
        super(__getWsdlLocation(), PSMCONFIGURATIONSERVICE_QNAME);
    }

    public PsmConfigurationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PSMCONFIGURATIONSERVICE_QNAME, features);
    }

    public PsmConfigurationService(URL wsdlLocation) {
        super(wsdlLocation, PSMCONFIGURATIONSERVICE_QNAME);
    }

    public PsmConfigurationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PSMCONFIGURATIONSERVICE_QNAME, features);
    }

    public PsmConfigurationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PsmConfigurationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IPsmConfigurationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPsmConfigurationService")
    public IPsmConfigurationService getBasicHttpBindingIPsmConfigurationService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPsmConfigurationService"), IPsmConfigurationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPsmConfigurationService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPsmConfigurationService")
    public IPsmConfigurationService getBasicHttpBindingIPsmConfigurationService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPsmConfigurationService"), IPsmConfigurationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PSMCONFIGURATIONSERVICE_EXCEPTION!= null) {
            throw PSMCONFIGURATIONSERVICE_EXCEPTION;
        }
        return PSMCONFIGURATIONSERVICE_WSDL_LOCATION;
    }

}
