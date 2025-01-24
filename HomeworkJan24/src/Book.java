public class Book {
    private String title;
    private int pagesAmount;
    private String genre;
    private Author author;

    public Book(String title, int pagesAmount, String genre, Author author) {
        this.title = title;
        this.pagesAmount = pagesAmount;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public String getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.hashCode() != book.hashCode()) {
            return false;
        }
        if (this.title.equals(book.title) && this.pagesAmount == book.pagesAmount && this.genre.equals(book.genre) && this.author.equals(book.author)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + pagesAmount + genre.hashCode() + author.hashCode();
    }

    @Override
    public String toString() {
        return "წიგნი: " + title + ", გვერდების რაოდენობა: " + pagesAmount + ", ჟანრა: " + genre + ", ავტორი: " + author;
    }
}
