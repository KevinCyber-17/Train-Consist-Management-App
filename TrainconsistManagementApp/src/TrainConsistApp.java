import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Train Consist Management App");

        // Initialize train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.....");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display consist
        System.out.println("Current Train Consist: " + trainConsist);

        // System ready
        System.out.println("System ready for operations...");
    }
}