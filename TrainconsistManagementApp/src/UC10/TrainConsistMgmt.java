package UC10;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC10: Count Total Seats in Train ");
        System.out.println("======================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " -> " + b.getCapacity());
        }

        // AGGREGATION USING STREAM + REDUCE
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display total
        System.out.println("\nTotal Seating Capacity of Train:");
        System.out.println(totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}
