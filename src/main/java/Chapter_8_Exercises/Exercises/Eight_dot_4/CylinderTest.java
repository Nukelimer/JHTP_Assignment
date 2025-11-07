package Chapter_8_Exercises.Exercises.Eight_dot_4;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.printf("%.1f%n", c1.getRadius());
        System.out.printf("%.1f%n", c1.getRadius());
        System.out.printf("%.2f%n", c1.getResultOfVolume());

        Cylinder c2 = new Cylinder(100.5, 10.0);
        System.out.printf("%.2f%n", c2.getResultOfVolume());
        c1.setRadius(-3);


    }



}
