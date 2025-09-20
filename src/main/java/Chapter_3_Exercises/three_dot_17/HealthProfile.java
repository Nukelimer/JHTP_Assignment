package Chapter_3_Exercises.three_dot_17;

public class HealthProfile {

    private String f_name;
    private String l_name;
    private String gender;
    private int day_of_birth;
    private int month_of_birth;
    private int year_of_birth;
    private double height;
    private double weight;
    private int BPM = 220;



    public  HealthProfile(String f_name, String l_name, String gender,
                          int day_of_birth, int month_of_birth,
                          int year_of_birth, double height, double weight){

        this.f_name = f_name;
        this.l_name = l_name;
        this.day_of_birth = day_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
        this.height = height;
        this.gender = gender;
        this.weight = weight;


    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getGender() {
        return gender;
    }

    public int getDay_of_birth() {
        return day_of_birth;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }
    public int getYear_of_birth() {
        return year_of_birth;
    }

    public int ageSum(){
        int age = 2025 - getYear_of_birth();
        return age;

    }

    public int getUserAge(){
        return ageSum();
    }

    public int maxHeartRate (){
        return BPM - ageSum();
    }

    public int targetLowerHeartRate (){

        return (int) ((BPM - ageSum()) * 0.50);

    }


    public int targetHigherHeartRate (){


        return  (int) ((BPM - ageSum()) * 0.85);
    }

    public double weightCalculator(){

        double result = (weight * 703) / (height * height);

        return result;
    }


}
