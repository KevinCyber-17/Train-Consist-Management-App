package UC11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. Valid Train ID
    @Test
    void testRegex_ValidTrainID() {
        assertTrue(TrainValidator.isValidTrainId("TRN-1234"));
    }

    // 2. Invalid Train ID format
    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainValidator.isValidTrainId("TRAIN12"));
        assertFalse(TrainValidator.isValidTrainId("TRN12A"));
        assertFalse(TrainValidator.isValidTrainId("1234-TRN"));
    }

    // 3. Valid Cargo Code
    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(TrainValidator.isValidCargoCode("PET-AB"));
    }

    // 4. Invalid Cargo Code format
    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainValidator.isValidCargoCode("PET-ab"));
        assertFalse(TrainValidator.isValidCargoCode("PET123"));
        assertFalse(TrainValidator.isValidCargoCode("AB-PET"));
    }

    // 5. Train ID digit length validation
    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainValidator.isValidTrainId("TRN-123"));
        assertFalse(TrainValidator.isValidTrainId("TRN-12345"));
    }

    // 6. Cargo Code uppercase validation
    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainValidator.isValidCargoCode("PET-Ab"));
        assertFalse(TrainValidator.isValidCargoCode("PET-aB"));
    }

    // 7. Empty input handling
    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(TrainValidator.isValidTrainId(""));
        assertFalse(TrainValidator.isValidCargoCode(""));
    }

    // 8. Exact pattern match
    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(TrainValidator.isValidTrainId("TRN-1234XYZ"));
        assertFalse(TrainValidator.isValidCargoCode("PET-ABCD"));
    }
}