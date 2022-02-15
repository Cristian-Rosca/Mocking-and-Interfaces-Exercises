package dao;

import pojo.Person;

import java.util.List;

/*
Note that PersonDataAccessService should implement all methods and save, delete, and get data from a file or a static list.
File is more challenging to test (I will leave that you do decide).

Note: Watch video on saving to file

 */


public class PersonDataAccessService implements PersonDAO{
    @Override
    public void savePerson(Person person) {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        return null;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
