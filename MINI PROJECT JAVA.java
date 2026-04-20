PRN: 24070521242

1. Student Management System Problem Definition Design a Java program to manage student information using inheritance. Create a base class Person that stores common details like name and age. Derive a class Student that includes additional attributes such as roll number and marks. Further extend it into another class GraduateStudent with specialization details. The program should display complete student information using inherited properties.


// Base Class
class Person {
    String name;
    int age;

    void getPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived Class
class Student extends Person {
    int rollNo;
    double marks;

    void getStudentDetails(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Further Derived Class
class GraduateStudent extends Student {
    String specialization;

    void getGraduateDetails(String specialization) {
        this.specialization = specialization;
    }

    void displayGraduate() {
        System.out.println("Specialization: " + specialization);
    }
}

// Main Class
public class StudentManagement {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();

        gs.getPersonDetails("Jash", 20);
        gs.getStudentDetails(101, 88.5);
        gs.getGraduateDetails("Computer Science");

        System.out.println("---- Student Details ----");
        gs.displayPerson();
        gs.displayStudent();
        gs.displayGraduate();
    }
}