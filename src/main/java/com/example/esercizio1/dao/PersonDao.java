package com.example.esercizio1.dao;

import com.example.esercizio1.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();
    int deletePersonById(UUID id);
    int updatePersonById(UUID id,Person person);

    Optional<Person> selectPersonById(UUID id);


}
