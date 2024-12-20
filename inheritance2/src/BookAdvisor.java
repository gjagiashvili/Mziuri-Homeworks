public class BookAdvisor extends Employee {
    private int adviceRating;
    private String libraryType;

    public BookAdvisor(String firstName, String lastName, int id, int adviceRating, String libraryType) {
        super(firstName, lastName, id);
        this.adviceRating = adviceRating;
        this.libraryType = libraryType;
    }

    public Book recommendBook(Book book1, Book book2, Book book3) {
        int random = (int) (Math.random() * 3);
        return random == 0 ? book1 : (random == 1 ? book2 : book3);
    }

    @Override
    public String toString() {
        return super.toString() + ", Advice Rating: " + adviceRating + ", Library Type: " + libraryType;
    }
}
