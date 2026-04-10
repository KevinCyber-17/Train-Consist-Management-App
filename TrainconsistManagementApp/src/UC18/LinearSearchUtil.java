package UC18;

public class LinearSearchUtil {

    // Linear Search Method
    public static boolean search(String[] bogieIds, String key) {

        // Traverse sequentially
        for (String id : bogieIds) {

            if (id.equals(key)) {
                return true; // Found → stop early
            }
        }

        return false; // Not found
    }
}