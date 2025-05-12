package at.fhj.msd;

import java.util.Comparator;

import at.fhj.msd.address.Address;
import at.fhj.msd.contact.Contact;
import at.fhj.msd.contact.ContactWithAddress;

public class UniversalContactComparator  implements Comparator<Contact>{

    @Override
    public int compare(Contact c1, Contact c2) {
        // 1. Kontakte mit Adresse kommen zuerst
        boolean c1HasAddress = c1 instanceof ContactWithAddress;
        boolean c2HasAddress = c2 instanceof ContactWithAddress;

        if (c1HasAddress && !c2HasAddress) {
            return -1; // c1 kommt zuerst (hat Adresse)
        }
        if (!c1HasAddress && c2HasAddress) {
            return 1;  // c2 kommt zuerst (hat Adresse)
        }
        if (!c1HasAddress && !c2HasAddress) {
            // Beide ohne Adresse - nach Nachnamen sortieren
            return c1.getLastName().compareTo(c2.getLastName());
        }

        // 2. Beide haben Adressen - Adressvergleich
        Address a1 = ((ContactWithAddress) c1).getAddress();
        Address a2 = ((ContactWithAddress) c2).getAddress();

        // Straße -> Ort -> PLZ vergleichen
        int streetComp = a1.getStreet().compareTo(a2.getStreet());
        if (streetComp != 0) {
            return streetComp;
        }

        int placeComp = a1.getPlace().compareTo(a2.getPlace());
        if (placeComp != 0) {
            return placeComp;
        }

        return Integer.compare(a1.getZip(), a2.getZip());
    }
}
