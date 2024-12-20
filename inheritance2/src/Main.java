public class Main {
    public static void main(String[] args) {

        AdventureBook book1 = new AdventureBook("Adventure Book", 100, "Writer Adventure", true);
        ScienceBook book2 = new ScienceBook("Science 10th Grade", 120, "Writer Science", false, "Physics");
        FantasyBook book3 = new FantasyBook("Fantasy 2", 1000, "Fantasy Country", false, "Greek");


        BookCleaner cleaner = new BookCleaner("Clean", "Books", 1940123);
        BookLender lender = new BookLender("Book", "Lend", 21238191, "9 AM", "11 PM");
        SilenceController controller = new SilenceController("Silent", "John", 12923312, 10);
        BookAdvisor advisor = new BookAdvisor("Book", "Advice", 438219312, 10, "ბიბლიოთეკა");


        Library library = new Library("თბილისის ბიბლიოთეკა ", cleaner, lender, controller, advisor, book1, book2, book3);
        System.out.println(library);


        Book recommendedBook = advisor.recommendBook(book1, book2, book3);
        System.out.println("რეკომენდირებული წიგნი: " + recommendedBook);
    }
}
