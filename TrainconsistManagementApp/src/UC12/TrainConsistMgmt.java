package UC12;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC12: Safety Compliance Check for Goods Bogies ");
        System.out.println("======================================\n");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b.getType() + " -> " + b.getCargo());
        }

        // Validate safety
        boolean isSafe = SafetyValidator.isTrainSafe(goodsBogies);

        // Display result
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train Formation is SAFE.");
        } else {
            System.out.println("Train Formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}