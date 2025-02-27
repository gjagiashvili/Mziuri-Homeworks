import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Type an option: ");
            System.out.println("1. Display Contacts");
            System.out.println("2. Add Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Edit Contact");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                phoneBook.displayContacts();
            } else if (choice.equals("2")) {
                System.out.println("Adding Contact... ");
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();

                PhoneContact newContact = new PhoneContact(firstName, lastName, phone, email);
                phoneBook.addPhoneContact(newContact);
            } else if (choice.equals("3")) {
                System.out.println("Removing Contact... ");
                System.out.print("Enter first name to remove: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name to remove: ");
                String lastName = scanner.nextLine();
                System.out.print("Enter phone number to remove: ");
                String phone = scanner.nextLine();
                System.out.print("Enter email to remove: ");
                String email = scanner.nextLine();

                PhoneContact contactToRemove = new PhoneContact(firstName, lastName, phone, email);
                phoneBook.removePhoneContact(contactToRemove);
            } else if (choice.equals("4")) {
                System.out.println("Editing Contact... ");
                System.out.print("First name: ");
                String oldFirstName = scanner.nextLine();
                System.out.print("Last name: ");
                String oldLastName = scanner.nextLine();
                System.out.print("Phone number: ");
                String oldPhone = scanner.nextLine();
                System.out.print("Email: ");
                String oldEmail = scanner.nextLine();

                PhoneContact oldContact = new PhoneContact(oldFirstName, oldLastName, oldPhone, oldEmail);

                System.out.println("Enter new details:");
                System.out.print("New first name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("New last name: ");
                String newLastName = scanner.nextLine();
                System.out.print("New phone number: ");
                String newPhone = scanner.nextLine();
                System.out.print("New email: ");
                String newEmail = scanner.nextLine();

                PhoneContact newContact = new PhoneContact(newFirstName, newLastName, newPhone, newEmail);
                phoneBook.editPhoneContact(oldContact, newContact);
            } else {
                System.out.println("Your number is not in the list. Please enter the numbers 1-4.");
            }
        }
    }
}
