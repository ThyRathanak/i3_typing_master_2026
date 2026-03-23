import java.util.Scanner;

public class TestResultScreen {
    private String input;
    private String target;
    private double seconds;

    public TestResultScreen(String input, String target, double seconds) {
        this.input = input;
        this.target = target;
        this.seconds = seconds;
    }

    public void display() {
        int mistakes = 0;
        // Simple mistake counter (checks character by character)
        for (int i = 0; i < Math.min(input.length(), target.length()); i++) {
            if (input.charAt(i) != target.charAt(i)) mistakes++;
        }
        mistakes += Math.abs(input.length() - target.length());

        int wpm = (int) ((input.length() / 5.0) / (seconds / 60.0));

        System.out.println("\n---------- Typing Test Level 1 Result ----------");
        System.out.println("Speed (words/min): " + (seconds > 0 ? wpm : 0));
        System.out.println("Total input characters: " + input.length());
        System.out.println("Total mistakes: " + mistakes);
        System.out.println("------------------------------------------------");
        System.out.println(" 1. Next level\n 2. Logout\n 3. Exit");
        System.out.print("Choose an option: ");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if (choice.equals("2")) new WelcomeScreen().display();
        else if (choice.equals("3")) System.exit(0);
        else System.out.println("Feature coming soon!");
    }
}