package Chapter_6_Exercises.Six_dot_22;

import java.util.Scanner;

public class TempUnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What temperature type do you want to convert to, " +
                " K for Kelvin and C for Celsius: ");
        String  temperatureType = String.valueOf(scanner.nextLine().charAt(0));
        String transformedTemperatureType = temperatureType.toUpperCase();


        System.out.println("Enter the temperature");
        double temperature = scanner.nextInt();

        if (transformedTemperatureType.equals("C")) {
            System.out.printf(" the Kelvin equivalent is: %f", TemperatureConversions.Kelvin(temperature));
        } else if (transformedTemperatureType.equals("K")) {
            System.out.printf(" the Celsius equivalent is: %f", TemperatureConversions.Celsius(temperature));

        } else {
            System.out.printf(" The temperature unit is not  C(Celsius) or K(Kelvin).");

        }


    }



}
