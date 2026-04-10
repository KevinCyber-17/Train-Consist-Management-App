package UC18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    private String[] sample = {"BG101", "BG205", "BG309", "BG412", "BG550"};

    // 1. Bogie found
    @Test
    void testSearch_BogieFound() {
        assertTrue(LinearSearchUtil.search(sample, "BG309"));
    }

    // 2. Bogie not found
    @Test
    void testSearch_BogieNotFound() {
        assertFalse(LinearSearchUtil.search(sample, "BG999"));
    }

    // 3. First element match
    @Test
    void testSearch_FirstElementMatch() {
        assertTrue(LinearSearchUtil.search(sample, "BG101"));
    }

    // 4. Last element match
    @Test
    void testSearch_LastElementMatch() {
        assertTrue(LinearSearchUtil.search(sample, "BG550"));
    }

    // 5. Single element array
    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(LinearSearchUtil.search(arr, "BG101"));
    }
}