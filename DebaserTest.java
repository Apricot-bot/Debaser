public class DebaserTest {
    public static void main(String[] args) {
        Debaser db = new Debaser();
        System.out.println("\n##################");

        db.setValue(111001);
        System.out.println("\nExpected: 57");
        System.out.println("Actual: " + db.convertToBaseTen(2));

        db.setValue(2110);
        System.out.println("\nExpected: 742");
        System.out.println("Actual: " + db.convertToBaseTen(7));
        
        System.out.println("\n##################\n");
    }
}