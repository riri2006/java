import java.util.Scanner;
public class ArrayUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter name: ");
            name[i] = sc.next();
     
        }
        System.out.println("..........................................");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}