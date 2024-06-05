
package net.froihofer.util.jboss.soapclient.model;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

import java.math.BigDecimal;
import java.util.List;


/**
 * Available stock quotes can be searched with the operation 'findStockQuotesByCompanyName'.
 * The other operations generally accept a 'symbol' parameter that uniquely identifies a stock option.
 * 
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "TradingWebService", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TradingWebService {


    /**
     * Buys shares and returns the price per share effective for the buying transaction.
     * 
     * @param shares
     * @param symbol
     * @return
     *     returns java.math.BigDecimal
     * @throws TradingWSException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buy", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.Buy")
    @ResponseWrapper(localName = "buyResponse", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.BuyResponse")
    public BigDecimal buy(
        @WebParam(name = "symbol", targetNamespace = "")
        String symbol,
        @WebParam(name = "shares", targetNamespace = "")
        int shares)
        throws TradingWSException_Exception
    ;

    /**
     * Returns a list of the first 100 stock quotes where the company name contains the string specified in the 'partOfCompanyName' parameter
     * 
     * @param partOfCompanyName
     * @return
     *     returns java.util.List<net.froihofer.dsfinance.ws.trading.PublicStockQuote>
     * @throws TradingWSException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStockQuotesByCompanyName", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.FindStockQuotesByCompanyName")
    @ResponseWrapper(localName = "findStockQuotesByCompanyNameResponse", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.FindStockQuotesByCompanyNameResponse")
    public List<PublicStockQuote> findStockQuotesByCompanyName(
        @WebParam(name = "partOfCompanyName", targetNamespace = "")
        String partOfCompanyName)
        throws TradingWSException_Exception
    ;

    /**
     * Sells shares and returns the price per share effective for the selling transaction.
     * 
     * @param shares
     * @param symbol
     * @return
     *     returns java.math.BigDecimal
     * @throws TradingWSException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sell", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.Sell")
    @ResponseWrapper(localName = "sellResponse", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.SellResponse")
    public BigDecimal sell(
        @WebParam(name = "symbol", targetNamespace = "")
        String symbol,
        @WebParam(name = "shares", targetNamespace = "")
        int shares)
        throws TradingWSException_Exception
    ;

    /**
     * Returns the stock quotes for the stock options identified by the 'symbols' parameter.
     * 
     * @param symbols
     * @return
     *     returns java.util.List<net.froihofer.dsfinance.ws.trading.PublicStockQuote>
     * @throws TradingWSException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStockQuotes", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.GetStockQuotes")
    @ResponseWrapper(localName = "getStockQuotesResponse", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.GetStockQuotesResponse")
    public List<PublicStockQuote> getStockQuotes(
        @WebParam(name = "symbols", targetNamespace = "")
        List<String> symbols)
        throws TradingWSException_Exception
    ;

    /**
     * Returns a list of historical stock quotes, limited to a few months in the past.
     * 
     * @param symbol
     * @return
     *     returns java.util.List<net.froihofer.dsfinance.ws.trading.PublicStockQuote>
     * @throws TradingWSException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStockQuoteHistory", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.GetStockQuoteHistory")
    @ResponseWrapper(localName = "getStockQuoteHistoryResponse", targetNamespace = "http://trading.ws.dsfinance.froihofer.net/", className = "net.froihofer.dsfinance.ws.trading.GetStockQuoteHistoryResponse")
    public List<PublicStockQuote> getStockQuoteHistory(
        @WebParam(name = "symbol", targetNamespace = "")
        String symbol)
        throws TradingWSException_Exception
    ;

}
