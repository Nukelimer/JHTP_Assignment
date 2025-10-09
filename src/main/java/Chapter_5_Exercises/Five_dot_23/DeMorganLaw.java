package Chapter_5_Exercises.Five_dot_23;

public class DeMorganLaw {

    public static void main(String[] args) {


     /*   (De Morgan’s Laws) In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
        De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
        These laws state that the expression !(condition1 && condition2) is logically equivalent to the expres-
        sion (!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically
        equivalent to the expression (!condition1 && !condition2). Use De Morgan’s laws to write equivalent
        expressions for each of the following, then write an application to show that both the original ex-
        pression and the new expression in each case produce the same value:
        a) !(x < 5) && !(y >= 7)
        b) !(a == b) || !(g != 5)
        c) !((x <= 8) && (y > 4))
        d) !((i > 4) || (j <= 6))*/



        int x = 3;
        int y = 5;
        int a = 1;
        int b = 2;
        int g = 3;
        int  i = 2022;
        int j = 85;


//        System.out.println(!(x < 5 && y >= 7));
//        System.out.println(x > 5 || y <= 7);
//
//        System.out.println(!(a == b || g != 5));
//        System.out.println(a != b && g == 5);
//
//        System.out.println(!(x <= 8 && y > 4));
//        System.out.println(x >= 8 || y < 4);
//
//        System.out.println(!((i > 4) || (j <= 6)));
//        System.out.println(i <= 4 && j > 6);







        if (!(3 < 5 && 4 > 1)){
            System.out.println("BM_$$");
        }
        if (3 > 5 || 4 < 1){
            System.out.println("WBM");
        }

        if (5 > 4 || 6 < 2){

            System.out.println("WBM857");
        }

        if (!(5 < 4 && 6 > 2)){
            System.out.println("WBM857");

        }




    }
}
