import java.util.*;

// Passenger Bogie class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor
    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

public class TRAINCONSISTMANAGEMENTAPP {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App (UC7) =====");

        // Step 1: Create list
        List<PassengerBogie> bogies = new ArrayList<>();

        // Step 2: Add objects
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));

        // Step 3: Sort using Comparator (by capacity)
        Collections.sort(bogies, new Comparator<PassengerBogie>() {
            public int compare(PassengerBogie b1, PassengerBogie b2) {
                return b1.capacity - b2.capacity; // ascending
            }
        });

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by capacity:");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        System.out.println("Program continues...");
    }
}
