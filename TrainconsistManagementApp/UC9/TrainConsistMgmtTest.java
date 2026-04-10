package UC9;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // Helper method to create sample bogies
    private List<Bogie> createSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));
        return bogies;
    }

    // 1. Bogies grouped correctly
    @Test
    void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies = createSampleBogies();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    // 2. Multiple bogies in same group
    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        List<Bogie> bogies = createSampleBogies();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(2, result.get("Sleeper").size());
        assertEquals(2, result.get("AC Chair").size());
    }

    // 3. Different bogie types separated
    @Test
    void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies = createSampleBogies();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(3, result.keySet().size());
    }

    // 4. Empty list handling
    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertTrue(result.isEmpty());
    }

    // 5. Single category
    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 70));

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Sleeper"));
    }

    // 6. Map contains correct keys
    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<Bogie> bogies = createSampleBogies();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        Set<String> keys = result.keySet();

        assertTrue(keys.contains("Sleeper"));
        assertTrue(keys.contains("AC Chair"));
        assertTrue(keys.contains("First Class"));
    }

    // 7. Group size validation
    @Test
    void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = createSampleBogies();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(2, result.get("Sleeper").size());
        assertEquals(2, result.get("AC Chair").size());
        assertEquals(1, result.get("First Class").size());
    }

    // 8. Original list unchanged
    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = createSampleBogies();

        int originalSize = bogies.size();

        Map<String, List<Bogie>> result =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        // Original list should remain unchanged
        assertEquals(originalSize, bogies.size());
    }
}