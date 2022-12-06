
public class Debaser {
    
    int value;

    // Interface

    public Debaser() {
        this.value = 0;
    }
    public Debaser(int initValue) {
        this.value = initValue;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

    // convenient utility functions
    private int digitOf(int digit, int number) {
        return ((number % pow10(digit)) - number % pow10(digit - 1))/pow10(digit - 1);
    }
    private int pow10(int pow) {
        return (int)Math.pow(10, pow);
    }
    private int powI(int base, int pow) {
        return (int)Math.pow(base, pow);
    }

    public int convertToBaseN(int toBase) {
        int current = this.value;
        int remainder;
        int[] digits = { 0, 0, 0, 0, 0, 0 };

        // Circumventing using a for loop by just doing the same thing over and over
        // Repeated division by toBase, taking the remainders as each digit, reducing current each time

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[0] = remainder;

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[1] = remainder;

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[2] = remainder;

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[3] = remainder;

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[4] = remainder;

        remainder = current % toBase;
        current = (current - remainder) / toBase;
        digits[5] = remainder;

        // Converting digits to their correct places
        // (for representation in a base10 integer)

        int result = 0
        + digits[0] * pow10(0)
        + digits[1] * pow10(1)
        + digits[2] * pow10(2)
        + digits[3] * pow10(3)
        + digits[4] * pow10(4)
        + digits[5] * pow10(5);

        return result;
     
    }


    public int convertToBaseTen(int fromBase) {
        int[] digits = {
            digitOf(1, this.value),
            digitOf(2, this.value),
            digitOf(3, this.value),
            digitOf(4, this.value),
            digitOf(5, this.value),
            digitOf(6, this.value),
        };

        // Each digit multiplied by its place value
        // Calculated with base^digitPlace
        return 
          digits[0] * powI(fromBase, 0)
        + digits[1] * powI(fromBase, 1)
        + digits[2] * powI(fromBase, 2)
        + digits[3] * powI(fromBase, 3)
        + digits[4] * powI(fromBase, 4)
        + digits[5] * powI(fromBase, 5);
    }

}
