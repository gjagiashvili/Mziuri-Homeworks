import java.util.*;
import java.io.*;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void populateList(String filename) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(filename)
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("_");
                if (parts.length == 2) {
                    books.add(new Book(parts[0].trim(), Integer.parseInt(parts[1].trim())));
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
