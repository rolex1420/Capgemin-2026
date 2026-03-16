import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    // testEquality_SameValue
    @Test
    void testEquality_SameValue() {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2), "1.0 ft should be equal to 1.0 ft");
    }

    // testEquality_DifferentValue
    @Test
    void testEquality_DifferentValue() {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);

        assertFalse(f1.equals(f2), "1.0 ft should not be equal to 2.0 ft");
    }

    // testEquality_NullComparison
    @Test
    void testEquality_NullComparison() {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals(null), "Feet should not be equal to null");
    }

    // testEquality_NonNumericInput
    @Test
    void testEquality_NonNumericInput() {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        String value = "abc";

        assertFalse(f1.equals(value), "Feet should not be equal to non-numeric input");
    }

    // testEquality_SameReference
    @Test
    void testEquality_SameReference() {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f1), "Object should be equal to itself");
    }
}