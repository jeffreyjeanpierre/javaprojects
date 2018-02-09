/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceenums;

/**
 *
 * @author Jeffrey
 */
public class PracticeEnums {

    enum Day { Mon, Tues, Wed, Thurs, Fri, Sat, Sun };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (Day day : Day.values()){
            System.out.println(day);
        }
        
        
        
    }
    
}
