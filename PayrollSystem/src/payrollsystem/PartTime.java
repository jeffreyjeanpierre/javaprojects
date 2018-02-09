/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class PartTime extends Employee {
    private double rate;
    private double hoursWorked;
    
    public PartTime(int id, String name, double rate,
            double hoursWorked2, Vehicle v1)
    {
        super(id, name, v1);
        this.rate = rate;
        this.hoursWorked = hoursWorked2;
    }
    public double calculatePay() {
        System.out.println("Part time employee.");
        return (this.getHoursWorked() * this.getRate());
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public static FullTime readNewFullTime(){
        int id=0;
        String name=null;
        double rate=0.0;
        double hoursWorked = 0.0;
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Id: ");
        id = kbd.nextInt();
        System.out.print("\nEnter Name: ");
        name = kbd.next();
        System.out.print("\nEnter Hourly Rate: ");
        rate = kbd.nextDouble();
        System.out.print("\nNumber of Hours Worked: ");
        hoursWorked = kbd.nextDouble();
        
        Vehicle v1 = getVehicle();
        PartTime pt1 = null;
        pt1 = new PartTime(id,name,rate,hoursWorked, v1);
        return pt1;
    }
}
