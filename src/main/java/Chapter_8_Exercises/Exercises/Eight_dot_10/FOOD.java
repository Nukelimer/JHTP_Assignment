package Chapter_8_Exercises.Exercises.Eight_dot_10;

public enum FOOD {

    APPLE("Fruit",  23),
    BANANA("Fruit", 5),
    CARROT("Vegetable", 47);

    private final String type;
    private final int calories;


    FOOD(String type, int calories) {

       this.type = type;
       this.calories= calories;

    }
    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }


}
