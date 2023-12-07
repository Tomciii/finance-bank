package net.froihofer.dsfinance.bank.client;

import common.BankingInterface;
import common.BankingInterfaceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class for starting the bank client.
 *
 */
public class BankClient {
  private static Logger log = LoggerFactory.getLogger(BankClient.class);
  private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();

  private void run() {
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("customer", "customerpass");

    try{
        bankingInterface.createPerson("Vorname", "Nachname", "Teststraße", 1123984637, "username", "password");

    }catch (NullPointerException e) {
      log.error(e.getMessage());
    } catch(Exception e){
      log.error("Something went wrong: "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    BankClient client = new BankClient();
    client.run();
  }
}