import java.util.HashSet;

public class TRAINCONSISTMANAGEMENTAPP {

    // HashSet to store unique bogie IDs
    static HashSet<String> bogieIDs = new HashSet<>();

    // Add bogie ID
    public static void addBogieID(String id) {
        if (bogieIDs.add(id)) {
            System.out.println(id + " added successfully.");
        } else {
            System.out.println(id + " already exists! Duplicate not allowed.");
        }
    }

    // Display all unique bogie IDs
    public static void displayBogieIDs() {
        System.out.println("Unique Bogie IDs in Train:");
        for (String id : bogieIDs) {
            System.out.println("- " + id);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC3) =====");

        // Step 1: Add bogie IDs
        addBogieID("BG101");
        addBogieID("BG102");
        addBogieID("BG103");

        // Step 2: Try adding duplicate
        addBogieID("BG101");

        // Step 3: Display unique IDs
        displayBogieIDs();

        System.out.println("Program continues...");
    }
}