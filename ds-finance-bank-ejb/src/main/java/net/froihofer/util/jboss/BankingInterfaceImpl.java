package net.froihofer.util.jboss;

import common.bankingInterface.BankingInterface;
import common.bankingInterface.BankingInterfaceException;
import common.dto.DepotDTO;
import common.dto.ListStockDTO;
import common.dto.TradeDTO;
import jakarta.xml.bind.JAXBException;
import net.froihofer.util.jboss.persistance.dao.PersonDAO;
import net.froihofer.util.jboss.persistance.entity.Depot;
import net.froihofer.util.jboss.persistance.mapper.DepotMapper;
import net.froihofer.util.jboss.persistance.mapper.PersonMapper;
import net.froihofer.util.jboss.persistance.mapper.StockMapper;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;


@Stateless(name="BankingInterfaceService")
@PermitAll
public class BankingInterfaceImpl implements BankingInterface {

    @Inject
    PersonDAO personDAO;
    @Inject
    PersonMapper personTranslator;

    @Inject
    StockMapper stockMapper;

    @Inject
    DepotMapper depotMapper;

    @Resource
    private SessionContext sessionContext;

    private final BankService bank = new BankService();

    public boolean login(String username, String password) throws BankingInterfaceException {
        System.out.println("TestA");
        System.out.println(username);
        if(username=="test" && password=="test"){
            try {
                bank.getFindStockQuotesByCompanyNameResponse("Apple");
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return true;
        }else{
            try {
                bank.getFindStockQuotesByCompanyNameResponse("Apple");
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
    }

    @Override
    public boolean isEmployee() throws BankingInterfaceException {
        Principal principal = sessionContext.getCallerPrincipal();
        String username = principal.getName();
        System.out.println("Logged-in User: " + username);
        // Check if the user is in a specific role
        if (sessionContext.isCallerInRole("employee")) {
            System.out.println("User is Employee Role");
            return true;
        } else {
            System.out.println("User is not in Customer Role");
            return false;
        }
    }

    @Override
    public boolean isCustomer() throws BankingInterfaceException {
        Principal principal = sessionContext.getCallerPrincipal();
        String username = principal.getName();
        System.out.println("Logged-in User: " + username);
        // Check if the user is in a specific role
        if (sessionContext.isCallerInRole("customer")) {
            System.out.println("User is Customer Role");
            return true;
        } else {
            System.out.println("User is not in Customer Role");
            return false;
        }
    }

    @Override
    public String searchStockByISIN(String isin) throws BankingInterfaceException {
        return bank.getPerson(1102562345).toString();
    }

    // TODO - Return something like a StockDTO which is in the commons so that client can also access the dto (Like The "PersonTranslator" class)
    // TODO - Catch a BankingInterfaceException here (And throw one inside the logic where needed)
    @Override
    public ListStockDTO searchStockByName(String name) throws BankingInterfaceException {

        try {
            return stockMapper.toStockDTOList(bank.getFindStockQuotesByCompanyNameResponse(name));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void buySockByISIN(TradeDTO tradeDTO) throws BankingInterfaceException {

    }

    @Override
    public void sellStockByISIN(TradeDTO tradeDTO) throws BankingInterfaceException {

    }

    @Override
    public void createPerson(String name, String givenname, String address, int svnr, String username, String password) {
        bank.createPerson(name, givenname, address, svnr, username, password);
    }

    @Override
    public String createCustomer(String name, String givenname, String address, int customerNumber, String username, String password) {
       bank.depotDAO.persist(new Depot(customerNumber, customerNumber, new ArrayList<>()));
       return bank.createPerson(name, givenname, address, customerNumber, username, password).toString();
    }

    @Override
    public void createEmployee(int svnr) {

    }

    @Override
    public DepotDTO getDepot(String customerNr) throws BankingInterfaceException {
        return depotMapper.toDepotDTO(bank.depotDAO.findById(customerNr));
    }


    @Override
    public String searchCustomer(Integer customerNr) throws BankingInterfaceException {
        return bank.getPerson(customerNr).toString();
    }

    @Override
    public String getInvestableVolume() throws BankingInterfaceException {
        try {
            return bank.getFindStockQuotesByCompanyNameResponse("Apple").toString();
        } catch (JAXBException | IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public long getVariable(String name) throws BankingInterfaceException {
        return 0;
    }
}