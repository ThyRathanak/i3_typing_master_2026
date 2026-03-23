import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------- Authentication --------------");
        System.out.print("Username (left blank to cancel): ");
        String username = sc.nextLine();
        
        if (username.equals("")) {
            System.out.println("Cancelled.");
            return;
        }
        
        System.out.print("Password: ");
        String password = sc.nextLine();
        
        // Simple check (in real app, check against saved users)
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        sc.close();
    }
}