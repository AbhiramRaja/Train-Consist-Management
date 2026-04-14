import java.util.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagerApp {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // aggregate

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " - " + b.getCapacity());
        }
    }
}
