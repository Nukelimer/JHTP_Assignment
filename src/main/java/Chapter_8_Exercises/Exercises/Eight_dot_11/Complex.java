package Chapter_8_Exercises.Exercises.Eight_dot_11;

public class Complex {

    private final double realPart;
    private final double imaginaryPart;
    public Complex(){
        this(1.0, 1.0);
    }

    public Complex(double real, double imaginary){

        this.realPart = real;
        this. imaginaryPart = imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.realPart + other.realPart;
        double newImaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.realPart - other.realPart;
        double newImaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newReal, newImaginary);
    }


    public void print() {
        System.out.printf("(%f, %f)%n", realPart, imaginaryPart);
    }


}

