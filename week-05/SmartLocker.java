public class SmartLocker {
  static final String[] slots = {"S-01", "S-02", "M-01", "M-02", "L-01"};
  static final boolean[] occupied = new boolean[slots.length];
  static String allocate(char size) {
    for (int i = 0; i < slots.length; i++) if (!occupied[i] && slots[i].charAt(0) == size) { occupied[i] = true; return slots[i]; }
    return "NO_SLOT";
  }
  public static void main(String[] args) {
    System.out.println("=== Smart-Locker Arrays | Week 5 ===");
    System.out.println("Allocate M: " + allocate('M'));
    System.out.println("Allocate M: " + allocate('M'));
    System.out.println("Allocate M: " + allocate('M'));
  }
}
