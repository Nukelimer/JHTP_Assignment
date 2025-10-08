package Chapter_5_Exercises.Five_dot_21;

public class Pythagorean_Triples {
    public static void main(String[] args) {

     for (int sideOne = 1; sideOne <=500; sideOne++){

         for (int sideTwo = 1; sideTwo <= 500; sideTwo++){

             for (int hypotenuse = 1; hypotenuse <=500; hypotenuse++){

                 if ((sideOne * sideOne) + (sideTwo * sideTwo) == (hypotenuse * hypotenuse) ){


                     System.out.printf("%-10d%-10d%-10d%n", sideOne, sideTwo, hypotenuse);

                 }
             }
         }
     }




    }
}
