package common.bankingInterface;

import javax.ejb.Remote;

@Remote
public interface BankingInterface {

    // TODO - Refactor to stateful bean so that we can remove login, isEmployee, isCustomer
    /** Returns a boolean value, if a Member for given username and password is a member. */
    public boolean login(String username, String password) throws BankingInterfaceException;

    public boolean isEmployee() throws BankingInterfaceException;

    public boolean isCustomer() throws BankingInterfaceException;

    public String searchStockByISIN(String isin) throws BankingInterfaceException;

    // TODO - Return StockDTO instead of string
    public String searchStockByName(String name) throws BankingInterfaceException;

    public void buySockByISIN(String ISIN, double amount, String customerNr) throws BankingInterfaceException;

    public void sellStockByISIN(String ISIN, double amount, String customerNr) throws BankingInterfaceException;

    public String[] getDepot(String customerNr) throws BankingInterfaceException;

    public void createPerson(String name, String givenname, String address, int svnr, String username, String password);

    public String createCustomer(String name, String givenname, String address, int svnr, String username, String password);

    public void createEmployee(int snvt);

    // TODO: Return Person
    public String searchCustomer(Integer customerNr)  throws BankingInterfaceException;

    public String getInvestableVolume() throws BankingInterfaceException;


    /** Persistently stores the value of the given variable. */
    //public void storeVariable(VariableDTO variable) throws common.bankingInterface.BankingInterfaceException;

    /** Returns the value of a persisted variable. */
    public long getVariable(String name) throws BankingInterfaceException;
}
