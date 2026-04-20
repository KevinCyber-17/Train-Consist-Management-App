package UC20;

import java.util.Arrays;

public class BogieSearchException {

    public boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        // Sort before Binary Search
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // Not Found
    }
}