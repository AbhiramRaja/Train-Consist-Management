import java.util.HashMap;
import java.util.Map;

public class TRAINCONSISTMANAGEMENTAPP {

    // HashMap to store bogie and its capacity
    static HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

    // Add bogie with capacity
    public static void addBogie(String bogie, int capacity) {
        bogieCapacityMap.put(bogie, capacity);
        System.out.println(bogie + " added with capacity " + capacity);
    }

    // Display all bogies with capacity
    public static void displayBogies() {
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC6) =====");

        // Step 1: Add bogies with capacity
        addBogie("Sleeper", 72);
        addBogie("AC Chair", 54);
        addBogie("First Class", 24);
        addBogie("Goods Rectangular", 100);
        addBogie("Goods Cylindrical", 120);

        // Step 2: Display mapping
        displayBogies();

        System.out.println("Program continues...");
    }
}
