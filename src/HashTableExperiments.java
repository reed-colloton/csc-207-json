import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 * A simple set of experiments using our new hash tables.
 *
 * @author Samuel A. Rebelsky
 * @author Reed Colloton, Noah Mendola
 */
public class HashTableExperiments {

  public static void main(String[] args) throws ParseException, IOException {
    PrintWriter pen = new PrintWriter(System.out, true);
    JSONValue fileJSONs = JSON.parseFile("src/tests/test.json");
    pen.println("Retrieved Value: " + fileJSONs);
  } //main(PrintWriter)

} // class HashTableExpt
