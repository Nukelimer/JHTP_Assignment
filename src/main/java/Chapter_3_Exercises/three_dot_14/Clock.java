package Chapter_3_Exercises.three_dot_14;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
       if (hour <1 || hour > 23){
           this.hour = this.hour;
       }else {
           this.hour = hour;
       }

        if (minute <1 || minute > 59){
            this.minute = this.minute;
        }else {
        this.minute = minute;

        }

        if (second <1 || second > 59){
            this.second = this.second;
        }else {
            this.second = second;
        this.second = second;

        }

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour > 23){
            this.hour = 0;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 59){
            this.minute = 0;
        }

        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second > 59){
            this.second = 0;
        }

        this.second = second;
    }


    public String displayTime(){

        String hh= hour + "";
        String mm= String.valueOf(minute);
        String ss= second + "";

        String x = hh+":"+mm+":"+ss;

//        System.out.printf("%s:%s:%s %n", hh, mm, ss);
        return x;
    }
}
