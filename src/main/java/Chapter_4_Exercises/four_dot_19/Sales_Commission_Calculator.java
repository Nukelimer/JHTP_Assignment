package Chapter_4_Exercises.four_dot_19;

import java.util.Scanner;

public class Sales_Commission_Calculator {
//(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//    The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//    salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//    a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//    these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//    sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the num-
//    ber of items that can be sold.
    public static void main(String[] args) {

        float total = 0;
        float userSaleInput = 0;

        Scanner scanner = new Scanner(System.in);
         while (userSaleInput != -1){
          System.out.print("Price for items or -1 to exit: ");
          userSaleInput = scanner.nextFloat();
          if (userSaleInput == -1){

          total = total + userSaleInput + 1;

          }else {


          total = total +  userSaleInput;

          }


          }


          float totalEarning = (float) ( total * 0.09) + 200;

        System.out.println(total);
          System.out.println(totalEarning);


    }
}
