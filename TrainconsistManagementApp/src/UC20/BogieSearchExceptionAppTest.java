package UC20;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieSearchExceptionAppTest {

    BogieSearchException search = new BogieSearchException();

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] data = {};
        assertThrows(IllegalStateException.class, () -> {
            search.searchBogie(data, "BG101");
        });
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] data = {"BG101","BG205"};
        assertDoesNotThrow(() -> {
            search.searchBogie(data, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] data = {"BG101","BG205","BG309"};
        assertTrue(search.searchBogie(data, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] data = {"BG101","BG205","BG309"};
        assertFalse(search.searchBogie(data, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] data = {"BG101"};
        assertTrue(search.searchBogie(data, "BG101"));
    }
}