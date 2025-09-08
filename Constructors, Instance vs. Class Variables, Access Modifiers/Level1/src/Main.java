public class Main {
    public static void main(String[] args) {
        System.out.println("---- Book ----");
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "James Gosling", 500);
        book1.display();
        book2.display();

        System.out.println("\n---- Circle ----");
        Circle c1 = new Circle();
        Circle c2 = new Circle(7.0);
        c1.display();
        c2.display();

        System.out.println("\n---- Person ----");
        Person p1 = new Person("Sunil", 30);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();

        System.out.println("\n---- Hotel Booking ----");
        HotelBooking hb1 = new HotelBooking("Mohini", "Deluxe", 3);
        HotelBooking hb2 = new HotelBooking(hb1);
        hb1.display();
        hb2.display();

        System.out.println("\n---- Library Book ----");
        LibraryBook lb1 = new LibraryBook("Python Crash Course", "Eric Matthes", 700, true);
        lb1.display();
        lb1.borrowBook();
        lb1.borrowBook();
        lb1.display();

        System.out.println("\n---- Car Rental ----");
        CarRental cr1 = new CarRental("Palak", "Rolls-Royce Phantom", 5);
        CarRental cr2 = new CarRental(cr1);
        cr1.display();
        cr2.display();
    }
}
