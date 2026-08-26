/**
 * PSPJ Campus Smart-Locker project — Week 1 baseline.
 * Defines the problem context and verifies a clean Java build/run workflow.
 */
public final class SmartLocker {
  private static final String PROJECT_NAME = "Campus Smart-Locker & Parcel Management System";
  private static final String MILESTONE = "Week 1 — Project charter and Java baseline";

  private SmartLocker() { }

  public static void main(String[] args) {
    printBanner();
    printCharterSummary();
    printVerification();
  }

  private static void printBanner() {
    System.out.println("============================================================");
    System.out.println(PROJECT_NAME);
    System.out.println(MILESTONE);
    System.out.println("============================================================");
  }

  private static void printCharterSummary() {
    System.out.println("Problem : Track parcel intake, locker allocation and collection.");
    System.out.println("Users   : Security desk staff and registered recipients.");
    System.out.println("Input   : Parcel ID, recipient ID and parcel size.");
    System.out.println("Output  : Locker receipt, collection status and activity log.");
  }

  private static void printVerification() {
    System.out.println("Status  : Week 1 charter accepted; Java program compiled and executed.");
    System.out.println("Next    : Implement validated parcel intake and receipt generation.");
  }
}
