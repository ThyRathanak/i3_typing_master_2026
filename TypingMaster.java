import java.util.Scanner;

public class TypingMaster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: - ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1" -> login(scanner);
                case "2" -> register(scanner);
                case "3" -> resetPassword(scanner);
                case "4" -> {
                    System.out.println("\nExiting I3 Typing Master. Goodbye!");
                    running = false;
                }
                default -> System.out.println("\nInvalid option. Please choose 1-4.\n");
            }
        }
        scanner.close();
    }

    static void displayMenu() {
        System.out.println("\n---------- Welcome to I3 Typing Master v2026 ----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("  1. Login");
        System.out.println("  2. Register");
        System.out.println("  3. Reset Password");
        System.out.println("  4. Exit");
    }

    // --- 4. User Login Screen ---
    static void login(Scanner scanner) {
        System.out.println("\n----------- User Login -----------");
        System.out.print("Input username (left blank to cancel): ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("Login cancelled.");
            return;
        }

        System.out.print("Input password: ");
        String password = scanner.nextLine();

        // Placeholder verification
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("\nLogin successful! Welcome back, " + username + ".");
            showTestResults(username); // Show results after successful login
        } else {
            System.out.println("\nError: Invalid username or password.");
        }
    }

    // --- 5. List of Test Results ---
    static void showTestResults(String username) {
        System.out.println("\n----------- " + username + "'s Typing Test Results -----------");
        // Header for the table
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Date", "WPM", "Accuracy", "Rank");
        System.out.println("-------------------------------------------------------------");

        // Mock data for display
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "2026-03-20", "65", "98%", "Gold");
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "2026-03-21", "72", "95%", "Platinum");
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "2026-03-22", "58", "100%", "Silver");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Press Enter to return to main menu...");
        new Scanner(System.in).nextLine();
    }

    static void register(Scanner scanner) {
        System.out.println("\n----------- New User Registration -----------");
        System.out.print("Input a unique username (left blank to cancel): ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty())
            return;

        System.out.print("Input password: ");
        String password = scanner.nextLine();
        System.out.print("Input confirm password: ");
        String confirm = scanner.nextLine();

        if (password.equals(confirm)) {
            System.out.println("\nRegistration successful for: " + username);
        } else {
            System.out.println("\nError: Passwords do not match.");
        }
    }

    static void resetPassword(Scanner scanner) {
        System.out.println("\n----------- Password Reset -----------");
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("New Password: ");
        String pass = scanner.nextLine();
        System.out.println("\nPassword updated for " + user);
    }
}