package milestone3.module9.module9part1;

class Student extends Thread {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " is shouting.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Thread_Basic1 {
    public static void main(String[] args) {
        Student meem = new Student("Meem");
        Student lily = new Student("Lily");

        System.out.println(meem.getPriority());
        System.out.println(lily.getPriority());

        meem.setPriority(Thread.MAX_PRIORITY);
        lily.setPriority(Thread.MIN_PRIORITY);

        meem.start();
        lily.start();

    }
}
