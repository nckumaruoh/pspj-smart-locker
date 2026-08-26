import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Week 2: validated parcel intake and a printable locker-desk receipt. */
public final class SmartLocker {
  private static final DateTimeFormatter RECEIPT_TIME = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");

  private SmartLocker() { }

  static final class Parcel {
    private final String parcelId;
    private final String recipientId;
    private final String size;
    private final LocalDateTime receivedAt;

    Parcel(String parcelId, String recipientId, String size, LocalDateTime receivedAt) {
      this.parcelId = parcelId;
      this.recipientId = recipientId;
      this.size = size;
      this.receivedAt = receivedAt;
    }
  }

  static Parcel registerParcel(String parcelId, String recipientId, String size, LocalDateTime receivedAt) {
    if (!parcelId.matches("PKG-[0-9]{4}")) throw new IllegalArgumentException("Parcel ID must follow PKG-0000.");
    if (!recipientId.matches("[A-Z]{2}[0-9]{4}")) throw new IllegalArgumentException("Recipient ID must follow AA0000.");
    if (!(size.equals("SMALL") || size.equals("MEDIUM") || size.equals("LARGE"))) throw new IllegalArgumentException("Size must be SMALL, MEDIUM or LARGE.");
    return new Parcel(parcelId, recipientId, size, receivedAt);
  }

  static void printReceipt(Parcel parcel) {
    System.out.println("+--------------------------------------------------+");
    System.out.println(" CAMPUS SMART-LOCKER - PARCEL INTAKE RECEIPT");
    System.out.println("+--------------------------------------------------+");
    System.out.println(" Parcel ID    : " + parcel.parcelId);
    System.out.println(" Recipient ID : " + parcel.recipientId);
    System.out.println(" Parcel size  : " + parcel.size);
    System.out.println(" Received at  : " + RECEIPT_TIME.format(parcel.receivedAt));
    System.out.println(" Status       : ACCEPTED - awaiting locker allocation");
    System.out.println("+--------------------------------------------------+");
  }

  public static void main(String[] args) {
    LocalDateTime demonstrationTime = LocalDateTime.of(2026, 8, 26, 10, 30);
    System.out.println("=== Week 2 - Validated parcel intake ===");
    Parcel accepted = registerParcel("PKG-1001", "CK1021", "MEDIUM", demonstrationTime);
    printReceipt(accepted);
    try { registerParcel("1001", "CK1021", "MEDIUM", demonstrationTime); }
    catch (IllegalArgumentException exception) { System.out.println("Validation check: " + exception.getMessage()); }
  }
}
