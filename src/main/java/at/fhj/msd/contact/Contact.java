package at.fhj.msd.contact;

public class Contact {

    protected String firstName;
    protected String lastName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } 

    @Override
    public String toString() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }
    
}
