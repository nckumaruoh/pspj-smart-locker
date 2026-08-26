public class SmartLocker {
  static boolean validId(String id) { return id != null && id.matches("PKG-[0-9]{4}"); }
  static boolean validSize(String size) { return "SMALL".equals(size) || "MEDIUM".equals(size) || "LARGE".equals(size); }
  static String intake(String id, String size) { return validId(id) && validSize(size) ? "ACCEPTED " + id : "REJECTED"; }
  public static void main(String[] args) {
    System.out.println("=== Smart-Locker Validation | Week 6 ===");
    System.out.println(intake("PKG-1024", "MEDIUM"));
    System.out.println(intake("1024", "MEDIUM"));
    System.out.println(intake("PKG-1025", "XL"));
  }
}
