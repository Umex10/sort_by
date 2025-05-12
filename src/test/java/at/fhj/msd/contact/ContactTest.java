package at.fhj.msd.contact;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    @DisplayName("Sort for Last Name")
    void lastName() {

        // ----------------------------FIRST TEST--------------------------------
        List<Contact> unsorted = TestData.getUnsortedContacts();
        List<Contact> sortedLastName = TestData.getExpectedLastNameSorted();
      

        unsorted.sort(new ContactByLastNameComparator());

        assertEquals(sortedLastName, unsorted);
     
        // ----------------------------SECOND TEST--------------------------------

        List<Contact> unsorted2 = TestData.getUnsortedContacts2();
        List<Contact> sortedLastName2 = TestData.getExpectedLastNameSorted2();
       

        unsorted2.sort(new ContactByLastNameComparator());

        assertEquals(sortedLastName2, unsorted2);
       
    }

     @Test
    @DisplayName("Sort for First Name")
    void FirstName() {

        // ----------------------------FIRST TEST--------------------------------
        List<Contact> unsorted = TestData.getUnsortedContacts();
        List<Contact> sortedFirstName = TestData.getExpectedFirstNameSorted();
       

        unsorted.sort(new ContactByFirstNameComparator());

        assertEquals(sortedFirstName, unsorted);
       
        // ----------------------------SECOND TEST--------------------------------

        List<Contact> unsorted2 = TestData.getUnsortedContacts2();
        List<Contact> sortedFirstName2 = TestData.getExpectedFirstNameSorted2();
       

        unsorted2.sort(new ContactByFirstNameComparator());

        assertEquals(sortedFirstName2, unsorted2);
       
    }

}
