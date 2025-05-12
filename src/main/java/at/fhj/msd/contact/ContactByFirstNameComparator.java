package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByFirstNameComparator implements Comparator<Contact> {

     @Override
    public int compare(Contact c1, Contact c2) {
        // Lexikografischer Vergleich der Vornamen
        int firstNameComparison = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
        
        // Falls Vornamen gleich sind, zusätzlich nach Nachname sortieren
        if (firstNameComparison == 0) {
            return c1.getLastName().compareToIgnoreCase(c2.getLastName());
        }
        return firstNameComparison;
    }
}
