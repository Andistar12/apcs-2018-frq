import java.util.Random;

public class FrogSimulation {

    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public boolean simulate() {

        // TODO TEST PROBLEM
    }

    public double runSimulations(int num) {

        // TODO TEST PROBLEM

    }

    // private int hopDistance() { }

/* Everything below this point is not on the test but implements the example problems
     * It also makes this file runnable */

    public static void main(String args[]) {
        
        System.out.println("Running FrogSimulation test");
        FrogSimulation frogSim = new FrogSimulation(24, 5);

        // Test 1
        frogSim.example = 1;
        frogSim.currentValue = 0;
        System.out.print("Test 1: expecting " + example_values[0]);
        System.out.println(". Got: " + frogSim.simulate());
        // Test 2
        frogSim.example = 2;
        frogSim.currentValue = 0;
        System.out.print("Test 2: expecting " + example_values[1]);
        System.out.println(". Got: " + frogSim.simulate());
        // Test 3
        frogSim.example = 3;
        frogSim.currentValue = 0;
        System.out.print("Test 3: expecting " + example_values[2]);
        System.out.println(". Got: " + frogSim.simulate());
        // Test 4
        frogSim.example = 4;
        frogSim.currentValue = 0;
        System.out.print("Test 4: expecting " + example_values[3]);
        System.out.println(". Got: " + frogSim.simulate());
        // Test 5
        frogSim.example = 5;
        frogSim.currentValue = 0;
        System.out.print("Test 5: expecting " + example_values[4]);
        System.out.println(". Got: " + frogSim.simulate());

        // Run 5 runSimulation Tests
        System.out.print("Running runSimulations(400) five times: Got ");
        System.out.print(frogSim.runSimulations(400) + " ");
        System.out.print(frogSim.runSimulations(400) + " ");
        System.out.print(frogSim.runSimulations(400) + " ");
        System.out.print(frogSim.runSimulations(400) + " ");
        System.out.println(frogSim.runSimulations(400) + " ");
    }

    private int hopDistance() {
        currentValue++;
        if (examples[example - 1].length > currentValue - 1) {
            return examples[example - 1][currentValue - 1];
        } else {
            return rand.nextInt(20) - 6;
        }
    }

    public int currentValue = 0;
    public int example = 0;
    private Random rand = new Random();

    public static int[][] examples = {
        {5, 7, -2, 8, 6},
        {6, 7, 6, 6},
        {6, -6, 31},
        {4, 2, -8},
        {5, 4, 2, 4, 3}
    };
    public static boolean example_values[] = {
        true, true, true, false, false
    };
}
