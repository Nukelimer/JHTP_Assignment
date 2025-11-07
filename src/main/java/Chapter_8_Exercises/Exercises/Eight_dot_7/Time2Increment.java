package Chapter_8_Exercises.Exercises.Eight_dot_7;
/*
(Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that in-
crements the time stored in a Time2 object by one second. Provide method incrementMinute to in-
crement the minute by one and method incrementHour to increment the hour by one. Write a
program that tests the tick method, the incrementMinute method and the incrementHour method
to ensure that they work correctly. Be sure to test the following cases:
a) incrementing into the next minute,
b) incrementing into the next hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).
*/
public class Time2Increment {
//    private int hour; // 0 - 23
//    private int minute; // 0 - 59
//    private int second; // 0 - 59

    private int totalSeconds;
    // Time2 no-argument constructor:
// initializes each instance variable to zero
    public Time2Increment() {
        this(0, 0, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2Increment(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2Increment(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour, minute and second supplied
    public Time2Increment(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;

        this.totalSeconds  = hour * 3600 + minute * 60 + second;
    }
    // Time2 constructor: another Time2 object supplied
    public Time2Increment(Time2Increment time) {
// invoke constructor with three arguments
//        this(time.hour, time.minute, time.second);
        this.totalSeconds = time.totalSeconds;
    }
    // Set Methods
// set a new time value using universal time;
// validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;

        this.totalSeconds = hour * 3600 + minute * 60 + second;
    }
    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
//        this.hour = hour;

        this.totalSeconds  = hour * 3600 + getMinute() * 60 + getSecond();
    }
    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
//        this.minute = minute;

        this.totalSeconds  = getHour() * 3600 + minute * 60 + getSecond();
    }
    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
//        this.second = second;

        this.totalSeconds  = getHour() * 3600 + getMinute() * 60 + second;
    }
    // Get Methods
// get hour value
    public int getHour() {
        //     return hour;
        return totalSeconds / 3600;
    }
    // get minute value
    public int getMinute() {
        //     return minute;
        return (totalSeconds %  3600) / 60;

    }
    // get second value
    public int getSecond() {
        //   return second;
        return  totalSeconds % 60;

    }
    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick() {
        totalSeconds = (totalSeconds + 1) % 86400; // wrap after 23:59:59
    }

    public void incrementMinute() {
        totalSeconds = (totalSeconds + 60) % 86400;
    }

    public void incrementHour() {
        totalSeconds = (totalSeconds + 3600) % 86400;
    }


}