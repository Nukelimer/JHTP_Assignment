package Chapter_5_Exercises.Five_dot_18;

public class CompoundInterestCalculator {

    public static void main(String[] args) {


        String question = "(Modified Compound-Interest Program) Modify the compound-interest application of\n" +
                "Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to\n" +
                "vary the interest rate.";
        double principal = 1000.0;
        double rate = 0.05;



        for (; rate <= 0.10; rate += 0.01){


            System.out.printf("%nInterest rate: %8.0f%%%n", rate * 100);
            for (int year  =1; year <=10; year++){

                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }

        }

        System.out.print(rate);
    }
}
