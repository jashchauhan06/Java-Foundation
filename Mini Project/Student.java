// Derived class: Student extends Person
public class Student extends Person {
    private int rollNumber;
    private double marks;

    // Constructor calls super() to initialise Person fields
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks      = marks;
    }

    // Getters
    public int    getRollNumber() { return rollNumber; }
    public double getMarks()      { return marks; }

    // Helper: derive grade from marks
    public String getGrade() {
        if      (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else                  return "F";
    }

    // Override displayInfo to include student-specific fields
    @Override
    public void displayInfo() {
        super.displayInfo();                                    // Person fields
        System.out.println("Roll Number : " + rollNumber);
        System.out.printf ("Marks       : %.2f%n", marks);
        System.out.println("Grade       : " + getGrade());
    }
}
