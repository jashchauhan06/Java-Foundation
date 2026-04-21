// Main class: drives the Student Management System
public class StudentManagementSystem {

    // Utility: print a formatted section header
    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(45));
        System.out.println("  " + title);
        System.out.println("=".repeat(45));
    }

    public static void main(String[] args) {

        // ── 1. Person object ─────────────────────────────
        printHeader("PERSON RECORD");
        Person person = new Person("Dr. A. P. J. Abdul Kalam", 83);
        person.displayInfo();

        // ── 2. Student object ────────────────────────────
        printHeader("UNDERGRADUATE STUDENT RECORD");
        Student student = new Student("Riya Sharma", 20, 1021, 87.5);
        student.displayInfo();

        // ── 3. GraduateStudent object ────────────────────
        printHeader("GRADUATE STUDENT RECORD");
        GraduateStudent gradStudent = new GraduateStudent(
            "Arjun Mehta",                          // name
            25,                                     // age
            2045,                                   // roll number
            91.0,                                   // marks
            "Artificial Intelligence",              // specialization
            "Deep Learning for Medical Diagnosis",  // thesis title
            "Prof. S. R. Verma"                     // advisor
        );
        gradStudent.displayInfo();

        // ── 4. Polymorphism demo ─────────────────────────
        printHeader("POLYMORPHISM DEMO (Person[] array)");
        Person[] people = {
            new Person("Neha Joshi", 19),
            new Student("Rohan Patel", 21, 1055, 74.0),
            new GraduateStudent("Priya Singh", 26, 3010, 95.0,
                "Cyber Security", "Blockchain-based IoT Security",
                "Prof. K. Narayanan")
        };

        for (int i = 0; i < people.length; i++) {
            System.out.println("\n-- Record " + (i + 1)
                               + " [" + people[i].getClass().getSimpleName() + "] --");
            people[i].displayInfo();   // runtime polymorphism
        }

        System.out.println("\n" + "=".repeat(45));
        System.out.println("  Program terminated successfully.");
        System.out.println("=".repeat(45));
    }
}
