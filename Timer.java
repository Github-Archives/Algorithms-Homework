
public class Timer {

    long start = 0;

    public void clockStart() {
        System.out.println("\nThe Timer Clock has Started and is Now Running...");

        //######### THIS IS WHERE WE JUDGE THE TIME AN OPERATION TAKES.. BELOW #######
        // This tells the system time difference in nanoSeconds by looking
        //  at the subtracted difference between:
        //  'start'    and
        //  'finish'   which makes
        //  'timeElapsed' <------
        // Nanosecond time (Supposedly this is much more reliable than millisecont(
        //
        // START THE CLOCK........
        start = System.nanoTime();
        System.out.println("SYSTEM STARTING TIME:\n#" + start + " Nano-Seconds");
    }

    // STOP THE CLOCK AND READ OUT ELAPSED TIME
    public void clockStop(){
        System.out.println("\nThe Timer Clock has Stopped....");
        // Stop Timer
        long finish = System.nanoTime();
        // calculate time elapsed
        long timeElapsed = finish - start;
        //System.out.println("Total Time Elapsed:\n#" + timeElapsed + " Nano-Seconds");

        // Instantiate this object to convert answer from nanoseconds to sec:min:nano
        ConvertFromNanoseconds convertFromNano = new ConvertFromNanoseconds();
        convertFromNano.nanoConvert(timeElapsed);
    }
}
