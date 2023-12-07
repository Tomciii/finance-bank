package net.froihofer.dsfinance.bank.client;

import common.BankingInterface;
import net.froihofer.util.AuthCallbackHandler;
import net.froihofer.util.WildflyJndiLookupHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class RmiProxyBuilder {

    private static Logger log = LoggerFactory.getLogger(RmiProxyBuilder.class);

    /**
     * Skeleton method for performing an RMI lookup
     */
     BankingInterface getRmiProxy(String username, String password) {
        Properties props = getProperties(username, password);

        try {
            WildflyJndiLookupHelper jndiHelper = new WildflyJndiLookupHelper(new InitialContext(props), "ds-finance-bank-ear", "ds-finance-bank-ejb", "");
            BankingInterface bankingInterface = jndiHelper.lookup("BankingInterfaceService", BankingInterface.class);

            return bankingInterface;
        }
        catch (NamingException e) {
            log.error("Failed to initialize InitialContext.",e);
        }

        return null;
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
