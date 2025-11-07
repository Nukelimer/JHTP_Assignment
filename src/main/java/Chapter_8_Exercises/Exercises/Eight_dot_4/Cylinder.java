package Chapter_8_Exercises.Exercises.Eight_dot_4;


/*(Cylinder Class) Create a class Cylinder with attributes radius and height, each of
which has a default value of 1. Provide a method that calculates the cylinders’ volume, which
is pi multiplied by the square of the radius multiplied by the height. It has set and get meth-
ods for both radius and height. The set method should verify that radius and height are pos-
itive numbers. Write a program to test class Cylinder.*/
public class Cylinder {

   private double radius;
    private double height;


   public Cylinder(){

        this( 1.0, 1.0);
    }

    public Cylinder(double radius, double height){
    setRadius(radius);
    setHeight(height);

    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        if (height > 0 ){
            this.height = height;
        } else {
            throw new IllegalArgumentException("Invalid Height Number!");
        }
    }

    public void setRadius(double radius) {
      if (radius > 0 ){
          this.radius = radius;
      } else {
          throw new IllegalArgumentException("Invalid Radius Number!");
      }
    }


    public double getResultOfVolume() {
        return Math.PI * radius * radius * height;
    }
}
