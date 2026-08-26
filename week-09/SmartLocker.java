public class SmartLocker {
  static String normalizeId(String raw) { return raw.trim().toUpperCase().replaceAll("\\s+", "-"); }
  static boolean matchesPrefix(String id) { return id.startsWith("PKG-"); }
  public static void main(String[] args) {
    String raw = " pkg 1027 "; String id = normalizeId(raw);
    System.out.println("=== Smart-Locker Strings | Week 9 ===");
    System.out.println("Normalized: " + id);
    System.out.println("Valid prefix: " + matchesPrefix(id));
  }
}
