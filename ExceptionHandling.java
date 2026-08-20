public class ExceptionHandling{
    public static void main(String[] args) {
        int a = 10;
            int b = 0;
            System.out.println("Hello");
        try {
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
    }
}