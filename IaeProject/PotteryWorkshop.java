import java.util.Scanner;


abstract class Participant {
    // Encapsulation
    private String name;
    private int age;

    // Constructor
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method for polymorphism
    public abstract double discount(double fee);
}
// Inheritance
class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }
    // Polymorphism - Method Overriding
    @Override
    public double discount(double fee) {
        System.out.println("Discount: 20% (Student)");
        return fee * 0.80;
    }
}
// Inheritance
class Adult extends Participant {

    public Adult(String name, int age) {
        super(name, age);
    }
    @Override
    public double discount(double fee) {
        System.out.println("Discount: 5% (Adult)");
        return fee * 0.95;
    }
}


public class PotteryWorkshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("===== POTTERY ART WORKSHOP =====");

            // Input
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Age validation
            if (age < 5 || age > 80) {
                throw new Exception("Invalid age. Age must be between 5 and 80.");
            }

            // Participant selection
            System.out.println("\n1. Student");
            System.out.println("2. Adult");
            System.out.print("Select participant type: ");
            int choice = sc.nextInt();

            Participant participant;

            if (choice == 1) {
                participant = new Student(name, age);
            } 
            else if (choice == 2) {
                participant = new Adult(name, age);
            } 
            else {
                throw new Exception("Invalid participant type.");
            }

            // Workshop selection
            System.out.println("\n1. Pot Making - Rs. 600");
            System.out.println("2. Ganpati Idol Colouring - Rs. 400");
            System.out.print("Select workshop: ");
            int workshopChoice = sc.nextInt();

            double fee;
            String workshopName;

            if (workshopChoice == 1) {
                workshopName = "Pot Making";
                fee = 600;
            } 
            else if (workshopChoice == 2) {
                workshopName = "Ganpati Idol Colouring";
                fee = 400;
            } 
            else {
                throw new Exception("Invalid workshop choice.");
            }

            // Apply discount using polymorphism
            double finalFee = participant.discount(fee);
            double discountAmount = fee - finalFee;

            // Display details
            System.out.println("\n===== REGISTRATION DETAILS =====");

            participant.showDetails();

            System.out.println("Workshop: " + workshopName);
            System.out.println("Original Fee: Rs. " + fee);
            System.out.println("Discount Amount: Rs. " + discountAmount);
            System.out.println("Final Fee: Rs. " + finalFee);

            System.out.println("\nRegistration Successful!");

        } 
        catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        } 
        finally {
            System.out.println("Thank you for visiting!");
            sc.close();
        }
    }
}
