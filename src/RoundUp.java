import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundUp {

	    public static void main(String[] args) {
	        double number = 2.1;
	        int decimalPlaces = 0;

	        BigDecimal bd = new BigDecimal(number);
	        bd = bd.setScale(decimalPlaces, RoundingMode.CEILING);

	        int roundedNumber = bd.intValue();

	        System.out.println("Original number: " + number);
	        System.out.println("Rounded number (up to " + decimalPlaces + " decimal places): " + roundedNumber);
	    }
	}


