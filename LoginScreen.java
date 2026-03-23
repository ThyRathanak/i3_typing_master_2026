import java.util.Scanner;

public class LoginScreen {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- Authentication ----------");
        System.out.print("Username (left blank to cancel): ");
        String user = scanner.nextLine();

        if (user.isEmpty()) {
            new WelcomeScreen().display();
            return;
        }

        System.out.print("Password: ");
        String pass = scanner.nextLine();

        // In a real app, you'd check a database here. 
        // For now, we just proceed to the test.
        System.out.println("Login successful!");
        new TypingTestScreen().display();
    }
}