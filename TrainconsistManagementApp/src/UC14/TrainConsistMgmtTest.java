package UC14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. Valid capacity creation
    @Test
    void testException_ValidCapacityCreation() throws Exception {
        TrainConsistMgmt.PassengerBogie bogie =
                new TrainConsistMgmt.PassengerBogie("Sleeper", 72);

        assertNotNull(bogie);
    }

    // 2. Negative capacity
    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(
                TrainConsistMgmt.InvalidCapacityException.class,
                () -> new TrainConsistMgmt.PassengerBogie("AC", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    // 3. Zero capacity
    @Test
    void testException_ZeroCapacityThrowsException() {
        Exception exception = assertThrows(
                TrainConsistMgmt.InvalidCapacityException.class,
                () -> new TrainConsistMgmt.PassengerBogie("General", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    // 4. Exception message validation
    @Test
    void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(
                TrainConsistMgmt.InvalidCapacityException.class,
                () -> new TrainConsistMgmt.PassengerBogie("Chair", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    // 5. Object integrity after creation
    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {
        TrainConsistMgmt.PassengerBogie bogie =
                new TrainConsistMgmt.PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", bogie.getType());
        assertEquals(72, bogie.getCapacity());
    }

    // 6. Multiple valid bogies
    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {

        TrainConsistMgmt.PassengerBogie b1 =
                new TrainConsistMgmt.PassengerBogie("Sleeper", 72);

        TrainConsistMgmt.PassengerBogie b2 =
                new TrainConsistMgmt.PassengerBogie("AC", 50);

        TrainConsistMgmt.PassengerBogie b3 =
                new TrainConsistMgmt.PassengerBogie("General", 90);

        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);
    }
}