import java.util.Scanner;

public class SmartLocker {
  static String status = "AVAILABLE";
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("=== Smart-Locker Menu | Week 3 ===");
    System.out.println("1. Intake  2. Collect  3. Status");
    System.out.print("Demo choice (3): ");
    String choice = input.hasNextLine() ? input.nextLine() : "3";
    System.out.println(choice.equals("3") ? "Locker status: " + status : "Menu action selected: " + choice);
  }
}
