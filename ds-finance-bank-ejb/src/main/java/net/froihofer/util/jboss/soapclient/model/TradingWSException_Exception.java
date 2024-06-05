
package net.froihofer.util.jboss.soapclient.model;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "TradingWSException", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/")
public class TradingWSException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TradingWSException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TradingWSException_Exception(String message, TradingWSException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public TradingWSException_Exception(String message, TradingWSException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: net.froihofer.dsfinance.ws.trading.TradingWSException
     */
    public TradingWSException getFaultInfo() {
        return faultInfo;
    }

}
