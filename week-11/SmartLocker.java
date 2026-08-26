import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Parcel(String id, String recipient, String slot, String state) {}
public class SmartLocker {
  public static void main(String[] args) {
    List<Parcel> parcels = new ArrayList<>(List.of(new Parcel("PKG-1030", "Ravi", "M-03", "READY"), new Parcel("PKG-1029", "Ananya", "S-02", "COLLECTED"), new Parcel("PKG-1031", "Meera", "L-02", "READY")));
    System.out.println("=== Smart-Locker Collections | Week 11 ===");
    parcels.stream().filter(parcel -> parcel.state().equals("READY")).sorted(Comparator.comparing(Parcel::id)).forEach(parcel -> System.out.println(parcel.id() + " -> " + parcel.slot()));
  }
}
