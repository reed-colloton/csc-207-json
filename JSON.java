import java.io.IOException;
import java.text.ParseException;

/**
 * Utilities for our simple implementation of JSON.
 */
public class JSON {
  // +----------------+----------------------------------------------
  // | Static methods |
  // +----------------+

  /**
   * Parse a string into JSON.
   */
  public static JSONValue parse(String source) throws ParseException {
    throw new ParseException("Unimplemented", 0);
  } // parse(String)

  /**
   * Parse a file into JSON.
   */
  public static JSONValue parseFile(String filename) throws ParseException, IOException {
    throw new IOException("Unimplemented");
  } // parseFile(String)
} // class JSON
