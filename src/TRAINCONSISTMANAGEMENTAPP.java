import java.util.*;

public class TrainConsistManagerApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {

        // Step 1: Create bogie ID array (unsorted allowed)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort before binary search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        Scanner sc = new Scanner(System.in);

        // Step 3: Input search key
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 4: Perform Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Step 5: Display result
        if (found) {
            System.out.println("Bogie ID FOUND ✅");
        } else {
            System.out.println("Bogie ID NOT FOUND ❌");
        }

        sc.close();
    }
}
