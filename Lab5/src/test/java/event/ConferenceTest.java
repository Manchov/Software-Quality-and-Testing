package event;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ConferenceTest {

    private Conference conference = new Conference(0);
    public List<Person> people = new ArrayList<>();

    @BeforeAll
    @Test
    public void setUp(){

        Person person1 = new Person("Marko","Manchov",Role.STUDENT,24);
        Person person2 = new Person("Darko","Darkov",Role.AFFILIATE,20);
        Person person3 = new Person("Parko","Parkev",Role.FACULTY_EMPLOYEE,30);
        Person person4 = new Person("Sharko","Sharkov",Role.ORGANIZER,99);
        Person person5 = new Person("Barko","Barkov",Role.OTHER,5);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        //System.out.println(people.get(people.indexOf(person1)).toString());
    }

    @Test
    void addPerson() {
        Person person6 = new Person("test","testkov",Role.OTHER,0);
        person6.setSurname("Setko");
        person6.setRole(Role.STUDENT);
        person6.setAge(18);
        people.add(person6);
        assertEquals(Role.STUDENT,people.get(people.indexOf(person6)).getRole());
        //System.out.println(people.get(people.indexOf(person1)).toString());
    }

    @Test
    void toStringPerson() {
        assertEquals("Person{name='Marko', surname='Manchov', role=STUDENT, age=24}",people.get(0).toString());
    }

    //@Test
    void doubleCapacity() {
    }

    //@Test
    void getAttendees() {
    }

    //@Test
    void getCapacity() {
    }
}