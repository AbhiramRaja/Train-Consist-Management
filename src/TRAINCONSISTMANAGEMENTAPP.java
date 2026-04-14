import java.util.TreeSet;

public class TRAINCONSISTMANAGEMENTAPP {

    // TreeSet for sorted + unique bogie IDs
    static TreeSet<String> bogieIDs = new TreeSet<>();

    // Add bogie ID
    public static void addBogieID(String id) {
        if (bogieIDs.add(id)) {
            System.out.println(id + " added successfully.");
        } else {
            System.out.println(id + " already exists! Duplicate not allowed.");
        }
    }

    // Display sorted bogie IDs
    public static void displayBogieIDs() {
        System.out.println("Sorted Bogie IDs (Train Order):");
        for (String id : bogieIDs) {
            System.out.println("- " + id);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC4) =====");

        // Step 1: Add bogie IDs
        addBogieID("BG105");
        addBogieID("BG101");
        addBogieID("BG103");
        addBogieID("BG102");

        // Step 2: Try duplicate
        addBogieID("BG101");

        // Step 3: Display sorted order
        displayBogieIDs();

        System.out.println("Program continues...");
    }
}
