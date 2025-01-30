/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M7ProgrammingAssignment;

/**
 * CSD-402 M7 Assignment
 * @author MASONERE
 */
public class Fan {
    private String brand;
    private int speed;
    private boolean isOn;

    public Fan(String brand, int speed, boolean isOn) {
        this.brand = brand;
        this.speed = speed;
        this.isOn = isOn;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}