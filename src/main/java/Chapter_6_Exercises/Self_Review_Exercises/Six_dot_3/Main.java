package Chapter_6_Exercises.Self_Review_Exercises.Six_dot_3;

public class Main {
    public static void main(String[] args) {
/*Write an application that tests whether the examples of the Math class method calls shown
in Fig. 6.2 actually produce the indicated results.*/
        abs(22.7);
        abs(0.0);
        abs(-22.7);
        ceil(9.2);
        ceil(-9.8);
        cos(0.0);
        exp(1.0);
        exp(2.0);
        floor(9.2);
        log(Math.E);
        log(Math.E * Math.E);
        max(2.3, 12.7);
        max(-2.3, -12.7);
        min(2.3, 12.7);
        min(-2.3, -12.7);
        pow(9.0, 0.5);
        pow(2.0, 7.0);
        sin(0.0);
        sqrt(900.0);
        tan(0.0);
    }
        static public void abs(double val){
            System.out.println(Math.abs(val));
        }
        static  private void ceil(double val){
            System.out.println(Math.ceil(val));
        }
    static  private void cos(double val){
        System.out.println(Math.cos(val));
    }
    static  private void exp(double val){
        System.out.println(Math.exp(val));
    }
    static  private void floor(double val){
        System.out.println(Math.floor(val));
    }

    static  private void log(double val){
        System.out.println(Math.log(val));
    }
    static  private void max(double val1, double val2){
        System.out.println(Math.max(val1, val2));
    }
    static  private void min(double val1, double val2){
        System.out.println(Math.min(val1, val2));
    }
    static  private void pow(double val1, double val2){
        System.out.println(Math.pow(val1, val2));
    }
    static  private void sin(double val){
        System.out.println(Math.sin(val));
    }
    static  private void sqrt(double val){
        System.out.println(Math.sqrt(val));
    }
    static  private void tan(double val){
        System.out.println(Math.tan(val));
    }

}
