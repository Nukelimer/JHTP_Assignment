package Chapter_3.three_dot_17;

import java.util.Scanner;

public class HealthProfileTest {


    public static void main(String[] args) {

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String f_name= scanner.nextLine();
        System.out.println("Enter your last name: ");
        String l_name= scanner.nextLine();
        System.out.println("Enter your gender: ");
        String gender= scanner.nextLine();
        System.out.println("Enter your day of birth, i.e, 1, 12,30, 31: ");
        int day_of_birth = scanner.nextInt();
        System.out.println("Enter your month of birth, i.e, 1, 7 ,11, 12: ");
        int month_of_birth = scanner.nextInt();
        System.out.println("Enter your month of birth, i.e, 1991, 2001 ,2018, 2000: ");
        int year_of_birth = scanner.nextInt();
        System.out.println("Enter your height in inches, i.e, 70, 60 , 30, 56 without decimal: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight in LBS, i.e, 170.3, 160 , 300, 156: ");
        double weight = scanner.nextDouble();


        HealthProfile mrA = new HealthProfile(f_name,l_name, gender, day_of_birth, month_of_birth, year_of_birth, height, weight);


        System.out.printf("%s %s %s %s %s%n%s %s-%d-%d %s %d %s %n %d %s %.2f %s %d %d ", "Hello", mrA.getF_name(), mrA.getL_name(),
                "you identify as a biological", mrA.getGender(), "your DOB is:", mrA.getDay_of_birth(),
                mrA.getMonth_of_birth(),mrA.getYear_of_birth(),"so you are", mrA.getUserAge(), "years old as at 2025. your max heart rate is: "
                , mrA.maxHeartRate(), "and your BMI is:", mrA.weightCalculator(),  "and your heart rate range:",
                mrA.targetHigherHeartRate(), mrA.targetLowerHeartRate());




                scanner.close();
    }
}
