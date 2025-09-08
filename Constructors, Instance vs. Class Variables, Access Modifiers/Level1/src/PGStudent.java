class PGStudent extends Student {
     String specialization;

    public PGStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name +
                ", CGPA: " + getCgpa() + ", Specialization: " + specialization);
    }
}
