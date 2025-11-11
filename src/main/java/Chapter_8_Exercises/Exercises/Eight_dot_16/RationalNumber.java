package Chapter_8_Exercises.Exercises.Eight_dot_16;


/*(Rational Numbers) Create a class called Rational for performing arithmetic with fractions.
Write a program to test your class. Use integer variables to represent the private instance variables
of the class—the numerator and the denominator. Provide a constructor that enables an object of
this class to be initialized when it’s declared. The constructor should store the fraction in reduced
form. The fraction is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denomina-
tor. Provide a no-argument constructor with default values in case no initializers are provided. Pro-
vide public methods that perform each of the following operations:
a) Add two Rational numbers: The result of the addition should be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.
c) Multiply two Rational numbers: The result of the multiplication should be stored in
reduced form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division should be stored in reduced
form. Implement this as a static method.
e) Return a String representation of a Rational number in the form a/b, where a is the
numerator and b is the denominator.
f) Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal point.)*/


public class RationalNumber {
private final int numerator;
private final int denominator;


public RationalNumber(int numerator, int denominator){
    if (denominator == 0){
        System.err.println("Error: Denominator cannot be zero. Setting fraction to 0/1.");
        this.denominator = 1;
        this.numerator =0;
        return;
    }

    int commonDivisor = gcd(numerator, denominator);

    int reducedNum = numerator / commonDivisor;
    int reducedDen = denominator / commonDivisor;

    if (reducedDen < 0){
        reducedNum *= -1;
        reducedDen *= -1;
    }

    this.numerator = reducedNum;
    this.denominator = reducedDen;

}


public RationalNumber(){
    this(0,1);
}

private  static  int  gcd (int firstNum, int secondNum){
    firstNum = Math.abs(firstNum);
    secondNum = Math.abs(secondNum);

    while (secondNum != 0){
        int temporalValue = secondNum;
        secondNum = firstNum % secondNum;
        firstNum = temporalValue;
    }

    return firstNum;

}


public  static RationalNumber multiply (RationalNumber r1, RationalNumber r2){

        int resultNumerator = (r1.numerator * r2.numerator);
        int resultDenominator = r1.denominator * r2.denominator;

        return new RationalNumber( resultNumerator, resultDenominator);
    }

    public  static RationalNumber subtract (RationalNumber r1, RationalNumber r2){

        int resultNumerator = (r1.numerator * r2.denominator) - (r2.numerator * r1.denominator);
        int resultDenominator = r1.denominator * r2.denominator;

        return new RationalNumber( resultNumerator, resultDenominator);
    }

    public  static RationalNumber add (RationalNumber r1, RationalNumber r2){

        int resultNumerator = (r1.numerator * r2.denominator) + (r2.numerator * r1.denominator);
        int resultDenominator = r1.denominator * r2.denominator;

        return new RationalNumber( resultNumerator, resultDenominator);
    }

    public  static RationalNumber divide (RationalNumber r1, RationalNumber r2){

        int resultNumerator = r1.numerator * r2.denominator;
        int resultDenominator = r1.denominator * r2.numerator;

        return new RationalNumber( resultNumerator, resultDenominator);
    }

    public String toString(){
    return String.format("%.2f", (double) numerator / denominator);

    }
    public String toFloatingPointString(int digitPrecision){
    String str ="%." +digitPrecision + "f";
        return String.format(str, (double) numerator / denominator);

    }






}
