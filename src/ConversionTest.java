public class ConversionTest {
    public static void main(String[] args) {
        // Makes the table for feet to meters conversion
        System.out.println("Feet to Meters Conversion:");
        System.out.println("--------------------------");
        System.out.println("Feet\tMeters");
        System.out.println("--------------------------");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = Conversion.footToMeter(feet);
            System.out.println(feet + "      " + meters);
        }

        System.out.println();
        
        // Creates and shows the  table for meters to feet conversion
        System.out.println("Meters to Feet Conversion:");
        System.out.println("--------------------------");
        System.out.println("Meters\tFeet");
        System.out.println("--------------------------");
        for (double meters = 20.0; meters <= 65.0; meters += 5.0) {
            double feet = Conversion.meterToFoot(meters);
            System.out.println(meters + "      " + feet);
        }
    }
}