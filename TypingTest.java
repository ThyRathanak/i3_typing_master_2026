import java.util.Scanner;

public class TypingTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text = "ffff jjjj dddd kkkk ssss llll aaaa";
        
        System.out.println("-------- Typing Test Level 1 --------");
        System.out.println("Type the following text and press ENTER:");
        System.out.println(text);
        System.out.println("--------------------------------------");
        
        long start = System.currentTimeMillis();
        System.out.print("> ");
        String input = sc.nextLine();
        long end = System.currentTimeMillis();
        
        double seconds = (end - start) / 1000.0;
        int correct = 0;
        for (int i = 0; i < Math.min(input.length(), text.length()); i++) {
            if (input.charAt(i) == text.charAt(i)) correct++;
        }
        int mistakes = text.length() - correct;
        int charsPerMin = (int)(input.length() / seconds * 60);
        int wordsPerMin = charsPerMin / 5;
        
        System.out.println("\n-------- Result --------");
        System.out.println("Speed (chars/min) : " + charsPerMin);
        System.out.println("Speed (words/min) : " + wordsPerMin);
        System.out.println("Total characters  : " + input.length());
        System.out.println("Total mistakes    : " + mistakes);
        sc.close();
    }
}