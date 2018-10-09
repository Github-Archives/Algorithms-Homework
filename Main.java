// Drew Williams
// hw0927
// https://github.com/Github-Archives/Algorithms-Homework


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int arrIntLimit = 6;
        int n = 0;
        int K = 0;

        Scanner input = new Scanner(System.in);

        // Loop 6 times for global lifecycle
        for(int i = 0; i < 6 ; i++) {
            System.out.println("____________________________________________________________________________");
            System.out.println("\nEnter 'n'");
            n = input.nextInt();

//            System.out.println("____________________________________________________________________________");
//            System.out.println("\nEnter 'n'\nNumber of Elements in Array #" + i);
//            n = input.nextInt();

            System.out.println("\nNext, Enter 'K'");
            K = input.nextInt();

            //System.out.println("\nPresent 'n' Value for the \nSize of THIS Array => " + n);
           // System.out.println("K: \t\t\t\t   " + K);
           // System.out.println("\n********************************************************\n");

            // Create RobinSimulator object as a master clock which in turn
            //  instantiates the Circular Queue and the FairDiceRoll simultaneously
            RobinSimulator robin = new RobinSimulator(n, K);
            robin.createTheSimulationClock();
            System.out.println("____________________________________________________________________________");
        }
    }
}
