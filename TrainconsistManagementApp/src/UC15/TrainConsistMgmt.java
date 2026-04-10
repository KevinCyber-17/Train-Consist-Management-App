package UC15;

public class TrainConsistMgmt {

    // ✅ CUSTOM RUNTIME EXCEPTION
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie Model
    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        // ✅ Assign cargo with try-catch-finally
        public void assignCargo(String cargo) {

            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for "
                        + shape + " bogie");
            }
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC15: Safe Cargo Assignment ");
        System.out.println("======================================\n");

        // Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}