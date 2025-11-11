package Chapter_8_Exercises.Exercises.Eight_dot_17;

import java.util.Arrays;

public class HugeInteger {

/*I spent the past 3 days trying to solve this problem, so here are my issues;

I do not know maths for context i just know the basics and that's all.
no matter how good you are in breaking down problems even if you are Tsodin(Zozin) my favourite Russsian brogrammer, if the fundamental of what the problem is or requires is beyond the scope of your knowledge your problem solving skill, will be worthless.
I mean how can I write code using Euclidean Algorithm when 'I have never heard of the bloke'?
Well this mean more digging and reading.

I succeeded in writing and solving the other Rational methods, except from the class static method: Greatest Common Divisor (GCD) using the Euclidean Algorithm and the overloaded constructors.
I "sheated" and used Geminii to give me scope. vetted the 'slop' with Grokk and that one said it's a solid solution(might be a case of 'hey-eye-bro-code'.

So I have 6 more exercises to go ought to be 8 but I intentionally skipped 2 because they were about inheritance which is what the next chapter is about, I need to finish them and start the 'easier' part; reading the next chapter.

/*(HugeInteger Class) Create a class HugeInteger which uses a 40-element array of digits to
store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Meth-
od parse should receive a String, extract each digit using method charAt and place the integer
equivalent of each digit into the integer array. For comparing HugeInteger objects, provide the fol-
lowing methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
holds between the two HugeInteger objects and returns false if the relationship does not hold. Pro-
vide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
format specifier %b.]*/

    private static final int ARRAY_SIZE = 40;
    int[] arr = new int[ARRAY_SIZE];

public  HugeInteger(){

}



    public HugeInteger (String number){
        parse(number);
    }
public void parse(String number){
   int length = number.length();

   if (length > ARRAY_SIZE){
       length = ARRAY_SIZE;
       System.err.println("Error: Input number exceeds 40 digits.");
   }

    for (int i = 0; i < length; i++) {

        int targetArrayIndex = ARRAY_SIZE - length + i;
        char charDigit = number.charAt(i);
        int intArr = charDigit - '0';
        this.arr[targetArrayIndex] = intArr;
    }


}


    public String toString() {
        // Find the starting index of the first non-zero digit
        int startingIndex = 0;

        // Loop from the left (index 0) to find where the number actually begins
        while (startingIndex < ARRAY_SIZE - 1 && arr[startingIndex] == 0) {
            startingIndex++;
        }

        // Handle the case where the number is zero
        if (startingIndex == ARRAY_SIZE - 1 && arr[startingIndex] == 0) {
            return "0";
        }

        // Build the string from the starting index to the end
        StringBuilder sb = new StringBuilder();
        for (int i = startingIndex; i < ARRAY_SIZE; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    // --- ARITHMETIC METHODS ---

    public HugeInteger add(HugeInteger h2) {
        // Implementation for addition goes here (working right-to-left with carry)

        HugeInteger result = new HugeInteger();
        int carry = 0;

        // Loop from right (index 39) to left (index 0)
        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
            int sum = this.arr[i] + h2.arr[i] + carry;

            // The digit for the result is the remainder of the division by 10
            result.arr[i] = sum % 10;

            // The carry for the next iteration is the quotient of the division by 10
            carry = sum / 10;
        }

        // Optional: Handle overflow (carry > 0 after the loop)
        if (carry > 0) {
            System.err.println("Warning: Addition resulted in overflow (number exceeded 40 digits). The leading digit was lost.");
        }

        return result;
    }

    public HugeInteger subtract(HugeInteger h2) {
        // Implementation for subtraction goes here (working right-to-left with borrowing)
        // Assume this HugeInteger (this) is >= h2 to avoid negative numbers for now.

        HugeInteger result = new HugeInteger();
        int borrow = 0;

        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
            int diff = this.arr[i] - h2.arr[i] - borrow;

            if (diff < 0) {
                // We must borrow from the left
                diff += 10; // The difference is now positive
                borrow = 1; // Set borrow for the next iteration
            } else {
                // No borrow needed
                borrow = 0;
            }

            result.arr[i] = diff;
        }
        // If final borrow is 1, it implies h2 > this, which violates the assumption.
        // For a full implementation, you would need to handle negative numbers.

        return result;
    }

    // --- PREDICATE METHODS (COMPARISON) ---

