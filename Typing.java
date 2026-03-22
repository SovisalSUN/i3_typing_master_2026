import java.util.Scanner;

public class TypingTest {
    public void startTest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Typing Test ----");
        System.out.println("Type this: ");
        System.out.println(text);

        String input = sc.nextLine();

        if (input.equals(text)) {
            System.out.println("Good job! You typed it correctly.");
        } else {
            System.out.println("Try again.");
        }
    }

    public static void main(String[] args) {
        TypingTest test = new TypingTest();
        test.startTest();
    }
}