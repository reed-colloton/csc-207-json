import java.io.PrintWriter;

/**
 * A simple experiment with probed hash tables.
 */
public class ProbedHashTableExperiments {

  // +------+------------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Do whatever experiments seem reasonable.
   */
  public static void main(String[] args) {
    // Create our normal output mechanism.
    final PrintWriter pen = new PrintWriter(System.out, true);
    // Convert the PrintWriter to a Reporter.
    Reporter rept = new Reporter() {
      public void report(String str) {
        pen.println("*** " + str);
      } // report(String)
    }; // new Reporter()

    // Create a new hash table
    ProbedHashTable<String, String> htab =
        new ProbedHashTable<String, String>(rept);

    // Most of the time, we don't care about the basic calls
    htab.reportBasicCalls(false);

    // Conduct some of the experiments
    // HashTableExperiments.matchingKeysExpt(pen, htab);
    // HashTableExperiments.repeatedSetExpt(pen, htab);
    // HashTableExperiments.matchingSetExpt(pen, htab);
    // HashTableExperiments.multipleSetExpt(pen, htab);
    // HashTableExperiments.removeExpt(pen, htab);
  } // main(String[])

} // class ProbedHashTableExperiments
