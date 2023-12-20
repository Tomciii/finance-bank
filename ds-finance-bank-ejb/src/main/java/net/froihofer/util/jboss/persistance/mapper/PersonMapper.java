package net.froihofer.util.jboss.persistance.mapper;

import common.dto.PersonDTO;
import net.froihofer.util.jboss.persistance.entity.Person;

public class PersonMapper {

    public Person toEntity(PersonDTO person) {
        if (person == null) return null;
        return new Person(person.getSvnr(), person.getName(), person.getGivenname(), person.getUsername(), person.getAddress(), null);
    }

    public PersonDTO toDTO(Person variable) {
        if (variable == null) return null;
        return new PersonDTO(variable.getSvnr(), variable.getName(), variable.getGivenname(), variable.getUsername(), variable.getAddress());
    }
}
