/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2ac2;

/**
 *
 * @author Haris
 */
public class L2Ac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                DateDemoRun date1, date2;
        
        date1 = new DateDemoRun();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1:");
        date1.displayDate();
        
        date2 = new DateDemoRun();
        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;
        System.out.println("date2:");
        date2.displayDate();

    }
    
}
