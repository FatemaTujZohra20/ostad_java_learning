package milestone1.module5.module5part1;

class Student{
    String name, id;
    float cgpa;

    public void showStudentInfo(){
        System.out.println("Name: " + name + " ID: " + id + " CGPA: " + cgpa);
    }
}


public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Zohra";
        s1.showStudentInfo();
    }
}

