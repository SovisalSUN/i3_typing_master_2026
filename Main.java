import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("   Welcome to i3 Typing Master!     ");
        System.out.println("====================================");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Typing Test");
        System.out.println("[4] Logout");
        System.out.println("====================================");
        System.out.print("Enter your choice (1-4) to navigate: ");
        
        String choice = scanner.nextLine();
        
        switch (choice) {
            case "1":
                System.out.println("Navigating to Login screen...");
                break;
            case "2":
                System.out.println("Navigating to Register screen...");
                break;
            case "3":
                System.out.println("Navigating to Typing Test screen...");
                break;
            case "4":
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        
        scanner.close();
    }
}