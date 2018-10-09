import java.util.Random;

// Returns a 0 || 1 integer with a 50%/50% chance of being either
public class FairDice {

    public int getFairOneZer(){
        int counterOne = 0;
        int counterZero = 0;

       //PASSED THE 50%/50% TESTING!!
        int fiftyRandomFifty;
        Random ran = new Random();
        fiftyRandomFifty = ran.nextInt(2);

        //For Testing!.. Count 1's and 0's for fairness.
        if(fiftyRandomFifty == 1){
            counterOne += 1;
        }else{
            counterZero += 1;
        }
       //For TESTING! 50% - 50$
        //System.out.println("\n1's: " + counterOne);
        //System.out.println("0's: " + counterZero);
        return fiftyRandomFifty;
    }
}
