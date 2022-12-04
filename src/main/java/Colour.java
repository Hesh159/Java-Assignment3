
public class Colour {

    //colours represented as integers in range 0 - 255
    private int redValue;
    private int greenValue;
    private int blueValue;

    private static final int FLOAT_MULTIPLIER = 255;

    public Colour(float r, float g, float b) {
        redValue = floatToInt(r);
        greenValue = floatToInt(g);
        blueValue = floatToInt(b);
    }


    public Colour(int rgbValue) {

    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    private int floatToInt(float colour) {
        if (colour > 1) {
            System.out.println("Error: Constructor value must be 1.0 or less");
            throw new IllegalArgumentException();
        }
        return (int) Math.floor(colour * FLOAT_MULTIPLIER);
    }

}
