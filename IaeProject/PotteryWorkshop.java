import java.util.Scanner;

abstract class Participant {

    private String name;
    private int age;

    // Constructor ->
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation ->
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void discount() {
        System.out.println("No discount");
    }
}

class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }

    // Polymorphism
    public void discount() {
        System.out.println("Student gets 20% discount");
    }
}

class Adult extends Participant {

    public Adult(String name, int age) {
        super(name, age);
    }
    public void discount() {
        System.out.println("Adult gets 5% discount");
    }
}


public class PotteryWorkshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("===== POTTERY ART WORKSHOP =====");

            //Scanner
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Exception handling
            if (age < 5 || age > 80) {
                throw new Exception("Invalid age");
            }

            System.out.println("\nSelect Participant Type:");
            System.out.println("1. Student");
            System.out.println("2. Adult");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            Participant p;

            if (choice == 1) {

                p = new Student(name, age);

            }
            else if (choice == 2) {

                p = new Adult(name, age);

            }
            else {

                throw new Exception("Invalid participant type");
            }


            // Workshop selection
            System.out.println("\nSelect Workshop:");
            System.out.println("1. Pot Making - Rs. 600");
            System.out.println("2. Ganpati Idol Colouring - Rs. 400");

            System.out.print("Enter choice: ");
            int workshop = sc.nextInt();

            double fee;

            if (workshop == 1) {

                System.out.println("Workshop: Pot Making");
                fee = 600;

            }
            else if (workshop == 2) {

                System.out.println("Workshop: Ganpati Idol Colouring");
                fee = 400;

            }
            else {

                throw new Exception("Invalid workshop choice");
            }


            // Display registration details
            System.out.println("\n===== REGISTRATION DETAILS =====");

            p.showDetails();

            p.discount();

            System.out.println("Workshop Fee: Rs. " + fee);

            System.out.println("Registration Successful!");

        }
        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }
        finally {

            System.out.println("Thank you!");
            sc.close();
        }
    }
}
