import java.util.Scanner;

public class ResetPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------- User Reset Password ---------");
        System.out.print("Enter your username (left blank to cancel): ");
        String username = sc.nextLine();
        
        if (username.equals("")) {
            System.out.println("Cancelled.");
            return;
        }
        
        System.out.print("Enter new password: ");
        String newPass = sc.nextLine();
        
        System.out.print("Confirm new password: ");
        String confirm = sc.nextLine();
        
        if (!newPass.equals(confirm)) {
            System.out.println("Passwords do not match!");
            return;
        }
        
        System.out.println("Password reset successfully!");
        sc.close();
    }
}