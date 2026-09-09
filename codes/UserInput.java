import java.util.Scanner;
public class UserInput{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = sc.nextInt();
       System.out.println("User Input: " + num);
    }
}