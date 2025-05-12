package at.fhj.msd.contact;

import java.util.ArrayList;
import java.util.List;

import at.fhj.msd.address.Address;

public class TestData {

    // ----------------------------FIRST TEST--------------------------------

    public static List<Contact> getUnsortedContacts() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Leon", "Keller"));
        contacts.add(new Contact("Nina", "Hoffmann"));
        contacts.add(new ContactWithAddress("Marlon", "Voigt", new Address("Wiesenweg 3", "Stuttgart", 70173)));
        contacts.add(new Contact("Clara", "Zimmermann"));
        contacts.add(new Contact("Tim", "Brandt"));
        contacts.add(new ContactWithAddress("Jan", "Seidel", new Address("Am Markt 1", "Köln", 50667)));
        contacts.add(new Contact("Mira", "Wolf"));
        contacts.add(new Contact("Fabian", "Neumann"));
        contacts.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        return contacts;
    }

    public static List<Contact> getExpectedLastNameSorted() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Tim", "Brandt"));
        contacts.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        contacts.add(new Contact("Nina", "Hoffmann"));
        contacts.add(new Contact("Leon", "Keller"));
        contacts.add(new Contact("Fabian", "Neumann"));
        contacts.add(new ContactWithAddress("Jan", "Seidel", new Address("Am Markt 1", "Köln", 50667)));
        contacts.add(new ContactWithAddress("Marlon", "Voigt", new Address("Wiesenweg 3", "Stuttgart", 70173)));
        contacts.add(new Contact("Mira", "Wolf"));
        contacts.add(new Contact("Clara", "Zimmermann"));
        return contacts;
    }

    public static List<Contact> getExpectedFirstNameSorted() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Clara", "Zimmermann"));
        contacts.add(new Contact("Fabian", "Neumann"));
        contacts.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        contacts.add(new ContactWithAddress("Jan", "Seidel", new Address("Am Markt 1", "Köln", 50667)));
        contacts.add(new Contact("Leon", "Keller"));
        contacts.add(new ContactWithAddress("Marlon", "Voigt", new Address("Wiesenweg 3", "Stuttgart", 70173)));
         contacts.add(new Contact("Mira", "Wolf"));
        contacts.add(new Contact("Nina", "Hoffmann"));
        contacts.add(new Contact("Tim", "Brandt"));
        return contacts;
    }

    // ----------------------------SECOND TEST--------------------------------

    public static List<Contact> getUnsortedContacts2() {
        List<Contact> contacts2 = new ArrayList<>();
        contacts2.add(new Contact("Luca", "Bauer"));
        contacts2.add(new ContactWithAddress("Sophia", "Müller", new Address("Lindenstraße 15", "Hamburg", 20354)));
         contacts2.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        contacts2.add(new Contact("Max", "Schmidt"));
        contacts2.add(new ContactWithAddress("Olivia", "Fischer", new Address("Königsweg 9", "Berlin", 10115)));
        contacts2.add(new Contact("Leo", "Schneider"));
        contacts2.add(new Contact("Emily", "Weber"));
        contacts2.add(new ContactWithAddress("Paul", "Jansen", new Address("Ringstraße 22", "Düsseldorf", 40210)));
        contacts2.add(new ContactWithAddress("Mia", "Lehmann", new Address("Birkenweg 8", "Köln", 50667)));
        contacts2.add(new Contact("Nina", "Schulz"));
        contacts2.add(new ContactWithAddress("Benjamin", "Klein", new Address("Fliederstraße 3", "Stuttgart", 70173)));
        return contacts2;
    }

    public static List<Contact> getExpectedLastNameSorted2() {
        List<Contact> contacts2 = new ArrayList<>();
        contacts2.add(new Contact("Luca", "Bauer"));
        contacts2.add(new ContactWithAddress("Olivia", "Fischer", new Address("Königsweg 9", "Berlin", 10115)));
          contacts2.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        contacts2.add(new ContactWithAddress("Paul", "Jansen", new Address("Ringstraße 22", "Düsseldorf", 40210)));
        contacts2.add(new ContactWithAddress("Benjamin", "Klein", new Address("Fliederstraße 3", "Stuttgart", 70173)));
        contacts2.add(new ContactWithAddress("Mia", "Lehmann", new Address("Birkenweg 8", "Köln", 50667)));
        contacts2.add(new ContactWithAddress("Sophia", "Müller", new Address("Lindenstraße 15", "Hamburg", 20354)));
        contacts2.add(new Contact("Max", "Schmidt"));
        contacts2.add(new Contact("Leo", "Schneider"));
        contacts2.add(new Contact("Nina", "Schulz"));
        contacts2.add(new Contact("Emily", "Weber"));
        return contacts2;
    }

    public static List<Contact> getExpectedFirstNameSorted2() {
        List<Contact> contacts2 = new ArrayList<>();
        contacts2.add(new ContactWithAddress("Benjamin", "Klein", new Address("Fliederstraße 3", "Stuttgart", 70173)));
        contacts2.add(new Contact("Emily", "Weber"));
           contacts2.add(new ContactWithAddress("Isabell", "Hartmann", new Address("Bahnhofstraße 9", "Dresden", 1067)));
        contacts2.add(new Contact("Leo", "Schneider"));
        contacts2.add(new Contact("Luca", "Bauer"));
        contacts2.add(new Contact("Max", "Schmidt"));
        contacts2.add(new ContactWithAddress("Mia", "Lehmann", new Address("Birkenweg 8", "Köln", 50667)));
        contacts2.add(new Contact("Nina", "Schulz"));
        contacts2.add(new ContactWithAddress("Olivia", "Fischer", new Address("Königsweg 9", "Berlin", 10115)));
        contacts2.add(new ContactWithAddress("Paul", "Jansen", new Address("Ringstraße 22", "Düsseldorf", 40210)));
        contacts2.add(new ContactWithAddress("Sophia", "Müller", new Address("Lindenstraße 15", "Hamburg", 20354)));
        return contacts2;
    }
}