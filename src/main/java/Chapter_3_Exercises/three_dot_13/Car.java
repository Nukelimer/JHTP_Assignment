package Chapter_3_Exercises.three_dot_13;

public class Car {


    private String model;
    private String year;
    private double price;


    static double discountx;

    public Car(double price, String year, String model){
       this.year = year;
       this.model = model;



       if (price < 1){
           System.out.println("invalid price!!!");
       }else {


       this.price = price;
       }

    }




    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
       if (price < 1){
           System.out.println("invalid price");

       }else {
           this.price = price;
       }
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }


    public double carDiscount(double discountAmount){

        double discount = price * (discountAmount/100.0);
        this.price = this.price - discount;
        discountx = discountAmount;
        return this.price;
    }

}
