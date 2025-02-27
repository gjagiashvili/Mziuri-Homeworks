public class PhoneBook {
    private PhoneContact[] phoneContacts = new PhoneContact[30];
    private int count = 0;

    public PhoneBook() {
        phoneContacts = Data.deserializeContacts();
        for (PhoneContact c : phoneContacts) {
            if (c != null) count++;
        }
    }

    public void displayContacts() {
        System.out.println("Phone Contacts:");
        if (count == 0) {
            System.out.println("You have no contacts");
            return;
        }
        for (PhoneContact contact : phoneContacts) {
            if (contact != null) {
                System.out.println(contact);
            }
        }
    }

    public void addPhoneContact(PhoneContact phoneContact) {
        if (count >= phoneContacts.length) {
            System.out.println("Contacts Book is full");
            return;
        }
        phoneContacts[count++] = phoneContact;
        Data.serializeContacts(phoneContacts);
    }

    public void removePhoneContact(PhoneContact phoneContact) {
        for (int i = 0; i < count; i++) {
            if (phoneContacts[i] != null && phoneContacts[i].equals(phoneContact)) {
                phoneContacts[i] = null;
                for (int j = i; j < count - 1; j++) {
                    phoneContacts[j] = phoneContacts[j + 1];
                }
                phoneContacts[--count] = null;
                Data.serializeContacts(phoneContacts);
                return;
            }
        }
        System.out.println("Contact not found, Check the details");
    }

    public void editPhoneContact(PhoneContact original, PhoneContact edited) {
        for (int i = 0; i < count; i++) {
            if (phoneContacts[i] != null && phoneContacts[i].equals(original)) {
                phoneContacts[i] = edited;
                Data.serializeContacts(phoneContacts);
                return;
            }
        }
        System.out.println("Failed to edit");
    }
}
