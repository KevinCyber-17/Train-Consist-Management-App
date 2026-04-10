package UC11;

import java.util.Scanner;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" UC11: Validate Train ID and Cargo Code ");
        System.out.println("======================================\n");

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validate using regex
        boolean isTrainValid = TrainValidator.isValidTrainId(trainId);
        boolean isCargoValid = TrainValidator.isValidCargoCode(cargoCode);

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}