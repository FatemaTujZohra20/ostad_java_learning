/**
 * Student Record Manager
 */

package milestone1.module5.module5projectClaas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Student student1 = new Student();
//
//        student1.name = "Zohra";
//
//        System.out.println(student1.name);

//        student1.setName("Lily Doe");
//
//        System.out.println("Full Name: " + student1.getName());
//        System.out.println("First Name: " + student1.getFirstname());
//        System.out.println("Last Name: " + student1.getLastname());

        Student student1 = new Student("Zohra Rahman", 16, "female",
                14, 'a', "Dhaka", "01712885678",
                "Advance High School");

        Student student2 = new Student("Lily Hossain", 15, "female",
                22, 'b', "Chittagong", "01819345678");

//        System.out.println("Male".equals("male")); // false

        Student student3 = new Student();
        student3.setName("Kazi Khan");
        student3.setAge(18);
        student3.setGender("male");
        student3.setRollNumber(11);
        student3.setSection('c');
        student3.setAddress("Sylhet");
        student3.setParentContact("01917345678");
        student3.setInstitutionName("Advance High School");

        System.out.println(student1);

        student1.setName("Nipu");

        System.out.println(student1);
//
//        Student student4 = new Student();
//
//        System.out.println("Please enter student name: ");
//        student4.setName(sc.nextLine());
//
//        System.out.println("Please enter student age: ");
//        student4.setAge(sc.nextInt());
//        sc.nextLine(); // consume the newline
//
//        System.out.println("Please enter student gender: ");
//        student4.setGender(sc.nextLine());
//
//        System.out.println("Please enter student roll number: ");
//        student4.setRollNumber(sc.nextInt());
//        sc.nextLine(); // consume the newline
//
//        System.out.println("Please enter student section: ");
//        student4.setSection(sc.next().charAt(0));
//        sc.nextLine(); // consume the newline
//
//        System.out.println("Please enter student address: ");
//        student4.setAddress(sc.nextLine());
//        System.out.println("Please enter parent contact: ");
//        student4.setParentContact(sc.nextLine());
//
//        System.out.println("Please enter institution name: ");
//        student4.setInstitutionName(sc.nextLine());
//        System.out.println(student4);
//
//        System.out.println(student4);

        String read = student1.read("English");
        System.out.println(read);
        // enum class


    }
}
