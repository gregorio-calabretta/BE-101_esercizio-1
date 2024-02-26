package com.example.esercizio1.dao;

import com.example.esercizio1.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgres")
public class PersonDataAccessService implements PersonDao{


    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
       return new ArrayList<Person>();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }
}
