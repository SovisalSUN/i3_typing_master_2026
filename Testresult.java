public class TestResults {
    public void displayResults() {
        System.out.println("==================================");
        System.out.println("        TYPING TEST RESULTS       ");
        System.out.println("==================================");
        System.out.printf("%-15s %-10s %-10s%n", "Date", "WPM", "Accuracy");
        System.out.println("----------------------------------");
        System.out.printf("%-15s %-10d %-10s%n", "2026-03-20", 45, "95%");
        System.out.printf("%-15s %-10d %-10s%n", "2026-03-21", 50, "98%");
        System.out.printf("%-15s %-10d %-10s%n", "2026-03-22", 48, "96%");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        TestResults results = new TestResults();
        results.displayResults();
    }
}