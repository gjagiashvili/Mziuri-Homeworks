import java.io.*;

public class Data {
    private static final String FILE_NAME = "contacts.txt";

    public static void serializeContacts(PhoneContact[] contacts) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(contacts);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static PhoneContact[] deserializeContacts() {
        PhoneContact[] contacts = new PhoneContact[30];
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            contacts = (PhoneContact[]) ois.readObject();
        } catch (IOException | ClassNotFoundException ioe) {
            System.out.println(ioe.getMessage());
        }
        return contacts;
    }
}
