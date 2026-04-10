package UC18;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC18: Linear Search for Bogie ID ");
        System.out.println("======================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Perform search
        boolean found = LinearSearchUtil.search(bogieIds, searchId);

        // Display result
        if (found) {
            System.out.println("\n\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\n\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}