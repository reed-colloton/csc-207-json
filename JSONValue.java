import java.io.PrintWriter;

/**
 * JSON values.
 */
public interface JSONValue {

  // +-------------------------+-------------------------------------
  // | Standard object methods |
  // +-------------------------+

  /**
   * Convert to a string (e.g., for printing).
   */
  String toString();

  /**
   * Compare to another object.
   */
  boolean equals(Object other);

  /**
   * Compute the hash code.
   */
  int hashCode();

  // +--------------------+------------------------------------------
  // | Additional methods |
  // +--------------------+

  /**
   * Write the value as JSON.
   */
  void writeJSON(PrintWriter pen);

  /**
   * Get the underlying value.
   */
  Object getValue();

} // interface JSONValue
