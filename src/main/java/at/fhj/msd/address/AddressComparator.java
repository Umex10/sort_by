package at.fhj.msd.address;

import java.util.Comparator;

import at.fhj.msd.contact.ContactWithAddress;

public class AddressComparator implements Comparator<ContactWithAddress> {

    @Override
    public int compare(ContactWithAddress c1, ContactWithAddress c2) {

        Address address1 = c1.getAddress();
        Address address2 = c2.getAddress();

        int streetComparison = address1.getStreet().compareTo(address2.getStreet());

        if (streetComparison != 0) {
            return streetComparison;
        }

        int placeComparison = address1.getPlace().compareTo(address2.getPlace());

        if (placeComparison != 0) {
            return placeComparison;
        }

        return Integer.compare(address1.getZip(), address2.getZip());
    }

}
