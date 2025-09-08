public class LibraryBook {
     String title;
     String author;
     double price;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Borrow method
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
            return true;
        } else {
            System.out.println(title + " is not available.");
            return false;
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", Price: " + price + ", Available: " + available);
    }
}
