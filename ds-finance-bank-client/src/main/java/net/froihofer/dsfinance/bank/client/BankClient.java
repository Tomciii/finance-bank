package net.froihofer.dsfinance.bank.client;

public class BankClient {
  private BankClientConsole bankClientConsole = new BankClientConsole();

  public static void main(String[] args) {
    BankClient client = new BankClient();
    client.run();
  }

  private void run() {
    System.out.println("Welcome to the Banking Client Application.");
    bankClientConsole.processInput();
  }
}