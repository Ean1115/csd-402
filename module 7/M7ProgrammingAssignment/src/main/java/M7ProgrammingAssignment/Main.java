package M7ProgrammingAssignment;


import M7ProgrammingAssignment.UseFans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *CSD-402 M7 Assignment
 * @author MASONERE
 */
    public class Main {
    public static void main(String[] args) {
        UseFans useFans = new UseFans();

        Fan fan1 = new Fan("BrandA", 3, true);
        Fan fan2 = new Fan("BrandB", 2, false);
        Fan fan3 = new Fan("BrandC", 1, true);

        useFans.addFan(fan1);
        useFans.addFan(fan2);
        useFans.addFan(fan3);

        System.out.println("Displaying all fans:");
        useFans.displayFans(useFans.getFans());

        System.out.println("Displaying a single fan:");
        useFans.displayFan(fan1);
    }
}