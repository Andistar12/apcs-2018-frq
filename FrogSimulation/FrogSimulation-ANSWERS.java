import java.util.Random;

public class FrogSimulation {

    private int goalDistance;

    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    public boolean simulate() {
        /*
         * This problem is logic heavy. It may seem short but there's a lot going on
         *      You'll need two temp variables: one to track distance, one to track
         *          current number of hops you are at
         *      There are three distinct conditions to break the loop, and if any
         *          one of them are true, the simulation must stop. There are two ways
         *          to implement that. You can use a while loop with every condition
         *          separated with comparative and (&&). Or you can have three separate
         *          if statements with break; commands if any of them are true
         *      In the central loop, both temp variables must be updated, AND the
         *          provided hopDistance() method must be used. This is a trust thing:
         *          you simply trust that hopDistance() works and roll with it.
         *          Note that this simulate() method is in the same class as hopDistance(),
         *          so you can just directly call it
         *      DO NOT forget the return statement. That's the whole purpose of this method
         *          and the whole reason "boolean" is in the method declaration. It doesn't
         *          really matter how you return it. This implementation has a one-liner for
         *          it but you could just have easily did an if/else statement
         */
        
        int distanceHopped = 0;
        int hops = 0;

        while (
                distanceHopped < goalDistance &&
                distanceHopped >= 0 &&
                hops < maxHops) {

            distanceHopped += hopDistance();
            hops++;
        }

        return distanceHopped >= goalDistance;
    }

    public double runSimulations(int num) {

        /*
         * This problem is probably the easiest and shortest problem on this test.
         *      You'll need a running total of wins or losses. Since "num," the total 
         *          number of runs, is given, you don't have to track both wins and losses
         *      The for loop does not need to be explained
         *      The major catch in this problem is the return statement. Note that I casted 
         *          my running total to be a double, not an int. If I kept it as an int,
         *          then I would be doing integer division, which would drop the fractional
         *          bit and only return zero. The problem also asks to return a double
         *          An alternative solution would be to declare the running total to be a double
         */
        int totalWins = 0;

        for (int i = 0; i < num; i++) 
            if (simulate()) totalWins++;

        return ((double) totalWins) / num;
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
