
package net.froihofer.util.jboss.soapclient.model;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "TradingWebServiceService", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", wsdlLocation = "https://edu.dedisys.org/ds-finance/ws/TradingService?wsdl")
public class TradingWebServiceService
    extends Service
{

    private static final URL TRADINGWEBSERVICESERVICE_WSDL_LOCATION;
    private static final WebServiceException TRADINGWEBSERVICESERVICE_EXCEPTION;
    private static final QName TRADINGWEBSERVICESERVICE_QNAME = new QName("http://trading.ws.dsfinance.froihofer.net/", "TradingWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://edu.dedisys.org/ds-finance/ws/TradingService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRADINGWEBSERVICESERVICE_WSDL_LOCATION = url;
        TRADINGWEBSERVICESERVICE_EXCEPTION = e;
    }

    public TradingWebServiceService() {
        super(__getWsdlLocation(), TRADINGWEBSERVICESERVICE_QNAME);
    }

    public TradingWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRADINGWEBSERVICESERVICE_QNAME, features);
    }

    public TradingWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, TRADINGWEBSERVICESERVICE_QNAME);
    }

    public TradingWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRADINGWEBSERVICESERVICE_QNAME, features);
    }

    public TradingWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TradingWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TradingWebService
     */
    @WebEndpoint(name = "TradingWebServicePort")
    public TradingWebService getTradingWebServicePort() {
        return super.getPort(new QName("http://trading.ws.dsfinance.froihofer.net/", "TradingWebServicePort"), TradingWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TradingWebService
     */
    @WebEndpoint(name = "TradingWebServicePort")
    public TradingWebService getTradingWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://trading.ws.dsfinance.froihofer.net/", "TradingWebServicePort"), TradingWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRADINGWEBSERVICESERVICE_EXCEPTION!= null) {
            throw TRADINGWEBSERVICESERVICE_EXCEPTION;
        }
        return TRADINGWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
