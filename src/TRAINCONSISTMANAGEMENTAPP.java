import java.util.ArrayList;

public class TRAINCONSISTMANAGEMENTAPP {

    // Train consist (list of bogies)
    static ArrayList<String> bogies = new ArrayList<>();

    // Method to initialize train
    public static void initializeTrain() {
        System.out.println("Train consist initialized.");
    }

    // Method to get bogie count
    public static int getBogieCount() {
        return bogies.size();
    }

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("====================================");
        System.out.println(" Welcome to Train Consist Management App ");
        System.out.println("====================================");

        // Step 2: Initialize train
        initializeTrain();

        // Step 3: Display initial bogie count
        System.out.println("Initial bogie count: " + getBogieCount());

        // Step 4: Continue program
        System.out.println("Program continues...");
    }
}