package UC19;

import java.util.Scanner;

public class BogieSearchApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of bogies:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        System.out.println("Enter bogie ID to search:");
        String key = scanner.nextLine();

        BogieSearch search = new BogieSearch();
        boolean result = search.binarySearch(bogieIds, key);

        if (result) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();
    }
}