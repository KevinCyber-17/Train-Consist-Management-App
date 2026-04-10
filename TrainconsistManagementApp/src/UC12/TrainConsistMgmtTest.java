package UC12;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistMgmtTest {

    // 1. All valid bogies
    @Test
    void testSafety_AllBogiesValid() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        assertTrue(SafetyValidator.isTrainSafe(bogies));
    }

    // 2. Cylindrical with invalid cargo
    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        assertFalse(SafetyValidator.isTrainSafe(bogies));
    }

    // 3. Non-cylindrical bogies allowed
    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        assertTrue(SafetyValidator.isTrainSafe(bogies));
    }

    // 4. Mixed bogies with violation
    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid

        assertFalse(SafetyValidator.isTrainSafe(bogies));
    }

    // 5. Empty bogie list
    @Test
    void testSafety_EmptyBogieList() {
        List<GoodsBogie> bogies = new ArrayList<>();

        assertTrue(SafetyValidator.isTrainSafe(bogies));
    }
}