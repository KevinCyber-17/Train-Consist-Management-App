package UC14;

public class TrainConsistMgmt {

    // ✅ CUSTOM EXCEPTION
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ✅ Passenger Bogie Model with validation
    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC14: Handle Invalid Bogie Capacity ");
        System.out.println("======================================\n");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.getType() + " -> " + b1.getCapacity());

            // Invalid bogie
            PassengerBogie b2 = new PassengerBogie("General", 0);
            System.out.println("Created Bogie: " + b2.getType());

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}