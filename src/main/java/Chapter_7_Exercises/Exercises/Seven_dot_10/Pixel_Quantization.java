package Chapter_7_Exercises.Exercises.Seven_dot_10;

public class Pixel_Quantization {

    public static void main(String[] args) {

        int [] images = {45,3,100,43,95,24,54,5655,7,56, 87,61,37};

        for (int i = 0; i < images.length; i++) {
            int range = images[i];

            if(range <= 20){
                images[i] = 10;
            } else if (range <= 40) {
                images[i] = 30;
            } else if (range <= 60) {
                images[i] = 50;
            } else if (range <= 80) {
                images[i] = 70;
            } else if (range <= 100) {
                images[i] = 90;
            } else if (range <= 120) {
                images[i] = 110;
            } else if (range <= 140) {
                images[i] = 130;
            } else if (range <= 160) {
                images[i] = 150;
            } else if (range <= 180) {
                images[i] = 170;
            } else  {
                images[i] = 190;
            }
        }

        System.out.println("QUANTIFIED");
        for (int quantified: images){
            System.out.print("  " + quantified);
        }
            System.out.println();
    }
}
