/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statcalc;

/**
 *
 * @author Jeffrey
 */
public class StatCalc {    
    
        /*
     * An object of class StatCalc can be used to compute several simple statistics
     * for a set of numbers.  Numbers are entered into the dataset using
     * the enter(double) method.  Methods are provided to return the following
     * statistics for the set of numbers that have been entered: The number
     * of items, the sum of the items, the average, and the standard deviation
     */

   private int count;   // Number of numbers that have been entered.
   private double sum;  // The sum of all the items that have been entered.
   private double squareSum;  // The sum of the squares of all the items.
 
   /**
    * Add a number to the dataset.  The statistics will be computed for all
    * the numbers that have been added to the dataset using this method.
    */
   public void enter(double num) {
          count++;
          sum += num;
          squareSum += num*num;
   }
 
   /**
    * Return the number of items that have been entered into the dataset.
    */
   public int getCount() {
          return count;
   }
 
   /**
    * Return the sum of all the numbers that have been entered.
    */
   public double getSum() {
          return sum;
   }
 
   /**
    * Return the average of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
   */
   public double getMean() {
        return sum / count;
   }
 
   /**
    * Return the standard deviation of all the items that have been entered.
    * The return value is Double.NaN if no numbers have been entered.
    */
   public double getStandardDeviation() {
          double mean = getMean();
          return Math.sqrt( squareSum/count - mean*mean );
   }
   
   public StatCalc() {
        // TODO code application logic here

   }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a dataset array from given string input
       double[] input = { 5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13 };
       //String input = "5 7 12 23 3 2 8 14 10 5 9 13";
       
       // format input into an double[]
       double[] formattedInput = formatInput(input);
       
       // instantiate statistics calculator
       StatCalc myStatCalc = new StatCalc();
       
       // run calculations for the dataset using a calculator and dataset
       processDataset(myStatCalc, formattedInput);

       // print results 
       System.out.println("Count: " + myStatCalc.getCount());
       System.out.println("Mean: " + myStatCalc.getMean());
       System.out.println("Standard Deviation: " + myStatCalc.getStandardDeviation());
    }
    private static void processDataset(StatCalc calculator, double[] formattedInput){
        // process the input; will store values in instance
        for (int i = 0; i < formattedInput.length; i++) {
           try 
           {
               calculator.enter(formattedInput[i]);
           }
           catch(NumberFormatException e) 
           {
               System.out.println("unable to convert: " + e);
           }
       }
    }
    private static double[] formatInput(String input){
        // check type, pass back correct type
        String[] stringInput;
        stringInput = input.split(" ");
        int i = 0;
        double[] result;
        result = new double[stringInput.length];
        
        while (i < stringInput.length)
        {
            result[i] = (double)Integer.parseInt(stringInput[i]);
            i++;
        }
        return result;
    }
    private static double[] formatInput(int[] input){
        // check type, pass back correct type
        int i = 0;
        double[] result;
        result = new double[input.length];
        
        while (i < input.length)
        {
            result[i] = (double)(input[i]);
            i++;
        }
        return result;
    }
    private static double[] formatInput(double[] input){
        // check type, pass back correct type
        return input;
    }
}
