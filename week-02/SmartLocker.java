import java.time.LocalDateTime;

public class SmartLocker {
  static String parcelId = "PKG-1001";
  static String recipient = "Ananya";
  static String size = "MEDIUM";

  public static void main(String[] args) {
    System.out.println("=== Campus Smart-Locker | Week 2 ===");
    System.out.println("Parcel accepted: " + parcelId);
    System.out.println("Recipient: " + recipient + " | Size: " + size);
    System.out.println("Received: " + LocalDateTime.now());
    System.out.println("Receipt: " + parcelId + " queued for locker allocation.");
  }
}
