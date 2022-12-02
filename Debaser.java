
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

    public int convertToBaseN(int toBase) {
        return 0;
    }

    public int convertToBaseTen(int fromBase) {
        return this.value;
    }
    
    public static void main(String[] args) {
        Debaser debaser = new Debaser();
        System.out.println(debaser.convertToBaseN(0));

    }

    public static void main(String[] args) {
        
    }

}
