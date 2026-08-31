import java.util.Scanner;

class InsufficientBalance extends Exception {
}

class InvalidAmount extends Exception {
}

public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientBalance();
            }

            if (amount < 0) {
                throw new InvalidAmount();
            }

            System.out.println("Withdrawal successful");

        }
        catch (InsufficientBalance e) {
            System.out.println("Insufficient Balance");
        }
        catch (InvalidAmount e) {
            System.out.println("Invalid Amount");
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}