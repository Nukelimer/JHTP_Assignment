package Chapter_3.three_dot_13;

public class CarApplication {

    public static void main(String[] args) {
        Car benz = new Car(1000.00, "2021", "Benz" );

        System.out.println(benz.getPrice());


        System.out.println(      benz.carDiscount(5.0));
        System.out.println(benz.getPrice());

    }
}
