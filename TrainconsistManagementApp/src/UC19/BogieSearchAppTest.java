package UC19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieSearchAppTest {

    BogieSearch search = new BogieSearch();

    @Test
    void testBinarySearch_BogieFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.binarySearch(data, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(search.binarySearch(data, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] data = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.binarySearch(data, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] data = {"BG101"};
        assertTrue(search.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] data = {};
        assertFalse(search.binarySearch(data, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] data = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(search.binarySearch(data, "BG205"));
    }
}