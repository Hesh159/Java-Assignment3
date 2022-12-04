import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    Colour testFloatValueColour = new Colour(0.3f, 0.2f, 0.2f);
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
        float expectedRedValue = 76;
        float actualRedValue = testFloatValueColour.getRedValue();
        assertEquals(expectedRedValue, actualRedValue);
    }

    @Test
    public void testFloatConstructorGreenValue() {
        float expectedGreenValue = 51;
        float actualGreenValue = testFloatValueColour.getGreenValue();
        assertEquals(expectedGreenValue, actualGreenValue);
    }

    @Test
    public void testFloatConstructorBlueValue() {
        float expectedBlueValue = 51;
        float actualBlueValue = testFloatValueColour.getBlueValue();
        assertEquals(expectedBlueValue, actualBlueValue);
    }

    @Test
    public void floatValueAbove1Fails() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(1.5f, 0.3f, 0.2f));
    }
}
