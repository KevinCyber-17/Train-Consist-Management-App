package UC16;

public class BubbleSortUtil {

    // Bubble Sort Method
    public static void sort(int[] arr) {

        int n = arr.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