    // Note: These methods rely on the fact that the arrays are right-aligned and
    // comparison starts from the most significant digit (index 0).

    public boolean isEqualTo(HugeInteger h2) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (this.arr[i] != h2.arr[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger h2) {
        return !isEqualTo(h2);
    }

    public boolean isGreaterThan(HugeInteger h2) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (this.arr[i] > h2.arr[i]) {
                return true; // Found a larger digit on the left side
            }
            if (this.arr[i] < h2.arr[i]) {
                return false; // Found a smaller digit on the left side
            }
            // If digits are equal, continue to the next index
        }
        return false; // They are equal, so it is NOT strictly greater than
    }

    public boolean isLessThan(HugeInteger h2) {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (this.arr[i] < h2.arr[i]) {
                return true; // Found a smaller digit on the left side
            }
            if (this.arr[i] > h2.arr[i]) {
                return false; // Found a larger digit on the left side
            }
            // If digits are equal, continue to the next index
        }
        return false; // They are equal, so it is NOT strictly less than
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger h2) {
        return isGreaterThan(h2) || isEqualTo(h2);
    }

    public boolean isLessThanOrEqualTo(HugeInteger h2) {
        return isLessThan(h2) || isEqualTo(h2);
    }

    public boolean isZero() {
        for (int digit : arr) {
            if (digit != 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println("--- HugeInteger Test Program ---");

        // 1. Test Parsing (Input) and toString (Output)
        String s1 = "12345678901234567890"; // 20 digits
        String s2 = "1"; // 1 digit

        HugeInteger h1 = new HugeInteger(s1);
        HugeInteger h2 = new HugeInteger(s2);
        HugeInteger h3 = new HugeInteger("99999999999999999999"); // Twenty nines
        HugeInteger h4 = new HugeInteger("10000000000000000000"); // Twenty digits, starting with 1

        System.out.println("\n[Parse/String Test]");
        System.out.printf("h1 (%d digits): %s\n", s1.length(), h1);
        System.out.printf("h2 (%d digit): %s\n", s2.length(), h2);
        System.out.printf("h3: %s\n", h3);

        // 2. Test Addition
        // h1 (20 digits) + h2 (1) = h1 + 1
        HugeInteger h1Plus1 = h1.add(h2);
        System.out.println("\n[Addition Test]");
        System.out.printf("%s + %s = %s\n", h1, h2, h1Plus1);
        // Expected result: 12345678901234567891

        // h3 (all 9s) + h2 (1) should cause many carries and potential overflow
        HugeInteger h3Plus1 = h3.add(h2);
        System.out.printf("%s + %s = %s\n", h3, h2, h3Plus1);
        // Expected result: 100000000000000000000 (21 digits, but array only stores 20 zeros)

        // 3. Test Subtraction
        // h4 (10^19) - h2 (1)
        HugeInteger h4Minus1 = h4.subtract(h2);
        System.out.println("\n[Subtraction Test]");
        System.out.printf("%s - %s = %s\n", h4, h2, h4Minus1);
        // Expected result: 9999999999999999999 (19 nines)

        // 4. Test Predicates (Comparison)
        HugeInteger h5 = new HugeInteger("100");
        HugeInteger h6 = new HugeInteger("099"); // Stores as 99
        HugeInteger h7 = new HugeInteger("100");

        System.out.println("\n[Comparison Test]");
        System.out.printf("h5 (%s) vs h6 (%s):\n", h5, h6);
        System.out.printf("   h5 isEqualTo h7: %b\n", h5.isEqualTo(h7)); // true
        System.out.printf("   h5 isNotEqualTo h6: %b\n", h5.isNotEqualTo(h6)); // true
        System.out.printf("   h5 isGreaterThan h6: %b\n", h5.isGreaterThan(h6)); // true
        System.out.printf("   h5 isLessThan h6: %b\n", h5.isLessThan(h6)); // false
        System.out.printf("   h5 isGreaterThanOrEqualTo h7: %b\n", h5.isGreaterThanOrEqualTo(h7)); // true

        // 5. Test isZero
        HugeInteger hZero = new HugeInteger();
        HugeInteger hNonZero = new HugeInteger("1");
        System.out.println("\n[isZero Test]");
        System.out.printf("hZero isZero: %b\n", hZero.isZero()); // true
        System.out.printf("hNonZero isZero: %b\n", hNonZero.isZero()); // false
    }

}
