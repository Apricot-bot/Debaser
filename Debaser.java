
public class Debaser {
    
    int value;

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
        return 0;
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
        return 
          digits[0] * powI(fromBase, 0)
        + digits[1] * powI(fromBase, 1)
        + digits[2] * powI(fromBase, 2)
        + digits[3] * powI(fromBase, 3)
        + digits[4] * powI(fromBase, 4)
        + digits[5] * powI(fromBase, 5);
    }

}
