import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagerApp {
    public static void main(String[] args) {

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (int)(Math.random() * 100)));
        }

        // -------------------------------
        // 🔹 Loop-Based Filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // 🔹 Stream-Based Filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Results
        // -------------------------------
        System.out.println("Loop Filtering Time: " + loopTime + " ns");
        System.out.println("Stream Filtering Time: " + streamTime + " ns");

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        // Verify both results are same
        System.out.println("Results Match: " + (loopResult.size() == streamResult.size()));
    }
}
