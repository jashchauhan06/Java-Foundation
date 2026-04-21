// Further derived class: GraduateStudent extends Student
public class GraduateStudent extends Student {
    private String specialization;
    private String thesisTitle;
    private String advisor;

    // Constructor chains up through Student → Person
    public GraduateStudent(String name, int age, int rollNumber,
                           double marks, String specialization,
                           String thesisTitle, String advisor) {
        super(name, age, rollNumber, marks);
        this.specialization = specialization;
        this.thesisTitle    = thesisTitle;
        this.advisor        = advisor;
    }

    // Getters
    public String getSpecialization() { return specialization; }
    public String getThesisTitle()    { return thesisTitle; }
    public String getAdvisor()        { return advisor; }

    // Override displayInfo to include graduate-specific fields
    @Override
    public void displayInfo() {
        super.displayInfo();                                    // Person + Student fields
        System.out.println("Specialization : " + specialization);
        System.out.println("Thesis Title   : " + thesisTitle);
        System.out.println("Advisor        : " + advisor);
    }
}
