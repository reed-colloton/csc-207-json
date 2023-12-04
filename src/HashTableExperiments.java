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
    pen.println("JSON 1:\n" + JSON.parseFile("src/tests/test1.json"));
    pen.println("JSON 2:\n" + JSON.parseFile("src/tests/test2.json"));
    pen.println("JSON 3:\n" + JSON.parseFile("src/tests/test3.json"));
    pen.println("JSON 4:\n" + JSON.parseFile("src/tests/test4.json"));
  } //main(PrintWriter)

} // class HashTableExpt
