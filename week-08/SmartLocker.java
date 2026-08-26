class LockerException extends Exception { LockerException(String message) { super(message); } }
public class SmartLocker {
  static String allocate(boolean available) throws LockerException { if (!available) throw new LockerException("No compatible locker is available"); return "M-03"; }
  public static void main(String[] args) {
    System.out.println("=== Smart-Locker Exceptions | Week 8 ===");
    try { System.out.println("Allocated: " + allocate(true)); System.out.println("Allocated: " + allocate(false)); }
    catch (LockerException exception) { System.out.println("Handled safely: " + exception.getMessage()); }
  }
}
