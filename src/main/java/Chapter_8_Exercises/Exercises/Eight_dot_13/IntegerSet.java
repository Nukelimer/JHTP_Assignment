package Chapter_8_Exercises.Exercises.Eight_dot_13;

import java.util.Arrays;

/*(Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the
range 0–100. The set is represented by an array of booleans. Array element a[i] is true if integer i
is in the set. Array element a[j] is false if integer j is not in the set. The no-argument constructor
initializes the array to the “empty set” (i.e., all false values). explain step by step.*/
public class IntegerSet {

    private  boolean[] set;

    public IntegerSet(){

        set  = new boolean[101];
    }


    public void insertItemFromSet(int item) {
      if (item >= 0 && item <= 100){
          set[item] = true;
      } else{
          System.out.printf("Error: %d is outside the valid range (0-100).%n", item);
      }
    }

    public void deleteItemFromSet(int item) {
        if (item >= 0 && item <= 100){
            set[item] = false;
        } else{
            System.out.printf("Error: %d is outside the valid range (0-100).%n", item);
        }
    }


    public String toString(){

        String result = "{";
        boolean empty = true;


        for (int i = 0; i < set.length; i++) {
            if (set[i]){
                result += i + " ";
                empty = false;
            }
        }

        if (empty){
            return  "----";
        }
        result += "}";
        return  result;
    }

    public void showArrayContent(){
        System.out.println(Arrays.toString(set));
    }
}
