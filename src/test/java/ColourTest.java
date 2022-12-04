import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

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
    public void testFloatConstructorSetsCorrectRedValue() {
        Colour redValueTestColour = new Colour(0.3f, 0.2f, 0.2f);
        float expectedRedValue = 76;
        float actualRedValue = redValueTestColour.getRedValue();
        assertEquals(expectedRedValue, actualRedValue);
    }
}
