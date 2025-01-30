package M6ProgrammingAssignment;

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        // Create a fan using the argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");
        System.out.println("Custom Fan: " + customFan);

        // Test the setter methods
        customFan.setSpeed(Fan.MEDIUM);
        customFan.setOn(false);
        customFan.setRadius(8.0);
        customFan.setColor("green");

        // Display the updated fan state
        System.out.println("Updated Custom Fan: " + customFan);
    }
}