import java.util.ArrayList;
import java.util.List;

public class PassengerBogies {

    public static void main(String[] args) {

        System.out.println("UC2 Add Passenger Bogies to Train");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove "AC Chair"
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Check existence
        System.out.println("\nChecking if \"Sleeper\" exists:");
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("Contains Sleeper?: " + exists);

        // Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("UC2 operations completed successfully...");
    }
}