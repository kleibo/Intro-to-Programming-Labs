package util;
import java.util.Random;
import java.util.Arrays;

public class ArrayUlit{
    public static final String VERSION = "1.27";   
    
    public static int[] createRandomArray(int length, int randomBound){
        Random generator = new Random();
        int[] rnds = new int[length];
        for(int i = 0; i < rnds.length; i++){
            rnds[i] = generator.nextInt(randomBound);
        }
        return rnds;
    }
    
    public static double getAverage(int[] theArray){
        double avg = 0;
        for(int i = 0; i <= theArray.length; i++){
            if(i < theArray.length){
                avg = theArray[i] + avg;
            }else{
                avg = avg/theArray.length;
            }
        }
        return avg;
    }    
    public static double getSum(int[] theArray){
        double sum = 0;
        for(int i = 0; i < theArray.length; i++){
            if(i < theArray.length){
                sum = theArray[i] + sum;   
            }
        }
        return sum;
    }
    
    public static int getMaximum(int[] theArray){
        Arrays.sort(theArray);
        int max = theArray[theArray.length - 1];
        return max;
    }
    
    public static int getMinimum(int[] theArray){
        Arrays.sort(theArray);
        int min = theArray[0];
        return min;
    }
    
    public static int numBelowAverage(int[] theArray){
        int counter = 0;
        int avg = 0;
        for(int i = 0; i <= theArray.length; i++){
            if(i < theArray.length){
                avg = theArray[i] + avg;
            }else{
                avg = avg/theArray.length;
            }
        }
        for(int i = 0; i < theArray.length; i++){
            if(theArray[i] < avg){
                counter++;
            }
        }
        return counter;
    }
    
    public static void printArray(int[] theArray){
        for(int i = 0; i <= theArray.length; i++){
            if(i < theArray.length - 1){
                System.out.print(theArray[i] + ", ");
            }else if(i == theArray.length - 1){
                System.out.print(theArray[i]);
            }
        }
    }
}
