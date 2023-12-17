package net.froihofer.util.jboss.persistance.mapper;

import common.dto.PersonDTO;
import net.froihofer.util.jboss.persistance.entity.Person;

public class PersonMapper {

    // TODO Properly "translate" to Person
    public Person toEntity(PersonDTO person) {
        if (person == null) return null;
        return new Person();
    }

    // TODO Properly "translate" to PersonDTO
    /** Converts an entity instance to a DTO instance. */
    public PersonDTO toDTO(Person variable) {
        if (variable == null) return null;
        return new PersonDTO();
    }


}
