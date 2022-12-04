import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    Colour testFloatValueColour = new Colour(0.3f, 0.2f, 0.2f);
    //max integer that can fit in 24 bits, all colour values should be 255
    Colour testIntegerValueColour = new Colour(16777215);
    @Test
    public void createColourWithFloatValues() {
        Colour floatTestColour = new Colour(0.5f, 0.3f, 0.6f);
        assert floatTestColour != null;
    }

    @Test
    public void createColourWithIntegerValue() {
        Colour intTestColour = new Colour(154456);
        assert intTestColour  != null;
    }

    @Test
    public void testFloatConstructorRedValue() {
        int expectedRedValue = 76;
        int actualRedValue = testFloatValueColour.getRedValue();
        assertEquals(expectedRedValue, actualRedValue);
    }

    @Test
    public void testFloatConstructorGreenValue() {
        int expectedGreenValue = 51;
        int actualGreenValue = testFloatValueColour.getGreenValue();
        assertEquals(expectedGreenValue, actualGreenValue);
    }

    @Test
    public void testFloatConstructorBlueValue() {
        int expectedBlueValue = 51;
        int actualBlueValue = testFloatValueColour.getBlueValue();
        assertEquals(expectedBlueValue, actualBlueValue);
    }

    @Test
    public void floatValueAbove1Fails() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(1.5f, 0.3f, 0.2f));
    }

    @Test
    public void floatValueBelow0Fails() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(-0.2f, 0.3f, 0.5f));
    }

    @Test
    public void testIntegerConstructorRedValue() {
        int expectedRedValue  = 255;
        int actualRedValue = testIntegerValueColour.getRedValue();
        assertEquals(expectedRedValue, actualRedValue);
    }

    @Test
    public void testIntegerConstructorGreenValue() {
        int expectedGreenValue = 255;
        int actualGreenValue = testIntegerValueColour.getGreenValue();
        assertEquals(expectedGreenValue, actualGreenValue);
    }

    @Test
    public void testIntegerConstructorBlueValue() {
        int expectedBlueValue = 255;
        int actualBlueValue = testIntegerValueColour.getBlueValue();
        assertEquals(expectedBlueValue, actualBlueValue);
    }

    @Test
    public void integerValueAboveMaxFails() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(123453234));
    }

    @Test
    public void integerValueBelow0Fails() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(-1));
    }

    @Test
    public void testSameValueColoursEqual() {
        Colour testColour1 = new Colour(12);
        Colour testColour2 = new Colour(12);
        boolean testEquals = testColour1.equals(testColour2);
        assertTrue(testEquals);
    }

    @Test
    public void differentValueColoursReturnsFalse() {
        Colour testColour1 = new Colour(14429);
        Colour testColour2 = new Colour(5522444);
        boolean testEquals = testColour1.equals(testColour2);
        assertFalse(testEquals);
    }

    @Test
    public void differentObjectsDoNotEqual() {
        Colour testColour = new Colour(0.5f, 0.2f, 0.1f);
        assertFalse(testColour.equals(45));
    }
}
