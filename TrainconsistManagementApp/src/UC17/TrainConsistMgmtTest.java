package UC17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. Basic alphabetical sorting
    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};

        BogieSortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General","Luxury","Sleeper"
        }, arr);
    }

    // 2. Unsorted input
    @Test
    void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};

        BogieSortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Luxury","Sleeper"
        }, arr);
    }

    // 3. Already sorted
    @Test
    void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};

        BogieSortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","First Class","General"
        }, arr);
    }

    // 4. Duplicate values
    @Test
    void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};

        BogieSortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{
                "AC Chair","General","Sleeper","Sleeper"
        }, arr);
    }

    // 5. Single element
    @Test
    void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        BogieSortUtil.sortBogieNames(arr);

        assertArrayEquals(new String[]{"Sleeper"}, arr);
    }
}