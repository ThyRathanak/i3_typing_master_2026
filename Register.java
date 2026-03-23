import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------ New User Registration -----------");
        System.out.print("Input a unique username (left blank to cancel): ");
        String username = sc.nextLine();
        
        if (username.equals("")) {
            System.out.println("Cancelled.");
            return;
        }
        
        System.out.print("Input password: ");
        String password = sc.nextLine();
        
        System.out.print("Input confirm password: ");
        String confirm = sc.nextLine();
        
        if (!password.equals(confirm)) {
            System.out.println("Passwords do not match! Try again.");
            return;
        }
        
        System.out.println("User '" + username + "' registered successfully!");
        sc.close();
    }
}