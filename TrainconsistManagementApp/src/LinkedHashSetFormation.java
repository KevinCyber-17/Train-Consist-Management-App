import java.util.LinkedHashSet;

public class LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("UC5 Preserve Insertion Order of Bogies");

        // Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("UC5 formation setup completed...");
    }
}