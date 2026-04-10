package UC13;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC13: Performance Comparison (Loops vs Streams) ");
        System.out.println("======================================\n");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Type" + i, i % 100));
        }

        // Measure loop time
        long loopTime = PerformanceUtil.measureExecutionTime(() -> {
            PerformanceUtil.filterWithLoop(bogies);
        });

        // Measure stream time
        long streamTime = PerformanceUtil.measureExecutionTime(() -> {
            PerformanceUtil.filterWithStream(bogies);
        });

        // Display results
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}
