import java.util.Scanner;

public class WelcomeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== i3_TYPING_MASTER_2026 =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("4. Start Typing Test");
            System.out.println("5. View Test Results");
            System.out.println("6. About Us");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1": new Register().showRegistration(); break;
                case "2": new Login().show(); break;
                case "3": new ResetPassword().show(); break;
                case "4": new TypingTest().startTest(); break;
                case "5": new TestResults().displayResults(); break;
                case "6": new Aboutus().showInfo(); break;
                case "7": 
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default: System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }
}