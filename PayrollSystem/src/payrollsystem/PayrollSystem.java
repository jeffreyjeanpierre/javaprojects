/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeffrey
 */
public class PayrollSystem {
    private Vehicle vehicle;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        String varCont = "N";
        byte menuOption = 0;
        do{
            menuOption = showMenu();
            switch (menuOption) {
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft); // add full time employee
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt); // add part time employee
                case 3:
                    calcPayroll(arrEmp);
                    break;
                default:
                    break;
                    
            }
        } while (menuOption != 4);
    }
    public PayrollSystem() {
        new java.util.Date();
    }
    
    //scaffolding PayrollSystem per UML
    public FullTime readNewFullTime(FullTime fullTimer){
        return null;
    }
    public PartTime readNewPartTime(PartTime partTimer){
        return null;
    }
    public void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp){ pArrEmp.add(pEmp); }
    public void calcPayroll(ArrayList<Employee> pArrEmp){
        double totalCompanyPay = 0.0;
        double individualPay;
        
        for (int i=0; i<pArrEmp.size(); i++){
            System.out.println("\n***************************\n");
            individualPay = (pArrEmp.get(i)).calculatePay();
            Vehicle v = (pArrEmp.get(i)).getVehicle();
            String hasVehicle;
            
            if (v == null)
                    hasVehicle = "No";
            else
                hasVehicle = "Yes";
            
            System.out.println("Employee Name: " + (pArrEmp.get(i)).getName());
            System.out.println("Has Vehicle: " + hasVehicle);
            
            if (v != null){
               System.out.println("Plate Number: " + v.getPlateNumber());
               System.out.println("Color : " + v.getColour());
               

            }
            System.out.println("Take Home Pay: " + individualPay);
            totalCompanyPay = totalCompanyPay + individualPay;
           
        }
        System.out.print("***********************\nTotal payroll of the company: " + totalCompany Pay);
    }
    public byte showMenu(){
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);
        
        System.out.println(""
        + "/* ****************************************/*"
        + "\n/* 1. Add FullTime***********************/*"
        + "\n/* 2. Add PartTime***********************/*"
        + "\n/* 3. Calculate Payroll******************/*"
        + "\n/* 4. Exit ******************************/*"
        + "\n/* **************************************/*");
        System.out.print("Input: " ); menuOption = kbd.nextByte();
        return menuOption;
   }
    public Vehicle getVehicle(Vehicle pVehicle){
        return pVehicle;
    }

}
