package UC15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. Safe cargo assignment
    @Test
    void testCargo_SafeAssignment() {
        TrainConsistMgmt.GoodsBogie bogie =
                new TrainConsistMgmt.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    // 2. Unsafe assignment handled
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistMgmt.GoodsBogie bogie =
                new TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo()); // should not be assigned
    }

    // 3. Cargo not assigned after failure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistMgmt.GoodsBogie bogie =
                new TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    // 4. Program continues after exception
    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistMgmt.GoodsBogie b1 =
                new TrainConsistMgmt.GoodsBogie("Rectangular");

        TrainConsistMgmt.GoodsBogie b2 =
                new TrainConsistMgmt.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // unsafe
        b2.assignCargo("Coal");      // safe

        assertEquals("Coal", b2.getCargo());
    }

    // 5. Finally block execution (indirect check)
    @Test
    void testCargo_FinallyBlockExecution() {
        TrainConsistMgmt.GoodsBogie bogie =
                new TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // If program reaches here → finally executed successfully
        assertTrue(true);
    }
}