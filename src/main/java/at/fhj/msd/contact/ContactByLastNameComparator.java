package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByLastNameComparator implements Comparator<Contact> {

     @Override
    public int compare(Contact c1, Contact c2) {
        // Lexikografischer Vergleich der Nachnamen
        int lastNameComparison = c1.getLastName().compareTo(c2.getLastName());
        
        // Falls Nachnamen gleich sind, zusätzlich nach Vorname sortieren
        if (lastNameComparison == 0) {
            return c1.getFirstName().compareTo(c2.getFirstName());
        }
        return lastNameComparison;
    }
}
