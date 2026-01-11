package milestone1.module5.module5part2;

import java.time.LocalDateTime;

class Students{
    private String name, roll;
    private float cgpa;


    public Students(String name, String roll, float cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public float getCgpa(int employeeId) {
        if (employeeId == 1) {
            System.out.println("Current time: " + LocalDateTime.now().toString());
//        return cgpa;
            return cgpa * 5.0f/4.0f;
        }
        else throw new IllegalArgumentException("No permission!!!");
    }
}


class Employee {
    private final int id;

    Employee(int id) {
        this.id = id;
    }
}


public class Example2 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1);
        Employee e2 = new Employee(2);


        Students ahsan = new Students("Ahsan", "123", 3.65f);
        System.out.println(ahsan.getCgpa(1));
//        System.out.println(ahsan.getCgpa(2));   // It will show an error

    }
}
