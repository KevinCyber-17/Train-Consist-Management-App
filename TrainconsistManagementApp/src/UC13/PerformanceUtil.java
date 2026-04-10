package UC13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceUtil {

    // Loop-based filtering
    public static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // Measure execution time
    public static long measureExecutionTime(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        return end - start;
    }
}
