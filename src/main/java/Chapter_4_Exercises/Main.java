package Chapter_4_Exercises;

public class Main {

    public static void main(String[] args) {
        Student account1 = new Student("Jane Green", 93.5);
        Student account2 = new Student("John Blue", 72.75);
        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());



        int product = 3;
        while (product <= 100) {
            product = 3 * product;
            System.out.println(product);
        }


    }

}
