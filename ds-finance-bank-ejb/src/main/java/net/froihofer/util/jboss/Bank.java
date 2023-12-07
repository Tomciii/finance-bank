package net.froihofer.util.jboss;
import common.BankingInterfaceException;
import common.PersonDTO;
import jakarta.xml.bind.JAXBException;
import net.froihofer.util.jboss.entity.Person;
import net.froihofer.util.jboss.entity.PersonDAO;
import net.froihofer.util.jboss.entity.PersonTranslator;
import net.froihofer.util.jboss.soapclient.SoapClient;
import net.froihofer.util.jboss.soapclient.SoapClientProperties;
import net.froihofer.util.jboss.trading.FindStockQuotesByCompanyNameResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.xml.soap.*;
import java.io.IOException;

public class Bank {

    public String name;
    private String password;

    @Inject
    PersonDAO personDAO;

    @Inject
    PersonTranslator personTranslator;

    public Bank() {
        name = "csdc24bb_03";
        password = "oF0Queuhae";
        SoapClientProperties.username = name;
        SoapClientProperties.password = password;
        personDAO = new PersonDAO();
    }

    public FindStockQuotesByCompanyNameResponse getFindStockQuotesByCompanyNameResponse(String name) throws JAXBException, IOException {
        return SoapClient.findStockQuotesByCompanyName(name);
    }


    public boolean createPerson(String name, String givenname, String address, int svnr, String username, String password){
        Person person = new Person(svnr, name, givenname, address,username, password);
        if(personDAO.findById(person.getSvnr())==null){
            try {
                personDAO.persist(person);
                return true;
            }
            catch (Exception e) {
                //log.error("Problem while storing variable: "+e.getMessage(), e);
                //Do not include the root cause as classes in the stack trace might not be available on the client
                //and lead to ClassNotFoundExceptions when unmarshalling the server response.
                //throw new BankingInterfaceException(e.getMessage());
                return false;
            }
        }
        return false;
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
            if (result == null) throw new BankingInterfaceException("Variable \""+name+"\" not found.");
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