package Chapter_5_Exercises.Five_dot_29;

public class TheTwelveDaysOfChristmas {

    public static void main(String[] args) {
        /*(“The Twelve Days of Christmas” Song) Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.*/


        for (int day = 1; day <= 12; day++){

            System.out.print("On the ");

            switch (day){

                case 1:
                    System.out.print("first");
                    break;
                case 2:
                    System.out.print("second");
                    break;
                case 3:
                    System.out.print("third");
                    break;
                case 4:
                    System.out.print("fourth");
                    break;
                case 5:
                    System.out.print("fifth");
                    break;
                case 6:
                    System.out.print("sixth");
                    break;
                case 7:
                    System.out.print("seventh");
                    break;
                case 8:
                    System.out.print("eighth");
                    break;
                case 9:
                    System.out.print("ninth");
                    break;
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleventh");
                    break;
                case 12:
                    System.out.print("twelfth");
                    break;
                default:


            }

            System.out.println(" day of Christmas, my true love sent to me:");


            for (int gift = day; gift >= 1; gift--) {
                switch (gift) {
                    case 12 -> System.out.println("Twelve drummers drumming,");
                    case 11 -> System.out.println("Eleven pipers piping,");
                    case 10 -> System.out.println("Ten lords a-leaping,");
                    case 9 -> System.out.println("Nine ladies dancing,");
                    case 8 -> System.out.println("Eight maids a-milking,");
                    case 7 -> System.out.println("Seven swans a-swimming,");
                    case 6 -> System.out.println("Six geese a-laying,");
                    case 5 -> System.out.println("Five golden rings,");
                    case 4 -> System.out.println("Four calling birds,");
                    case 3 -> System.out.println("Three French hens,");
                    case 2 -> System.out.println("Two turtle doves,");
                    case 1 -> {
                        // Special handling for the last gift
                        if (day == 1)
                            System.out.println("A partridge in a pear tree.");
                        else
                            System.out.println("And a partridge in a pear tree.");
                    }
                }}


        }



    }
}
