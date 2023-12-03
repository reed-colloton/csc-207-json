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
    JSONValue fileJSONs = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test3.json");
    pen.println("Retrieved Value" + fileJSONs.getValue());
  } //main(PrintWriter)

} // class HashTableExpt
