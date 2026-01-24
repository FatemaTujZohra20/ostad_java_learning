package milestone1.module3.basic_learning2;

class Student {
    int rollno;
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
//        int nums[] = new int[4];
//        nums[0] = 4;
//        nums[1] = 6;
//        nums[2] = 9;
//        nums[3] = 5;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.age = 19;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jonathan";
        s2.age = 20;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Janet";
        s3.age = 21;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i<students.length; i++) {
            System.out.println(students[i].rollno + ". " + students[i].name + " " + students[i].age);
        }
    }
}
