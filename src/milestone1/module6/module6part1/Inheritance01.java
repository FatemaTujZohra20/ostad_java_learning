package milestone1.module6.module6part1;

class Student {
    private String name;
    private String id;


    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method Overloading
    public Student() {
        System.out.println("No parameters passed");
    }

    // New learning section to differentiate normal Student and GoodStudent
    public void explain() {
        System.out.println("This is a Student");
    }

    public void talk() {
        System.out.println("Super class is talking.");
    }
}


class GoodStudent extends Student {
    private String grade;

    public GoodStudent(String name, String id, String grade) {
        super(name, id);
        this.grade = grade;
    }

    // New learning section to differentiate normal Student and GoodStudent
    @Override
    public void explain() {
        System.out.println("This is a Good Student");
    }
}


public class Inheritance01 {
    public static void main(String[] args) {
        Student zubayer = new Student("Zubayer", "123");
        Student zohra = new Student("Zohra", "456");

//        System.out.println(zubayer);   // milestone1.module6.module6part1.Student@7b23ec81

        Student lily = new GoodStudent("lily", "789", "A");
//        System.out.println(lily);   // milestone1.module6.module6part1.GoodStudent@5f184fc6


        // New learning section to differentiate normal Student and GoodStudent
        // Before modifying explain()
        // -----------------------------------------------------------
//        zubayer.explain();  // This is a Student
//        lily.explain();  // This is a Student -->> but this is not just normal Student, this is a GoodStudent


        // After modifying explain() by method overriding
        // -----------------------------------------------------------
        zubayer.explain();   // This is a Student
        lily.explain();   // This is a Good Student


//        zubayer.talk();  // Super class is talking.
//        lily.talk();  // Super class is talking. (


    }

}
