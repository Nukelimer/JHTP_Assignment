package Chapter_8_Exercises.Exercises.Eight_dot_12;



public class DateAndTime {

   private EnhancedDate date;
   private Time2Increment time;


   public DateAndTime(int month, int day, int year, int hour, int minute, int second){

       this.date = new EnhancedDate(month, day, year);
       this.time = new Time2Increment(hour, minute, second);


   }

   public void tick(){
       int oldHour = time.getHour();
       time.tick();

       if (time.getHour() < oldHour){
           date.nextDay();
       }
   }


   public void incrementMinute(){
       int oldHour = time.getHour();
       time.incrementMinute();

       if (time.getHour() < oldHour) {
           date.nextDay();
       }

   }


   public void incrementHour(){

       int oldHour = time.getHour();
       time.incrementHour();

       if (time.getHour() < oldHour){
           date.nextDay();
       }
   }

    public String toUniversalString() {
        return String.format("%s %s", date.toString(), time.toUniversalString());
    }

    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}
