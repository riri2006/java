public class User {

    String username = "admin";
    int password = 1234;

    public void login(String username, int password) {

        if (this.username.equals(username) && this.password == password) {
            System.out.println("Login successful!");
        } else {
            throw new ArithmeticException("Invalid username or password.");
        }
    }

    public static void main(String[] args) {

        User user = new User();
        user.login("admin", 1234);
        user.login("admin", 4321);
    }
}