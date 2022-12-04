import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ColourTest {

    @Test
    public void createColourWithFloatValues() {
        Colour testColour = new Colour(0.5f, 0.3f, 0.6f);
        assert testColour != null;
    }

    @Test
    public void createColourWithIntegerValue() {
        Colour testColour = new Colour(154456);
        assert testColour  != null;
    }
}
