package Chapter_3.three_dot_16;

public class HeartRates {

    private String f_name;
    private String l_name;
    private int day_of_birth;
    private int month_of_birth;
    private int year_of_birth;
    private int currentAge;
    private  int BPM = 220;


    public HeartRates(String f_name, String l_name,
                      int day_of_birth, int month_of_birth,
                      int year_of_birth){

        this.f_name = f_name;
        this.l_name = l_name;
        this.day_of_birth = day_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;

    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setDay_of_birth(int day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public int getDay_of_birth() {
        return day_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public int userAge(){
        int currentAge = 2025 - this.year_of_birth;
        return currentAge;
    }

    public int maxHeartRate(){
        int currentAge = 2025 - this.year_of_birth;
        int maxRate = currentAge - BPM;

        return BPM - maxRate;
    }

    public  int targetHeartRateRange(){
        int currentAge = 2025 - this.year_of_birth;
        int maxRate = BPM - currentAge;
        int lowerTarget = (int) (maxRate * 0.50);
        int higherTarget = (int) (maxRate * 0.85);
        System.out.println("Lower bound: " + lowerTarget + " Higher bound: " + higherTarget);
        return 0;
    }
}
