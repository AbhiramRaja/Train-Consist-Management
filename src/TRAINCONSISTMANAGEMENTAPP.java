import java.util.*;

public class TrainConsistManagerApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Step 1: Create array of bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // Step 2: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display sorted result
        System.out.println("\nAfter Sorting (Ascending):");
        System.out.println(Arrays.toString(capacities));
    }
}
