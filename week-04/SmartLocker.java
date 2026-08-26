public class SmartLocker {
  static String route(String size) {
    return switch (size) { case "SMALL" -> "S-01"; case "MEDIUM" -> "M-01"; case "LARGE" -> "L-01"; default -> "REJECTED"; };
  }
  public static void main(String[] args) {
    System.out.println("=== Smart-Locker Routing | Week 4 ===");
    for (String size : new String[] {"SMALL", "MEDIUM", "LARGE", "XL"}) System.out.println(size + " -> " + route(size));
  }
}
