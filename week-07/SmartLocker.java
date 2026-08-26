class Parcel {
  final String id, recipient, size;
  Parcel(String id, String recipient, String size) { this.id = id; this.recipient = recipient; this.size = size; }
  String receipt() { return id + " for " + recipient + " (" + size + ")"; }
}
public class SmartLocker {
  public static void main(String[] args) {
    Parcel parcel = new Parcel("PKG-1026", "Ravi", "LARGE");
    System.out.println("=== Smart-Locker Objects | Week 7 ===");
    System.out.println("Receipt: " + parcel.receipt());
  }
}
