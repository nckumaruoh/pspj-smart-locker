/** Week 3: command routing for the locker-desk menu. */
public final class SmartLocker {
  private SmartLocker() { }

  static String route(int choice) {
    return switch (choice) {
      case 1 -> "OPEN_INTAKE";
      case 2 -> "OPEN_COLLECTION";
      case 3 -> "SHOW_STATUS";
      case 4 -> "EXIT";
      default -> "INVALID_CHOICE";
    };
  }

  static void printMenu() {
    System.out.println("1. Register parcel");
    System.out.println("2. Collect parcel");
    System.out.println("3. View locker status");
    System.out.println("4. Exit");
  }

  public static void main(String[] args) {
    System.out.println("=== Week 3 - Menu routing ===");
    printMenu();
    for (int choice : new int[] {1, 2, 3, 4, 9}) System.out.println("Choice " + choice + " -> " + route(choice));
  }
}
