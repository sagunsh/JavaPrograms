public class Student extends Person{
    private double percent;
    private String course;

    public Student(String firstName, String lastName, double percent, String course) {
        super(firstName, lastName);
        this.percent = percent;
        this.course = course;
    }

    public void display() {
        System.out.println("FirstName : " + super.getFirstName());
        System.out.println("LastName : " + super.getLastName());
        System.out.println("Percent : " + percent);
        System.out.println("Course : " + course);
    }

    public static void main(String[] args) {
        Student student = new Student("Bat", "Man", 76.80, "Any");
        //student.sayHello();
        student.display();
    }
}
