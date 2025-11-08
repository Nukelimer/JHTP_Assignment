package Chapter_8_Exercises.Exercises.Eight_dot_14;

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Insert elements
        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);

        set2.insertElement(3);
        set2.insertElement(4);
        set2.insertElement(5);
        set2.insertElement(100);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union: " + unionSet);

        // Intersection
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);

        // Deletion test
        set1.deleteElement(3);
        System.out.println("Set 1 after deleting 3: " + set1);

        // Equality check
        System.out.println("Set 1 equals Set 2? " + set1.isEqualTo(set2));

        // Empty set check
        IntegerSet emptySet = new IntegerSet();
        System.out.println("Empty set: " + emptySet);
    }
}
