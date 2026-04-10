package UC16;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC16: Manual Sorting using Bubble Sort ");
        System.out.println("======================================\n");

        // Create array
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Apply Bubble Sort
        BubbleSortUtil.sort(capacities);

        // Display sorted
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
