package UC13;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // Helper method
    private List<Bogie> createSampleBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("First Class", 24));
        return bogies;
    }

    // 1. Loop filtering logic
    @Test
    void testLoopFilteringLogic() {
        List<Bogie> result = PerformanceUtil.filterWithLoop(createSampleBogies());

        for (Bogie b : result) {
            assertTrue(b.getCapacity() > 60);
        }
    }

    // 2. Stream filtering logic
    @Test
    void testStreamFilteringLogic() {
        List<Bogie> result = PerformanceUtil.filterWithStream(createSampleBogies());

        for (Bogie b : result) {
            assertTrue(b.getCapacity() > 60);
        }
    }

    // 3. Results match
    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = createSampleBogies();

        List<Bogie> loopResult = PerformanceUtil.filterWithLoop(bogies);
        List<Bogie> streamResult = PerformanceUtil.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    // 4. Execution time measurement
    @Test
    void testExecutionTimeMeasurement() {
        long time = PerformanceUtil.measureExecutionTime(() -> {
            for (int i = 0; i < 1000; i++);
        });

        assertTrue(time > 0);
    }

    // 5. Large dataset processing
    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }

        List<Bogie> result = PerformanceUtil.filterWithStream(bogies);

        assertNotNull(result);
    }
}