
class Book {
    private String title;
    private int pageCount;
    private String author;
    private boolean isHardcover;

    public Book(String title, int pageCount, String author, boolean isHardcover) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void read() {
        System.out.println("ვკითხულობ წიგნს: " + title);
    }

    @Override
    public String toString() {
        return "წიგნები: " + title + ", გვერდები: " + pageCount + " ავტორი: " + author + " მყარი ყდა აქვს: " + isHardcover;
    }
}