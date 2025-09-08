public class Main1 {
    public static void main(String[] args) {
        // Product Inventory
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 25000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        // Course
        Course c1 = new Course("Java", 6, 10000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Tech Institute");
        c1.displayCourseDetails();

        // Vehicle
        Vehicle v1 = new Vehicle("Sunil", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(1000);
        v1.displayVehicleDetails();

        // Student & PostgraduateStudent
        PGStudent pg = new PGStudent(101, "Palak", 8.9, "AI");
        pg.displayDetails();

        // EBook
        EBook eb = new EBook("123-456", "OOP in Java", "John Doe", 5.2);
        eb.displayDetails();

        // SavingsAccount
        SA sa = new SA(98765, "Mohini", 5000, 4.5);
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.displayDetails();

        // Manager
        Manager m = new Manager(1001, "IT", 70000, 10);
        m.displayDetails();
    }
}
