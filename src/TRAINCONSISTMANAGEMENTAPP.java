import java.util.*;

public class TrainConsistManagerApp {

    // Search method with fail-fast validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // Linear Search Logic (can also use binary)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 Example 1: Empty array (to test exception)
        String[] bogieIds = {};  

        // 🔹 Example 2: Uncomment below to test normal flow
        // String[] bogieIds = {"BG101", "BG205", "BG309"};

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID FOUND ✅");
            } else {
                System.out.println("Bogie ID NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR ⚠️: " + e.getMessage());
        }

        sc.close();
    }
}
