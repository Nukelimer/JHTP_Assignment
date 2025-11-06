package Chapter_8_Exercises.Playground.Eight_dot_10;

import java.math.*;

import java.text.NumberFormat;

public class Interest {

    public static void main(String[] args) {
        BigDecimal principalInvestment = BigDecimal.valueOf(1000000.0);
        BigDecimal interestRate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%60s%n", "Year", "Amount on deposit");

        for (int year = 1; year < 10; year++) {
            BigDecimal amount = principalInvestment.multiply(interestRate.add(BigDecimal.ONE).pow(year)).setScale(4,
                    RoundingMode.HALF_EVEN);
            System.out.printf("%4d%60s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }


        enum PEOPLE {JOEL, REMI, JOJO, BEAU, CARL};

        PEOPLE Remi = PEOPLE.REMI;

        System.out.println(Remi.ordinal());



    }


}
