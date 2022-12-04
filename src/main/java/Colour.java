
public class Colour {

    //colours represented as integers in range 0 - 255
    private int redValue;
    private int greenValue;
    private int blueValue;

    private final int FLOAT_MULTIPLIER = 255;

    public Colour(float r, float g, float b) {
        redValue = (int) Math.floor(r * FLOAT_MULTIPLIER);
    }


    public Colour(int rgbValue) {

    }

    public int getRedValue() {
        return redValue;
    }
}
