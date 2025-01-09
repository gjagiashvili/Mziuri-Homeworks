public class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("ბიბლიოთეკის id: " + id);
        System.out.println("ბიბლიოთეკის სახელი: " + name);
    }

    public class Book {
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printBookInfo() {
                System.out.println("წიგნის id: " + bookId);
                System.out.println("წიგნის სახელი: " + bookName);
            }
        }
}
