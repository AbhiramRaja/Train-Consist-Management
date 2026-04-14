import java.util.*;
import java.util.stream.*;

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC8) =====");

        // Step 1: Create list
        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        // Step 2: Convert to stream & filter (capacity > 50)
        List<PassengerBogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("High Capacity Bogies (capacity > 50):");
        for (PassengerBogie b : filteredBogies) {
            b.display();
        }

        System.out.println("Program continues...");
    }
}
