package net.froihofer.util.jboss;
import common.bankingInterface.BankingInterfaceException;
import jakarta.xml.bind.JAXBException;
import net.froihofer.util.jboss.persistance.dao.*;
import net.froihofer.util.jboss.persistance.entity.Person;
import net.froihofer.util.jboss.persistance.mapper.CustomerMapper;
import net.froihofer.util.jboss.persistance.mapper.DepotMapper;
import net.froihofer.util.jboss.persistance.mapper.EmployeeMapper;
import net.froihofer.util.jboss.persistance.mapper.PersonMapper;
import net.froihofer.util.jboss.soapclient.SoapClient;
import net.froihofer.util.jboss.soapclient.SoapClientProperties;
import net.froihofer.util.jboss.soapclient.model.FindStockQuotesByCompanyNameResponse;


import javax.inject.Inject;
import java.io.IOException;


public class BankService {

    @Inject
    PersonDAO personDAO;

    @Inject
    CustomerDAO customerDAO;

    @Inject
    EmployeeDAO employeeDAO;

    @Inject
    DepotDAO depotDAO;

    @Inject
    SharesDAO stockDAO;

    @Inject
    BankDAO bankDAO;

    @Inject
    PersonMapper personMapper;

    @Inject
    CustomerMapper customerMapper;

    @Inject
    EmployeeMapper employeeMapper;

    @Inject
    DepotMapper depotMapper;

    public BankService() {
        SoapClientProperties.username = "csdc24bb_03";
        SoapClientProperties.password = "oF0Queuhae";
        personDAO = new PersonDAO();
        depotDAO = new DepotDAO();
        customerDAO = new CustomerDAO();
        employeeDAO = new EmployeeDAO();
    }

    public FindStockQuotesByCompanyNameResponse getFindStockQuotesByCompanyNameResponse(String name) throws JAXBException, IOException {
        return SoapClient.findStockQuotesByCompanyName(name);
    }

    public Person createPerson(String name, String givenname, String address, int svnr, String username, String password){
        Person person = new Person(svnr, name, givenname, address,username, password);
        if(personDAO.findById(person.getSvnr())==null){
            try {
                personDAO.persist(person);
                return person;
            }
            catch (Exception e) {
                //log.error("Problem while storing variable: "+e.getMessage(), e);
                //Do not include the root cause as classes in the stack trace might not be available on the client
                //and lead to ClassNotFoundExceptions when unmarshalling the server response.
                //throw new BankingInterfaceException(e.getMessage());
                return null;
            }
        }
        return null;
    }

    public void storePerson(Person person) throws BankingInterfaceException {
        if (person == null) {
            System.out.println("Print1");
            throw new IllegalArgumentException("variable or name cannot be empty");
        }
        try {
            System.out.println("Print2");
            personDAO.findById(person.getSvnr());
            System.out.println("Print3");

        }
        catch (Exception e) {
            System.out.println("Print4");
            personDAO.persist(person);
            System.out.println("Print5");
            //log.error("Problem while storing variable: "+e.getMessage(), e);
            //Do not include the root cause as classes in the stack trace might not be available on the client
            //and lead to ClassNotFoundExceptions when unmarshalling the server response.
            //throw new BankingInterfaceException(e.getMessage());
        }

    }

    public Person getPerson(int svnr) throws BankingInterfaceException {
        try {
            Person result = personDAO.findById(svnr);
            if (result == null) throw new BankingInterfaceException("Variable \""+svnr+"\" not found.");
            return result;
        }
        catch (Exception e) {
            //log.error("Problem while getting variable: "+e.getMessage(), e);
            //Do not include the root cause as classes in the stack trace might not be available on the client
            //and lead to ClassNotFoundExceptions when unmarshalling the server response.
            throw new BankingInterfaceException(e.getMessage());
        }
    }

}