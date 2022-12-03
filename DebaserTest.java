public class DebaserTest {
    public static void main(String[] args) {
        Debaser db = new Debaser();
        System.out.println("\n##########################");

        db.setValue(111001);
        System.out.println("\n111001 in base2 -> base10 = 57");
        System.out.println("Output: " + db.convertToBaseTen(2));

        db.setValue(2110);
        System.out.println("\n2110 in base7 -> base10 = 742");
        System.out.println("Output: " + db.convertToBaseTen(7));

        db.setValue(733);
        System.out.println("\n733 in base5 -> base10 = 193");
        System.out.println("Output: " + db.convertToBaseTen(5));

        db.setValue(1244);
        System.out.println("\n1244 in base5 -> base10 = 199");
        System.out.println("Output: " + db.convertToBaseTen(5));

        System.out.println("\n##########################");

        db.setValue(199);
        System.out.println("\n199 in base10 -> base5 = 1244");
        System.out.println("Output: " + db.convertToBaseN(5));

        db.setValue(37);
        System.out.println("\n37 in base10 -> base2 = 100101");
        System.out.println("Output: " + db.convertToBaseN(2));

        
        db.setValue(742);
        System.out.println("\n742 in base10 -> base7 2110");
        System.out.println("Output: " + db.convertToBaseN(7));
        
        System.out.println("\n##########################\n");
    }
}