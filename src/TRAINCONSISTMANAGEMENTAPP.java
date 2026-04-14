import java.util.*;

public class TrainConsistManagerApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true; // Match found
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }

        sc.close();
    }
}
