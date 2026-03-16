public class QuantityMeasurementApp {

    // Inner class representing Feet measurement
    public static class Feet {

        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Getter
        public double getValue() {
            return value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj)
                return true;

            // Null check
            if (obj == null)
                return false;

            // Type check
            if (getClass() != obj.getClass())
                return false;

            // Cast object
            Feet other = (Feet) obj;

            // Compare double values
            return Double.compare(this.value, other.value) == 0;
        }

        // Optional but recommended when equals() is overridden
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // Main method to test
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + result + ")");
    }
}