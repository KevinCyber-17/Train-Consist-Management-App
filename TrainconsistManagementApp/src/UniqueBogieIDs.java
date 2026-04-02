import java.util.HashSet;
import java.util.Set;

public class UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("UC3 Track Unique Bogie IDs");

        // Create HashSet
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG103"); // duplicate

        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs);

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("UC3 uniqueness validation completed...");
    }
}