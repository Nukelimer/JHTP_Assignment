package Chapter_3.three_dot_12;

public class PetrolPurchase {

   private String stationLocation;
   private   String typeOfPetrol;
   private int quantityInLtrs;
   private double pricePerLtrs;
   private double percentageOfDiscount;


    public PetrolPurchase(String stationLocation,
                          String typeOfPetrol,
                          int quantityInLtrs,
                          double pricePerLtrs,
                          double percentageOfDiscount){


        this.percentageOfDiscount = percentageOfDiscount;
        this.pricePerLtrs = pricePerLtrs;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityInLtrs = quantityInLtrs;
        this.stationLocation = stationLocation;


    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public void setPercentageOfDiscount(double percentageOfDiscount){

        this.percentageOfDiscount = percentageOfDiscount;
    }

    public void setPricePerLtrs(double pricePerLtrs) {
        this.pricePerLtrs = pricePerLtrs;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public void setQuantityInLtrs(int quantityInLtrs) {
        this.quantityInLtrs = quantityInLtrs;
    }

    public double getPercentageOfDiscount() {
        return percentageOfDiscount;
    }

    public double getPricePerLtrs() {
        return pricePerLtrs;
    }

    public int getQuantityInLtrs() {
        return quantityInLtrs;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public double getPurchaseAmount(){
        double total =  quantityInLtrs * pricePerLtrs;
        double discount = total * (percentageOfDiscount/100.0);
        double finalTotal = total - discount;


        return  finalTotal;
    }
}
