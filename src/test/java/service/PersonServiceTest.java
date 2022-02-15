package service;

import dao.PersonDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pojo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class PersonServiceTest {

    private PersonDAO personDAOMock;
    private PersonService underTest;

    @BeforeEach
    public void setUp() {

        personDAOMock = mock(PersonDAO.class); // using mockito to mock PersonDAO Class
        PersonService underTest = new PersonService(personDAOMock); // PersonService class takes in a PersonDAO as argument. Pass the mock here.

        // TODO: create a mock for personDAO
        // TODO: create an instance of underTest and pass personDAO into it

    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

    //    Good luck :)

    @Test
    void itCanSavePerson() {
        // Given
        // Create a list to resemble the database
        List<Person> peopleDB = new ArrayList<>();

        // Create some sample Person Objects
        Person cristian = new Person(1,"Cristian", 23);
        Person caoimhe = new Person(2,"Caoimhe", 23);


        // When



        when(personDAOMock.getPeople()).then(peopleDB.add());

        // Then


    }

    @Test
    void itCanDeletePerson() {
        // Given
        List<Person> peopleDB = new ArrayList<>();

        // Create some sample Person Objects
        Person cristian = new Person(1,"Cristian", 23);
        Person caoimhe = new Person(2,"Caoimhe", 23);

        // populating list
        peopleDB.add(cristian);
        peopleDB.add(caoimhe);


        // When
        when(personDAOMock.deletePerson(cristian.getId(1))).then(deleteFromList(cristian,peopleDB));

        // Then

    }

    @Test
    void canGetPeopleFromDB() {
        //Given
        Person cristian = new Person(1,"Cristian", 23);
        Person caoimhe = new Person(2,"Caoimhe", 23);

        List<Person> peopleInDB = Arrays.asList(cristian, caoimhe);

        //When
        when(personDAOMock.getPeople()).thenReturn(peopleInDB);


        //Then
        assertThat(underTest.getPeople()).isEqualTo(peopleInDB);

    }

    @Test
    void canGetPersonById() {
        // Given
        Person cristian = new Person(1,"Cristian", 23);
        Person caoimhe = new Person(2,"Caoimhe", 23);

        List<Person> peopleDB = new ArrayList<>();

        peopleDB.add(cristian);
        peopleDB.add(caoimhe);



        // When

        // Then

    }

    public void deleteFromList (Person input, List <Person> list) {
        list.remove(input);
    }


    }

