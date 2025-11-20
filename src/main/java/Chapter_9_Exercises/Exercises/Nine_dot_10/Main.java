package Chapter_9_Exercises.Exercises.Nine_dot_10;

public class Main {
/*(Write a Line of Code, or Two) Write up to two lines of code that perform each of the fol-
lowing tasks:
a) Specify that class Orange inherits from class Fruit.



b) Declare that you are going to override the toString method from inside the Orange
class.
c) Call superclass Fruit’s constructor from subclass Orange’s constructor. Assume that the
superclass constructor receives two Strings, one for shape, another for color; and an in-
teger for the calories.*/


}

class  Fruit{
  public Fruit(String shape, String color, int calories){


  }

}

class Orange extends Fruit{

    public Orange(String shape, String color, int calories) {
        super(shape, color, calories);
    }

    @Override
    public String  toString(){

        return "Booom shakalaka";
    }
}