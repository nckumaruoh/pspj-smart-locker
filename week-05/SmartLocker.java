import java.util.Arrays;
public final class SmartLocker {
  private final String[] slotIds = {"S-01", "S-02", "M-01", "M-02", "L-01"}; private final boolean[] occupied = new boolean[slotIds.length];
  String allocate(String size) { char zone = size.charAt(0); for (int i=0;i<slotIds.length;i++) if(!occupied[i] && slotIds[i].charAt(0)==zone){occupied[i]=true;return slotIds[i];} return "NO_COMPATIBLE_SLOT"; }
  public static void main(String[] args) { SmartLocker desk=new SmartLocker(); System.out.println("=== Week 5 - Locker slot allocation ==="); System.out.println("M parcel 1 -> "+desk.allocate("MEDIUM")); System.out.println("M parcel 2 -> "+desk.allocate("MEDIUM")); System.out.println("M parcel 3 -> "+desk.allocate("MEDIUM")); System.out.println("Occupancy -> "+Arrays.toString(desk.occupied)); }
}
