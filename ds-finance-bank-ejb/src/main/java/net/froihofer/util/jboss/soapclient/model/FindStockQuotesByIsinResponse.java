package net.froihofer.util.jboss.soapclient.model;

import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

public class FindStockQuotesByIsinResponse {
    @XmlElement(name = "return")
    protected List<PublicStockQuote> _return;

    /**
     * Gets the value of the return property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the return property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicStockQuote }
     *
     *
     * @return
     *     The value of the return property.
     */
    public List<PublicStockQuote> getReturn() {
        if (_return == null) {
            _return = new ArrayList<>();
        }
        return this._return;
    }

    @Override
    public String toString() {
        return "FindStockQuotesByIsinResponse{" +
                "_return=" + _return +
                '}';
    }
}
