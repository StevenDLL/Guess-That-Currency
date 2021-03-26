package GuessThatCurrency;

public class Coin {

    public final String CODE;
    public final String SYMBOL;
    public final String LOCATION;
    public final Double VALUE;
    public final String FLAT_IMAGE_LOCATION;
    public final String COLOR_IMAGE_LOCATION;
    public final String HINT_ONE;
    public final String HINT_TWO;

    public Coin(String code, String symbol, String location, Double value, String flat_image_location, String color_image_location, String hint_one, String hint_two) {
        this.CODE = code;
        this.SYMBOL = symbol;
        this.LOCATION = location;
        this.VALUE = value;
        this.FLAT_IMAGE_LOCATION = flat_image_location;
        this.COLOR_IMAGE_LOCATION = color_image_location;
        this.HINT_ONE = hint_one;
        this.HINT_TWO = hint_two;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "CODE='" + CODE + '\'' +
                ", SYMBOL='" + SYMBOL + '\'' +
                ", LOCATION='" + LOCATION + '\'' +
                ", VALUE=" + VALUE +
                ", FLAT_IMAGE_LOCATION='" + FLAT_IMAGE_LOCATION + '\'' +
                ", COLOR_IMAGE_LOCATION='" + COLOR_IMAGE_LOCATION + '\'' +
                ", HINT_ONE='" + HINT_ONE + '\'' +
                ", HINT_TWO='" + HINT_TWO + '\'' +
                '}';
    }
}
