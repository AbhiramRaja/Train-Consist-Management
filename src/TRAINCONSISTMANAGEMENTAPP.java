import java.util.ArrayList;

public class TRAINCONSISTMANAGEMENTAPP {

    // Train consist list
    static ArrayList<String> bogies = new ArrayList<>();

    // Initialize train
    public static void initializeTrain() {
        System.out.println("Train consist initialized.");
    }

    // Add passenger bogie
    public static void addBogie(String bogieType) {
        bogies.add(bogieType);
        System.out.println(bogieType + " bogie added.");
    }

    // Display all bogies
    public static void displayBogies() {
        System.out.println("Current Train Consist:");
        for (String b : bogies) {
            System.out.println("- " + b);
        }
    }

    // Remove a bogie
    public static void removeBogie(String bogieType) {
        if (bogies.remove(bogieType)) {
            System.out.println(bogieType + " bogie removed.");
        } else {
            System.out.println(bogieType + " bogie not found.");
        }
    }

    // Check if bogie exists
    public static void checkBogie(String bogieType) {
        if (bogies.contains(bogieType)) {
            System.out.println(bogieType + " exists in the train.");
        } else {
            System.out.println(bogieType + " does NOT exist.");
        }
    }

    public static void main(String[] args) {

        // Step 1: Welcome
        System.out.println("===== Train Consist Management App =====");

        // Step 2: Initialize
        initializeTrain();

        // Step 3: Add passenger bogies
        addBogie("Sleeper");
        addBogie("AC Chair");
        addBogie("First Class");

        // Step 4: Display bogies
        displayBogies();

        // Step 5: Remove a bogie
        removeBogie("AC Chair");

        // Step 6: Check existence
        checkBogie("AC Chair");
        checkBogie("Sleeper");

        // Step 7: Continue
        System.out.println("Program continues...");
    }
}
