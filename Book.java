public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String ID, String author, String title, int numPages) {
        super("Book", ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public double calculatePrice() {
        // Example calculation: $0.50 per page
        return numPages * 0.50;
    }

    public String toString() {
        return "Book ID: " + ID + ", Title: " + title + ", Author: " + author + ", Pages: " + numPages;
    }
}
