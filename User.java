public class User {

    static String username = "admin";
    static int password = 1234;

    public static void login(String userName, int passWord) {

        if (userName.equals(username) && passWord == password) {
            System.out.println("Login successful!");
        } else {
            throw new ArithmeticException("INVALIDDDDDDD CREDENTIALSSSSSS");
        }
    }

    public static void main(String[] args) {

        login("admin", 1234);
        login("admin", 4321);
    }
}