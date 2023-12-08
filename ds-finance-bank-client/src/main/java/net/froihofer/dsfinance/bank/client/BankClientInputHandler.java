package net.froihofer.dsfinance.bank.client;

import common.BankingInterface;

class BankClientInputHandler {
    private RmiProxyBuilder rmiProxyBuilder = new RmiProxyBuilder();
    BankingInterface bankingInterface = rmiProxyBuilder.getRmiProxy("employee", "employeepass");;

    public void doFetchData(){
        System.out.println("I am fetching data from bankinginterface and returnign and doing stuff");
    }
}
