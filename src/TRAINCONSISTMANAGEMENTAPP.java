import java.util.LinkedHashSet;

public class TRAINCONSISTMANAGEMENTAPP {

    // LinkedHashSet for ordered + unique bogies
    static LinkedHashSet<String> bogieIDs = new LinkedHashSet<>();

    // Add bogie
    public static void addBogie(String id) {
        if (bogieIDs.add(id)) {
            System.out.println(id + " added successfully.");
        } else {
            System.out.println(id + " already exists! Duplicate not allowed.");
        }
    }

    // Display bogies in insertion order
    public static void displayBogies() {
        System.out.println("Train Formation (Insertion Order):");
        for (String id : bogieIDs) {
            System.out.println("- " + id);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC5) =====");

        // Step 1: Add bogies
        addBogie("BG101");
        addBogie("BG105");
        addBogie("BG102");
        addBogie("BG103");

        // Step 2: Try duplicate
        addBogie("BG101");

        // Step 3: Display formation
        displayBogies();

        System.out.println("Program continues...");
    }
}
