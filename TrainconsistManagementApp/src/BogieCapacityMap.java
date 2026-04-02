import java.util.HashMap;
import java.util.Map;

public class BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("UC6 Map Bogie to Capacity (HashMap)");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        System.out.println("Bogie Capacity Details:");

        // Iterate using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}