// Base class: Person
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge()     { return age; }

    // Display method (can be overridden)
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age + " years");
    }
}
