package net.froihofer.dsfinance.bank.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class for starting the bank client.
 *
 */
public class BankClient {
  private static Logger log = LoggerFactory.getLogger(BankClient.class);
  private BankClientConsole bankClientConsole = new BankClientConsole();

  public static void main(String[] args) {
    System.out.println("Welcome to the Banking Console Application.");
    BankClient client = new BankClient();
    client.run();
  }

  private void run() {
    System.out.println("Please choose your input:");
    bankClientConsole.processInput();
  }
}