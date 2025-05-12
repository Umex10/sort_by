package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

import at.fhj.msd.address.Address;
import at.fhj.msd.contact.Contact;
import at.fhj.msd.contact.ContactByFirstNameComparator;
import at.fhj.msd.contact.ContactByLastNameComparator;
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

        ContactByLastNameComparator last = new ContactByLastNameComparator();
        ContactByFirstNameComparator first = new ContactByFirstNameComparator();
        

        contacts.sort(last);

        System.out.println("\n---------------------------SORTED LAST NAME---------------------------\n");

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        contacts.sort(first);

        System.out.println("\n---------------------------SORTED FIRST NAME---------------------------\n");

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

         System.out.println("\n---------------------------ADDRESS TEST---------------------------\n");

        
        List<Contact> contacts2 = new ArrayList<>();
        contacts2.add(new Contact("Leon", "Keller"));
        contacts2.add(new Contact("Nina", "Hoffmann"));
        contacts2.add(new ContactWithAddress("Marlon", "Voigt", new Address("Wiesenweg 3", "Stuttgart", 70173)));
        contacts2.add(new Contact("Clara", "Zimmermann"));
        contacts2.add(new Contact("Tim", "Brandt"));
        contacts2.add(new ContactWithAddress("Jan", "Seidel", new Address("Am Markt 1", "Köln", 50667)));
        contacts2.add(new Contact("Mira", "Wolf"));
        contacts2.add(new Contact("Fabian", "Neumann"));
        contacts2.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));

        contacts2.sort(new UniversalContactComparator());

        System.out.println(contacts2);
        
    }



    }

     


