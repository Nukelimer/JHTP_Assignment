package Chapter_6_Exercises.Six_dot_26;

import java.util.Scanner;

public class SumOfFourDigitNumber {

    public static void main(String[] args) {
/*6.26 (Calculating the Sum of Digits) Write a method that takes a four-digit integer value and
returns the sum of the digits. For example, given the number 7631, the method should return 17.
Incorporate the method into an application that reads a value from the user and displays the result.*/


        Scanner scanner = new Scanner(System.in);
//        This variable is in charge of whether to make the do-while run for a second time if the numbers are less
//        than 1000(4 digit) or above 9999(4 digits).
        boolean isFalse = false;

        do{
                 System.out.print("Enter a 4 digit number to sum: ");
                 int userNumber = scanner.nextInt();
//       This if condition checks to see if the int entered are less than 1000(4 digit) or above 9999(4 digits) if
//       one condition is true, the loop runs again, if not the addTotalSum method is called and the number is passed
//       as an argument to the method and isFalse is set to false and the loop will be exited.
//       NB: this was my initiative to fix edge cases. let me know if this is a wrong practice.
                 if ((userNumber < 1000) || (userNumber > 9999)){
                     isFalse = true;
                 }else{
                     System.out.println(addTotalSum(userNumber));
                     isFalse = false;
                 }
        }while (isFalse);

    }

    private static int addTotalSum(int number){
//        this totalSum variable is what holds the sum of the numbers at every point when the while loop runs.
        int totalSum = 0;

        int temporaryNumber = number;
//        the while will always execute because it is not 0 due to the check inside the do-while loop.
        while (temporaryNumber != 0){
//          first loop ->  lastDigit will perform a remainder operation say: assuming user entered 1234, then
//          lastDigit becomes 4,
            int lastDigit = temporaryNumber % 10;
//            total sum current value will be added or summed with what the last digit is which will update totalSum
//            to 4.
            totalSum = totalSum + lastDigit;
//            remember temporaryNumber is the value of the parameter 0, which was 1234, then it is divided by 10
//            which makes temporary number to be 123. then the loop go through the process once again "untillllllllll"
//            (in Ray William Johnson's voice) temporary number becomes 0 when you divide the last number by 10.
            temporaryNumber /= 10;
        }

        return totalSum;
    }
}
