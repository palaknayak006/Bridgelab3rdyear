class Manager extends Employee {
     int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department +
                ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }
}
