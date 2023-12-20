package net.froihofer.dsfinance.bank.client.employee;

public class BankClient {
  private BankClientConsole bankClientConsole = new BankClientConsole();

  public static void main(String[] args) {
    BankClient client = new BankClient();
    client.run();
  }

  private void run() {
    bankClientConsole.processInput();
  }
}