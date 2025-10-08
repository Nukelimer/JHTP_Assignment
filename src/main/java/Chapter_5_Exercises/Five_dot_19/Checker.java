package Chapter_5_Exercises.Five_dot_19;

public class Checker {
    public static void main(String[] args) {
        /*

 Assume that i = 2, j = 3, k = 2 and m = 2. What does each of the following statements print?
a) System.out.println(i == 2); //true
b) System.out.println(j == 5);
c) System.out.println((i >= 0) && (j <= 3));
d) System.out.println((m <= 100) & (k <= m));
e) System.out.println((j >= i) || (k != m));
f) System.out.println((k + i < j) | (4 - j >= k));
g) System.out.println(!(k > j));

         */

int i = 2;
int  j = 3;
int k  = 2;
int m = 2;
        System.out.println(i == 2); //true
        System.out.println(j == 5); //false
        System.out.println((i >= 0) && (j <= 3)); //true
        System.out.println((m <= 100) & (k <= m)); //true
        System.out.println((j >= i) || (k != m)); //true
        System.out.println((k + i < j) | (4 - j >= k)); //false
        System.out.println(!(k > j)); //true

    }
}
