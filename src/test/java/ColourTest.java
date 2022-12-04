import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ColourTest {

    @Test
    public void createColourWithFloatValues() {
        Colour testColour = new Colour(0.5f, 0.3f, 0.6f);
        assert testColour != null;
    }
}
