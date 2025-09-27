package Chapter_4_Exercises.four_dot_22;

public class TabularInput {


    public static void main(String[] args) {




        System.out.printf( "N\tN2\tN3\tN4%n");
        for (int i = 1; i < 6; i++){

//            System.out.print(i + "\t");
//            System.out.print(i * i + "\t");
//            System.out.print( i * i * i + "\t");
//            System.out.println(i * i * i * i);

            System.out.printf("%d\t%d\t%d\t%d\t%n", i, (i*i), (i*i*i), (i*i*i*i));

        }
    }
}
