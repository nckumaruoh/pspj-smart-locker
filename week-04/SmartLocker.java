/** Week 4: size-aware routing before locker allocation. */
public final class SmartLocker {
  private SmartLocker() { }
  static String routeFor(String size, boolean priority) {
    String zone = switch (size) { case "SMALL" -> "S"; case "MEDIUM" -> "M"; case "LARGE" -> "L"; default -> ""; };
    if (zone.isEmpty()) return "REJECTED: unsupported size";
    return (priority ? "PRIORITY-" : "STANDARD-") + zone + " zone";
  }
  public static void main(String[] args) {
    System.out.println("=== Week 4 - Size-aware routing ===");
    System.out.println("SMALL, standard -> " + routeFor("SMALL", false));
    System.out.println("MEDIUM, priority -> " + routeFor("MEDIUM", true));
    System.out.println("LARGE, standard -> " + routeFor("LARGE", false));
    System.out.println("XL, standard -> " + routeFor("XL", false));
  }
}
