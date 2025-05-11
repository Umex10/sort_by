package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

import at.fhj.msd.address.Address;
import at.fhj.msd.contact.Contact;
import at.fhj.msd.contact.ContactWithAddress;

public class App {

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Alex", "Muster"));
        contacts.add(new Contact("John", "Doe"));
        contacts.add(new Contact("Jane", "Doe"));
        contacts.add(new ContactWithAddress("Mary", "Sheep", new Address("Somestreet 12", "Otherplace", 12345)));
        contacts.add(new ContactWithAddress("Harry", "Alberto", new Address("Nanoway 4", "Thisanto", 4432)));

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }
}
