package UC11;

import java.util.regex.Pattern;

public class TrainValidator {

    // Regex patterns
    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("TRN-\\d{4}");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("PET-[A-Z]{2}");

    // Validate Train ID
    public static boolean isValidTrainId(String trainId) {
        if (trainId == null) return false;
        return TRAIN_ID_PATTERN.matcher(trainId).matches();
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null) return false;
        return CARGO_CODE_PATTERN.matcher(cargoCode).matches();
    }
}