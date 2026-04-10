package UC12;

import java.util.List;

public class SafetyValidator {

    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }
}