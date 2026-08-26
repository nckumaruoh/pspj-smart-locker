import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmartLocker {
  public static void main(String[] args) throws IOException {
    Path log = Path.of("parcel-log.txt");
    Files.writeString(log, "PKG-1028|Meera|S-03|READY\n");
    System.out.println("=== Smart-Locker Persistence | Week 10 ===");
    System.out.println("Saved: " + Files.readString(log).trim());
  }
}
