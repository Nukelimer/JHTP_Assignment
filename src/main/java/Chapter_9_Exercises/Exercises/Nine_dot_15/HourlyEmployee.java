package Chapter_9_Exercises.Exercises.Nine_dot_15;



public class HourlyEmployee extends Employee {

    private double hour, wage;


    public HourlyEmployee (double hour, double wage, String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0){
            throw  new RuntimeException("wage should be not negative!");
        }
        if (hour > 168){
            throw  new RuntimeException("too many hours, you wan kpaiii?");
        }

        this.hour = hour;
        this.wage = wage;


    }


    public void setHour(double hour) {

        if (hour > 168){
            throw  new RuntimeException("too many hours, you wan kpaiii?");
        }
        this.hour = hour;
    }

    public void setWage(double wage) {

        if (wage < 0){
            throw  new RuntimeException("wage should be not negative!");
        }
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public double getWage() {
        return wage;
    }

    public double earnings(){

      if (hour <= 40){
          return hour * wage;
      }
      else{
          double regularPay = 40 * wage;
          double overTimeHour = hour - 40;
          double overTimeRate = wage * 1.5;
          double result = overTimeHour * overTimeRate;
          return regularPay + result;
      }


    }

    @Override
    public String toString() {
        return String.format("Hello %s %s your earnings is: %.2f!",super.getFirstName(), super.getLastName(),
                earnings());
    }
}
