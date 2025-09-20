package Chapter_2_Exercises.two_dot_33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 PopulationChange();

    }


    public static void PopulationChange() {
        Scanner scanner = new Scanner(System.in);

        // Ask for current population
        System.out.print("Enter the current population: ");
        long currentPopulation = scanner.nextLong();

        // Ask for percentage (e.g. 0.9 for 0.9%)
        System.out.print("Enter the percentage (e.g. 0.9 for 0.9%): ");
        float percent = scanner.nextFloat();

        // Convert percent to decimal (0.9% → 0.009)
        float rate = percent / 100.0f;

        // Calculate increase and decrease
        long increasedPopulation = (long) (currentPopulation * (1 + rate));
        long decreasedPopulation = (long) (currentPopulation * (1 - rate));
        long increasedPopulationByTwo = (long) (currentPopulation * (2 + rate));

        // Display results
        System.out.println();
        System.out.println("Current population: " + currentPopulation);
        System.out.println("Increase by " + percent + "%: " + increasedPopulation);
        System.out.println("Increase by " + percent + "%: " + increasedPopulationByTwo);
        System.out.println("Decrease by " + percent + "%: " + decreasedPopulation);

        scanner.close();
    }
}
