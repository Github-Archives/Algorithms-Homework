import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class RobinSimulator {

    int n = 0;
    int k = 0;
    int fifty50digit = 0;
    String temp = "";
    //ArrayList<Integer> arrList = new ArrayList();

    int[] intArray;
    Scanner input = new Scanner(System.in);

    public RobinSimulator(int n, int k){
        this.n = n;
        this.k = k;
    }
    // Create RobinSimulator object as a master clock which in turn
    //  instantiates the Circular Queue and the FairDiceRoll simultaneously
    void createTheSimulationClock() {

        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(n);
        Random rand = new Random();

        // START THE CLOCK //
        Timer time = new Timer();
        time.clockStart();

    for(int x = 0; x < k; x++) { // PASSES THE 50/50 Return TEST!!
        // Instantiate FairDice and ask it for a 50/50 random Zero or One
        FairDice zeroOneRandom = new FairDice();
        fifty50digit = zeroOneRandom.getFairOneZer();
        int n = rand.nextInt(50) + 1;

        if (fifty50digit == 1) {
            circularQueue.enqueue(n);
            //circularQueue.printArray();
        } else {
            circularQueue.dequeue();

            //System.out.print("Elements deQueued from circular Queue: ");
            //System.out.print(circularQueue.dequeue()+" ");
        }
    }
        //circularQueue.printArray();
        // STOP THE CLOCK //
        // Print the results
        time.clockStop();

        System.out.println("\n");
    }
}
