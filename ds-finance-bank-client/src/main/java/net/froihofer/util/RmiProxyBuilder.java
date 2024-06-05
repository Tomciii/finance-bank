package net.froihofer.util;

import common.bankingInterface.BankingInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class RmiProxyBuilder {

    private static Logger log = LoggerFactory.getLogger(RmiProxyBuilder.class);

    public BankingInterface getRmiProxy(String username, String password) {
        try {
            log.info("Attempting to connect to the Rmi Proxy ...");
            Properties props = getProperties(username, password);
            WildflyJndiLookupHelper jndiHelper = new WildflyJndiLookupHelper(new InitialContext(props), "ds-finance-bank-ear", "ds-finance-bank-ejb", "");
            return jndiHelper.lookup("BankingInterfaceService", BankingInterface.class);
        } catch (NamingException e) {
            log.error("Failed to initialize InitialContext.",e);
        }

        throw new NullPointerException("Could not connect to Wild Fly Server.");
    }

    private Properties getProperties(String customer, String customerpass) {
        AuthCallbackHandler.setUsername(customer);
        AuthCallbackHandler.setPassword(customerpass);
        Properties props = new Properties();
        props.put(Context.SECURITY_PRINCIPAL,AuthCallbackHandler.getUsername());
        props.put(Context.SECURITY_CREDENTIALS,AuthCallbackHandler.getPassword());
        return props;
    }
}
