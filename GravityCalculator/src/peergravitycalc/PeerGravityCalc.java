package peergravitycalc;

import java.io.*;

enum Day { Mon, Tues, Wed, Thurs, Fri, Sat, Sun };

public class PeerGravityCalc {

    public static int[] returnarray (int[] array) {
        return array;
    }
    public static void t(int n, double k){ 
        System.out.println(n);
        System.out.println(k);
    };
    /*@SuppressWarnings("empty-statement")
    public static void main(String[] arguments){

        // enter classwork below
       /* 
       int die1, die2;   // The values rolled on the two dice.
       
       int countRolls;   // Used to count the number of rolls.
       
       countRolls = 0;
       
       do {
          die1 = (int)(Math.random()*6) + 1;   // roll the dice
          die2 = (int)(Math.random()*6) + 1;
          countRolls++;                        // and count this roll
       } while ( die1 != 1 || die2 != 1 );
       
       System.out.println("It took " + countRolls + " rolls to get snake eyes.");        
     
        */
       /*
           String line;
        int count1;
        int count2;
        int cones = 0;            
        double count;
        int strawberrypercent;
        TextIO.readFile("icecream.dat");
        count1 = 0;            
        count2 = 0;       
        while (TextIO.eof() == false){            
            line = TextIO.getlnString();
            try {
                count = Double.parseDouble(line);
                count2 += count;
            }
            catch (NumberFormatException e){
                cones++;
            }
            if (line.equals("Strewberry"));
                count1++;
            
        
        }
        strawberrypercent = count1/cones*100;
        System.out.println("Strawberry flavor: " + count1);
        System.out.println("Total Number of cones: " + cones);
        System.out.println("Percent of Strewberry: " + strawberrypercent + "%");
        
    */
       
     
       int[] A;
        A = new int[7];
        A[0] = 1;
        A[1] = 1;
        for (int iii = 2; iii < 7; iii++) {
           A[iii] = A[iii-1] + A[iii-2];
        }
        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);

    }*/

}

}
