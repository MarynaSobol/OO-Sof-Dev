public class Driver {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];

        items[0] = new Book("B001", "J.K. Rowling", "Harry Potter", 500);
        items[1] = new CD("C001", "Coldplay", "Parachutes", 12);

        for (LibraryItem item : items) {
            System.out.println(item);
            if (item instanceof LoanItem) {
                System.out.println("Price: $" + ((LoanItem) item).calculatePrice());
            }
            System.out.println();
        }
    }
}
