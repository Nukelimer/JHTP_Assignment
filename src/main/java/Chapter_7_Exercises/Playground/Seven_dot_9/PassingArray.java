package Chapter_7_Exercises.Playground.Seven_dot_9;

public class PassingArray {

    public static void main(String[] args) {
        int [] arrays = {1,2,3,4,5,6,7,8,9,0};

        System.out.printf("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");

        for (int array: arrays){
            System.out.printf("   %d", array);
        }
        modifyArray(arrays);

        System.out.printf("%n%nThe values of the modified array are:%n");

        for (int array : arrays) {
            System.out.printf("    %d", array);
        }

        System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n", arrays[3]);

        modifyElement(arrays[3]); // attempt to modify array[3]
        System.out.printf("array[3] after modifyElement: %d%n", arrays[3]);

    }

    private static void modifyArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
           arrays[i] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "Value of element in modifyElement: %d%n", element);
    }
}
