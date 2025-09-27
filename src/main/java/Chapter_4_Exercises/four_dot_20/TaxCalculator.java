package Chapter_4_Exercises.four_dot_20;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 3;
        String citizen1Name,  citizen2Name,  citizen3Name;
        int citizen1Income,citizen2Income, citizen3Income;
        float citizen1Tax =  0 ,citizen2Tax=0, citizen3Tax=0;

        System.out.println("Citizen 1 name:");
         citizen1Name = scanner.nextLine();

        System.out.println("Citizen 1 income:");
        citizen1Income = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Citizen 2 name:");
        citizen2Name = scanner.nextLine();

        System.out.println("Citizen 2 income:");
        citizen2Income = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Citizen 3 name:");
        citizen3Name = scanner.nextLine();

        System.out.println("Citizen 3 income:");
        citizen3Income = scanner.nextInt();

         if (citizen1Income > 30000 )
           citizen1Tax = (float)(citizen1Income * 0.20);
           else
             citizen1Tax = (float)(citizen1Income * 0.15);

        if (citizen2Income > 30000 )
            citizen2Tax = (float)(citizen2Income * 0.20);
        else
            citizen2Tax = (float)(citizen2Income * 0.15);
        if (citizen3Income > 30000 )
            citizen3Tax = (float)(citizen3Income * 0.20);
        else
            citizen3Tax = (float)(citizen3Income * 0.15);

        System.out.printf("Citizen 1 Name: %s: income:%s  tax:%f %n", citizen1Name, citizen1Income, citizen1Tax);

        System.out.printf("Citizen 2 Name: %s: income:%s  tax:%f %n", citizen2Name, citizen2Income, citizen2Tax);
        System.out.printf("Citizen 3 Name: %s: income:%s  tax:%f %n", citizen3Name, citizen3Income, citizen3Tax);

    }


}
