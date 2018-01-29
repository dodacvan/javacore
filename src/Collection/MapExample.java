package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author VanDD
 *
 */
public class MapExample {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        // compute
        Map<Integer, String> nameForId = new HashMap<>();
        Map<String, String> mapString = new HashMap<>();
        mapString.put("a", "a");
        mapString.put("b", "b");
        nameForId.put(1, "Java");
        nameForId.put(2, "Clojure");
        System.out.println("Original map: " + nameForId);

        // recompute the values:
        String oldVal1 = nameForId.compute(1, (key, oldVal) -> oldVal.concat("Script")); // special value
        System.out.println(oldVal1);
        String oldKey = mapString.compute("a", (key, val)->key.concat(val)); // special key
        System.out.println(oldKey);
        nameForId.compute(2, (key, oldVal) -> oldVal.concat("Script"));
        System.out.println("Recomputed map: " + nameForId);

        // return "null" to remove value:
        nameForId.compute(1, (key, oldVal) -> null);
        // null for nothing does nothing:
        nameForId.compute(3, (key, oldVal) -> null);
        System.out.println("After null: " + nameForId);
        
        // updates:
        Map<Integer,String> nameForId2 = new HashMap<>();
        nameForId2.put(1, "Java");
        nameForId2.put(2, null);
        System.out.println("Original map: " + nameForId2);
 
        nameForId2.computeIfAbsent(1, key -> "Java at " + key);
        System.out.println("No changes: " + nameForId2);
  
        nameForId2.computeIfAbsent(2, key -> "Esperanto at " + key); // null mapping
        System.out.println("Null updated: " + nameForId2);
 
        nameForId2.computeIfAbsent(3, key -> "Clojure at "+ key); // no mapping
        System.out.println("New key: " + nameForId2);
        
        Map<String,Collection<String>> multimap = new HashMap<>();
        List<String> n = new ArrayList<String>();
        n.add("d");
//        multimap.computeIfAbsent("names", key -> n).add("Kajko");
//        System.out.println("multimap: " + multimap);
 
        multimap.computeIfAbsent("names", key->n);
        
        System.out.println("multimap: " + multimap);
        
    }
}
