import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie Class
class GoodsBogie {
    private String type;   // Rectangular, Cylindrical
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Step 3: Validation Rule
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum!");
            }

            // Assign if safe
            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie ✅");

        } catch (CargoSafetyException e) {
            // Step 4: Handle Exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Assignment attempt completed for " + type + " bogie\n");
        }
    }

    public String getDetails() {
        return type + " Bogie -> Cargo: " + (cargo == null ? "None" : cargo);
    }
}

// Step 6: Main Class
public class TrainConsistManagerApp {
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical"));
        bogies.add(new GoodsBogie("Rectangular"));

        // Safe assignment
        bogies.get(0).assignCargo("Petroleum");

        // Unsafe assignment
        bogies.get(1).assignCargo("Petroleum");

        // Program continues
        bogies.get(1).assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.getDetails());
        }
    }
}
