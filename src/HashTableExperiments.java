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
    JSONValue fileJSON = JSON.parseFile("src/tests/test6.json");
    pen.println("Retrieved Value" + fileJSON);

    JSONValue fileJSON2 = JSON.parseFile("src/tests/test3.json");
    pen.println("Retrieved Value" + fileJSON2);

    JSONValue fileJSON3 = JSON.parseFile("src/tests/test4.json");
    pen.println("Retrieved Value" + fileJSON3);

    JSONValue fileJSON4 = JSON.parseFile("src/tests/test5.json");
    pen.println("Retrieved Value" + fileJSON4);

    JSONValue fileJSON5 = JSON.parseFile("src/tests/test6.json");
    pen.println("Retrieved Value" + fileJSON5);

  } //main(PrintWriter)

} // class HashTableExpt
