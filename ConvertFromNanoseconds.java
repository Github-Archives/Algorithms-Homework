
public class ConvertFromNanoseconds {

    long nanoSeconds = 0;
    long milliSeconds = 0;
    long seconds = 0;
    long minutes = 0;
    //long hours = 0;

    public void nanoConvert(long nanoSeconds){

        System.out.println("Subtract Starting Time from Ending Time = Total Elapsed Time: \n#" + nanoSeconds + " Nano-Seconds");
        //nano -> mills -> divide nanoseconds by 1 Million
        milliSeconds = nanoSeconds / 1000000;
        //mills -> seconds -> divide milliseconds by 1,000 (after preconvertered)
        seconds = milliSeconds / 1000;
        minutes = seconds / 60;
        //hours = minutes / 60;

        System.out.println("\n\t\t\t#Final Elapsed Time Output#");
        System.out.println("Minutes:\tSeconds:\tMilliSeconds:\tNanoSeconds:\n" + minutes + ":\t\t\t" + seconds + ":\t\t\t" + milliSeconds + ":\t\t\t" + nanoSeconds + ":\n");
    }
}
