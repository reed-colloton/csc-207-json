import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 * A simple set of experiments using our new hash tables.
 *
 * @author Reed Colloton, Noah Mendola
 */
public class HashTableExperiments {

  public static void main(String[] args) throws ParseException, IOException {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Running...");
    pen.println("Retrieved Value" + JSON.parseFile("src/tests/test1.json"));
    pen.println("Retrieved Value" + JSON.parseFile("src/tests/test3.json"));
    pen.println("Retrieved Value" + JSON.parseFile("src/tests/test4.json"));
    pen.println("Retrieved Value" + JSON.parseFile("src/tests/test5.json"));
    pen.println("Retrieved Value" + JSON.parseFile("src/tests/test6.json"));
  } //main(PrintWriter)

} // class HashTableExpt
