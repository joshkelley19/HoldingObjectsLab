package kelley.josh.HoldingObjectsLabTests;

import kelley.josh.HoldingObjectsLab.PhoneBookRefactored;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshuakelley on 9/28/16.
 */
public class PhoneBookRefactoredTests {
    PhoneBookRefactored phoneBookRefactored;

    @Before
    public void initialize(){
        phoneBookRefactored=new PhoneBookRefactored();
    }

    @Test
    public void lookupTest0(){
        phoneBookRefactored.add("Mike Jones","2813308004");
        assertNull(phoneBookRefactored.lookup("Jethro"));
    }

    @Test
    public void lookupTest1(){
        phoneBookRefactored.add("Mike Jones","2813308004");
        assertFalse(phoneBookRefactored.lookup("Mike Jones").isEmpty());
    }

    @Test
    public void addTest0(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        int expected=1;
        int actual=phoneBookRefactored.betterphonebook.size();
        assertEquals(expected,actual);
    }

    @Test
    public void addTest1(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        phoneBookRefactored.add("Other Guy","3022018384");
        phoneBookRefactored.add("Lady","2158804335");
        int expected=3;
        int actual=phoneBookRefactored.betterphonebook.size();
        assertEquals(expected,actual);
    }

    @Test
    public void removeTest0(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        phoneBookRefactored.add("Other Guy","3022018384");
        phoneBookRefactored.add("Lady","2158804335");
        assertTrue(phoneBookRefactored.remove("Josh Kelley"));
    }

    @Test
    public void removeTest1(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        phoneBookRefactored.add("Other Guy","3022018384");
        phoneBookRefactored.add("Lady","2158804335");
        assertTrue(phoneBookRefactored.remove("Other Guy"));
    }

    @Test
    public void reverseLookupTest0(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        phoneBookRefactored.add("Other Guy","3022018384");
        phoneBookRefactored.add("Lady","2158804335");
        String expected="Lady";
        String actual=phoneBookRefactored.reverseLookup("2158804335");
        assertEquals(expected,actual);
    }

    @Test
    public void reverseLookupTest1(){
        phoneBookRefactored.add("Josh Kelley","4439386064");
        phoneBookRefactored.add("Other Guy","3022018384");
        phoneBookRefactored.add("Lady","2158804335");
        String expected="Josh Kelley";
        String actual=phoneBookRefactored.reverseLookup("4439386064");
        assertEquals(expected,actual);
    }
}
