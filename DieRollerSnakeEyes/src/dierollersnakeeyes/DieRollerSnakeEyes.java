/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dierollersnakeeyes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeffrey
 */
public class DieRollerSnakeEyes {
    // declare subroutines and variables
    public static int die_1;
    public static int die_2;
        
    public static int rollDie() {
        return (int)(Math.random()*6)+1;
    }
    
    public static void checkForSnakeEyes(int die1, int die2) {
        // will take 2 dice and simultaneously roll both for the count amount in order to check for snake eyes
        boolean snakeEyes;
        int amount = 0;
        int total = 0;


        for (int count = 0; count < 1000; count++) {
            amount = 0;
            do {
                amount++;
                die1 = rollDie();
                die2 = rollDie();
                snakeEyes = (die1 == 1 && die2 == 1);

                if (snakeEyes){ // we have snake eyes if this is true!
                    System.out.println("Snake eyes was found after " + amount + " rolls!");
                    total += amount;
                    break;
                }
            } while (!snakeEyes);
        }

        if (total > 0){
            int average = (total / 1000);
            System.out.println("Average amount of rolls in order to get snake eyes was " + average + " after 1000 attempts!");
        }
        else {
            System.out.println("Snake eyes was not found after " + amount + " tries.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        // roll the die using created method
        checkForSnakeEyes(die_1, die_2);
        TextIO.putln("~fin");
    }
    
}
