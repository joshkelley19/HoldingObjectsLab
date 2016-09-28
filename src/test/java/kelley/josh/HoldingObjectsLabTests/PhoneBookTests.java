package kelley.josh.HoldingObjectsLabTests;

import kelley.josh.HoldingObjectsLab.PhoneBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshuakelley on 9/28/16.
 */
public class PhoneBookTests {
    PhoneBook phoneBook;

    @Before
    public void initialize(){
        phoneBook=new PhoneBook();
    }

    @Test
    public void lookupTest0(){
        phoneBook.phonebook.put("Mike Jones","2813308004");
        assertNull(phoneBook.lookup("Jethro"));
    }

    @Test
    public void lookupTest1(){
        phoneBook.phonebook.put("Mike Jones","2813308004");
        assertTrue(phoneBook.lookup("Mike Jones").equals("2813308004"));
    }

    @Test
    public void addTest0(){
        phoneBook.add("Josh Kelley","4439386064");
        int expected=1;
        int actual=phoneBook.phonebook.size();
        assertEquals(expected,actual);
    }

    @Test
    public void addTest1(){
        phoneBook.add("Josh Kelley","4439386064");
        phoneBook.add("Other Guy","3022018384");
        phoneBook.add("Lady","2158804335");
        int expected=3;
        int actual=phoneBook.phonebook.size();
        assertEquals(expected,actual);
    }

    @Test
    public void removeTest0(){
        phoneBook.add("Josh Kelley","4439386064");
        phoneBook.add("Other Guy","3022018384");
        phoneBook.add("Lady","2158804335");
        assertTrue(phoneBook.remove("Josh Kelley"));
    }

    @Test
    public void removeTest1(){
        phoneBook.add("Josh Kelley","4439386064");
        phoneBook.add("Other Guy","3022018384");
        phoneBook.add("Lady","2158804335");
        assertTrue(phoneBook.remove("Other Guy","3022018384"));
    }

    @Test
    public void reverseLookupTest0(){
        phoneBook.add("Josh Kelley","4439386064");
        phoneBook.add("Other Guy","3022018384");
        phoneBook.add("Lady","2158804335");
        String expected="Lady";
        String actual=phoneBook.reverseLookup("2158804335");
        assertEquals(expected,actual);
    }

    @Test
    public void reverseLookupTest1(){
        phoneBook.add("Josh Kelley","4439386064");
        phoneBook.add("Other Guy","3022018384");
        phoneBook.add("Lady","2158804335");
        String expected="Josh Kelley";
        String actual=phoneBook.reverseLookup("4439386064");
        assertEquals(expected,actual);
    }
}
