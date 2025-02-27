import java.io.*;
import java.util.*;

public class PhoneContact implements Serializable {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public PhoneContact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phoneNumber;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        PhoneContact contact = (PhoneContact) obj;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(phone, contact.phone) &&
                Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phone, email);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + phone + " | " + email;
    }
}
