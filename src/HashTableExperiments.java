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
    pen.println("running");
    JSONValue fileJSON = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test.json");
    pen.println("Retrieved Value" + fileJSON.getValue());

    JSONValue fileJSON2 = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test.json");
    pen.println("Retrieved Value" + fileJSON2.getValue());

    JSONValue fileJSON3 = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test.json");
    pen.println("Retrieved Value" + fileJSON3.getValue());

    JSONValue fileJSON4 = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test.json");
    pen.println("Retrieved Value" + fileJSON4.getValue());

    JSONValue fileJSON5 = JSON.parseFile("/home/mendolan/CSC207/miniprojects/csc-207-json/src/tests/test.json");
    pen.println("Retrieved Value" + fileJSON5.getValue());

  } //main(PrintWriter)

} // class HashTableExpt
