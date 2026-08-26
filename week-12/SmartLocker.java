import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

final class Parcel {
  final String id, recipient, size;
  String slot, state;
  Parcel(String id, String recipient, String size) { this.id = id; this.recipient = recipient; this.size = size; this.state = "RECEIVED"; }
  String line() { return String.join("|", id, recipient, size, slot == null ? "" : slot, state); }
}

public class SmartLocker {
  private final List<Parcel> parcels = new ArrayList<>();
  private final String[] slots = {"S-01", "S-02", "M-01", "M-02", "L-01", "L-02"};

  private boolean valid(String id, String size) { return id.matches("PKG-[0-9]{4}") && List.of("SMALL", "MEDIUM", "LARGE").contains(size); }
  private String allocate(String size) { char prefix = size.charAt(0); for (String slot : slots) if (slot.charAt(0) == prefix && parcels.stream().noneMatch(parcel -> slot.equals(parcel.slot) && parcel.state.equals("READY"))) return slot; return null; }
  private void intake(String id, String recipient, String size) {
    if (!valid(id, size)) throw new IllegalArgumentException("Invalid parcel information");
    String slot = allocate(size); if (slot == null) throw new IllegalStateException("No compatible locker is available");
    Parcel parcel = new Parcel(id, recipient, size); parcel.slot = slot; parcel.state = "READY"; parcels.add(parcel);
    System.out.println("Receipt: " + id + " | " + recipient + " | " + slot + " | READY");
  }
  private void collect(String id) { parcels.stream().filter(parcel -> parcel.id.equals(id) && parcel.state.equals("READY")).findFirst().ifPresent(parcel -> { parcel.state = "COLLECTED"; System.out.println("Collected: " + id + " from " + parcel.slot); }); }
  private void save(Path file) throws IOException { Files.write(file, parcels.stream().map(Parcel::line).toList()); }
  private void report() { parcels.stream().sorted(Comparator.comparing(parcel -> parcel.id)).forEach(parcel -> System.out.println(parcel.id + " | " + parcel.recipient + " | " + parcel.slot + " | " + parcel.state)); }
  public static void main(String[] args) throws IOException {
    SmartLocker app = new SmartLocker(); System.out.println("=== Campus Smart-Locker | Final Release ===");
    app.intake("PKG-1101", "Ananya", "SMALL"); app.intake("PKG-1102", "Ravi", "MEDIUM"); app.intake("PKG-1103", "Meera", "LARGE"); app.collect("PKG-1102");
    app.save(Path.of("parcel-register.txt")); System.out.println("--- Current register ---"); app.report(); System.out.println("Saved parcel-register.txt");
  }
}
