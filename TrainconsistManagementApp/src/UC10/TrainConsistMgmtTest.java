package UC10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistMgmtTest {

    // Helper method
    private List<Bogie> createSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        return bogies;
    }

    // 1. Total seat calculation
    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = createSampleBogies();

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(222, total);
    }

    // 2. Multiple bogies aggregation
    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = createSampleBogies();

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertTrue(total > 0);
    }

    // 3. Single bogie
    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    // 4. Empty list
    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    // 5. Correct capacity extraction
    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = createSampleBogies();

        List<Integer> capacities = bogies.stream()
                .map(Bogie::getCapacity)
                .toList();

        assertTrue(capacities.contains(72));
        assertTrue(capacities.contains(56));
        assertTrue(capacities.contains(24));
        assertTrue(capacities.contains(70));
    }

    // 6. All bogies included
    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = createSampleBogies();

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        int manualSum = 72 + 56 + 24 + 70;

        assertEquals(manualSum, total);
    }

    // 7. Original list unchanged
    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = createSampleBogies();

        int originalSize = bogies.size();

        bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(originalSize, bogies.size());
    }
}