package Chapter_3.three_dot_13;

public class CarApplication {

    public static void main(String[] args) {
        Car benz = new Car(1000.00, "2021", "Benz" );
        Car cupra = new Car(23999, "2024", "Cupra");


        System.out.println(benz.getPrice());

        System.out.printf( "%s %s %s %s %s %.2f %s %.2f %n", "The car", benz.getModel(), "made in" , benz.getYear(), "and sold at:",
                benz.getPrice(), "after the discount was applied, current price is:", benz.carDiscount(5.0));


        System.out.printf( "%s %s %s %s %s %.2f %s %.2f %n", "The car", cupra.getModel(), "made in" , cupra.getYear(),
                "and sold at:",
                cupra.getPrice(), "after the discount was applied, current price is:", cupra.carDiscount(61.18));

        System.out.println(benz.getPrice());
        System.out.println(cupra.getPrice());



    }
}
