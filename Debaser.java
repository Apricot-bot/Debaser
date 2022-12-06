public class Debaser {
    
    int value;
    
    /**
     * Constructs the Debaser with an initial value of 0
     */
    public Debaser() {
        this.value = 0;
    }
    /**
     * Constructs the Debaser with an given value of 0
     * @param initValue the initial value
     */
    public Debaser(int initValue) {
        this.value = initValue;
    }
    /**
     * Sets/changes value in Debaser
     * @param value new value
     */
    public void setValue(int value) {
        this.value = value;
    }
    /**
     * Returns value
     * @return the value in the Debaser
     */
    public int getValue() {
        return this.value;
    }
    /**
     * Returns the value of a specified digit in a number
     * @param digit the digit of a number right to left
     * @param number the number the digit is taken from
     * @return the value of the digit
     */
    private int digitOf(int digit, int number) {
        return ((number % pow10(digit)) - number % pow10(digit - 1))/pow10(digit - 1);
    }
    /**
     * Places 10 to the specified power
     * @param pow the specified power
     * @return the resulting value of 10 raised to a power
     */
    private int pow10(int pow) {
        return (int)Math.pow(10, pow);
    }
     /**
     * Raises an integer to the specified power
     * @param pow the specified power
     * @param base the base integer
     * @return the resulting value of an integer raised to a power
     */
    private int powI(int base, int pow) {
        return (int)Math.pow(base, pow);
    }
    /**
     * Converts value from base 10 to chosen base
     * @param toBase the chosen base
     * @return converted value in the new base
     */
    public int convertToBaseN(int toBase) {
        int current = this.value;
        int remainder;
        int[] digits = { 0, 0, 0, 0, 0, 0 };

        // Circumventing using a for loop by just doing the same thing over and over

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
    /**
     * Converts value from its current base to base 10
     * @param fromBase the value's current base
     * @return newly converted value in base 10
     */
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
