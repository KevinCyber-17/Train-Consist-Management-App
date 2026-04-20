package UC20;

import java.util.Scanner;

public class BogieSearchExceptionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of bogies:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }
        }

        System.out.println("Enter bogie ID to search:");
        String key = scanner.nextLine();

        BogieSearchException search = new BogieSearchException();

        try {
            boolean result = search.searchBogie(bogieIds, key);

            if (result) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}