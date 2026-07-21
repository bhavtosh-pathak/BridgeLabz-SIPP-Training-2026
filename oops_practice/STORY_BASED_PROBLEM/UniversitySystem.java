class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

class Student extends Person {
    protected final int studentId;
    protected double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student [ID=" + studentId + ", GPA=" + gpa + "]";
    }
}

class GradStudent extends Student {
    private String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis=" + thesis + "]";
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Pradeep",
                22,
                101,
                9.1,
                "Artificial Intelligence"
        );

        System.out.println(gs);

        // IS-A Relationship
        Student s = gs;
        Person p = gs;

        System.out.println("\nIS-A Demonstration");
        System.out.println("GradStudent IS-A Student : " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gs instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
    }
}