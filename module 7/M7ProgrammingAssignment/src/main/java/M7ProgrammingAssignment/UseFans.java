/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M7ProgrammingAssignment;

/**
 *CSD-402 M7 Assignment
 * @author MASONERE
 */
import java.util.ArrayList;
import java.util.List;

public class UseFans {
    private List<Fan> fans;

    public UseFans() {
        this.fans = new ArrayList<>();
    }

    public void addFan(Fan fan) {
        this.fans.add(fan);
    }

    public List<Fan> getFans() {
        return this.fans;
    }

    public void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public void displayFan(Fan fan) {
        System.out.println("Brand: " + fan.getBrand());
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Is On: " + fan.isOn());
        System.out.println();
    }
}