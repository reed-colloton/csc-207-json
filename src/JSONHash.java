import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * JSON hashes/objects.
 */
public class JSONHash {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  ArrayList<KVPair<JSONString, JSONValue>> hashmap = new ArrayList<>();
  Iterator<KVPair<JSONString, JSONValue>> iterator = this.iterator();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  // +-------------------------+-------------------------------------
  // | Standard object methods |
  // +-------------------------+

  /**
   * Convert to a string (e.g., for printing).
   */
  public String toString() {
    return ""; // STUB
  } // toString()

  /**
   * Compare to another object.
   */
  public boolean equals(Object other) {
    return other instanceof JSONHash
            && this.toString().equals(other.toString());
  } // equals(Object)

  /**
   * Compute the hash code.
   */
  public int hashCode() {
    if (this.hashmap == null)
      return 0;
    else
      return this.hashmap.hashCode();
  } // hashCode()

  // +--------------------+------------------------------------------
  // | Additional methods |
  // +--------------------+

  /**
   * Write the value as JSON.
   */
  public void writeJSON(PrintWriter pen) {
    pen.println(this);
  } // writeJSON(PrintWriter)

  /**
   * Get the underlying value.
   */
  public Iterator<KVPair<JSONString, JSONValue>> getValue() {
    return this.iterator;
  } // getValue()

  // +-------------------+-------------------------------------------
  // | Hashtable methods |
  // +-------------------+

  /**
   * Get the value associated with a key.
   */
  public JSONValue get(JSONString key) {
    while (this.iterator.hasNext()) {
      KVPair<JSONString, JSONValue> pair = this.iterator.next();
      if (pair.key().equals(key)) {
        return pair.value();
      } // if
    } // for
    return null;
  } // get(JSONString)

  /**
   * Get all the key/value pairs.
   */
  public Iterator<KVPair<JSONString, JSONValue>> iterator() {
    return new Iterator<>() {
      public boolean hasNext() {
        return !hashmap.isEmpty();
      } // hasNext()
      public KVPair<JSONString, JSONValue> next() {
        return hashmap.remove(0);
      } // next()
    }; // return
  } // iterator()

  /**
   * Set the value associated with a key.
   */
  public void set(JSONString key, JSONValue value) {
      while (this.iterator.hasNext()) {
        KVPair<JSONString, JSONValue> pair = this.iterator.next();
        if (pair.value().equals(value)) {
          pair.set(value);
          return;
        } // if
      } // for
      this.hashmap.add(new KVPair<>(key, value));
  } // set(JSONString, JSONValue)

  /**
   * Find out how many key/value pairs are in the hash table.
   */
  public int size() {
    return this.hashmap.size();
  } // size()

} // class JSONHash
