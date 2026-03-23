
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("  1. Login");
            System.out.println("  2. Register");
            System.out.println("  3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();

        } while (choice != 3);

        sc.close();
    }

    // Login function
    public static void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        // Simple check (demo only)
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Register function
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create username: ");
        String username = sc.next();
        System.out.print("Create password: ");
        String password = sc.next();

        System.out.println("Registration successful!");
    }
}