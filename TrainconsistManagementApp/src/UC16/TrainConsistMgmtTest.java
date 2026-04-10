package UC16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. Basic sorting
    @Test
    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};

        BubbleSortUtil.sort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    // 2. Already sorted array
    @Test
    void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};

        BubbleSortUtil.sort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    // 3. Duplicate values
    @Test
    void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};

        BubbleSortUtil.sort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    // 4. Single element
    @Test
    void testSort_SingleElementArray() {
        int[] arr = {50};

        BubbleSortUtil.sort(arr);

        assertArrayEquals(new int[]{50}, arr);
    }

    // 5. All equal values
    @Test
    void testSort_AllEqualValues() {
        int[] arr = {48, 48, 48};

        BubbleSortUtil.sort(arr);

        assertArrayEquals(new int[]{48, 48, 48}, arr);
    }
}