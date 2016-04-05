package temperature;

import java.util.Scanner;

public class ConversionCtoF {

    public ConversionCtoF() {
    }

    private double conversion(double celsius) {
		return (celsius*1.8)+32;
	}
	
	public static void main(String[] args) {
        ConversionCtoF obj = new ConversionCtoF();
        double celsius = 0;

        while (true) {
            System.out.println("Please enter a temperature in Celsius:");

            Scanner s = new Scanner(System.in);
            String input = s.next();

            try {
                celsius = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }

		
		System.out.println(obj.conversion(celsius));
		
	}
}
