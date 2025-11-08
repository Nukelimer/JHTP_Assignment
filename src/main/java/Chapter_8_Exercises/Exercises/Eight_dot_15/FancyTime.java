package Chapter_8_Exercises.Exercises.Eight_dot_15;

/*(Class fancyTime) Create class fancyTime with the following capabilities:
a) Output the time in multiple formats, such as
HH:MM:SS a.m. / p.m. (12 hour format)
HH:MM:SS (24 hour format)
HH:MM (24 hour format)
b) Use overloaded constructors to create Date objects initialized with times of the formats in
part (a). In the first case the constructor should receive three integer values as well as a string
representing the meridiem (a.m. or p.m.). In the second case it should receive three integer
values. In the third case it should receive two integer values. You need to create a method
displayTime that will output the time in any of the three indicated formats. This method
will take a flag that can assume three values (1, 2, and 3). If the flag is 1, the first time format
is displayed; if 2, the second format is displayed; and if 3, the third format is displayed.*/
public class FancyTime {
    private int hour;
    private int minute;
    private int second;
    private String meridiem; // used for 12-hour format (a.m. / p.m.)

    // Constructor for 12-hour format
    public FancyTime(int hour, int minute, int second, String meridiem) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = meridiem;
    }

    // Constructor for 24-hour format with seconds
    public FancyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridiem = null;
    }

    // Constructor for 24-hour format without seconds
    public FancyTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
        this.meridiem = null;
    }

    // Display time in one of the three formats
    public void displayTime(int flag) {
        switch (flag) {
            case 1:
                // HH:MM:SS a.m. / p.m. (12-hour format)
                System.out.printf("%02d:%02d:%02d %s%n", hour, minute, second, meridiem);
                break;

            case 2:
                // HH:MM:SS (24-hour format)
                System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
                break;

            case 3:
                // HH:MM (24-hour format)
                System.out.printf("%02d:%02d%n", hour, minute);
                break;

            default:
                System.out.println("Invalid flag! Must be 1, 2, or 3.");
        }
    }
}
