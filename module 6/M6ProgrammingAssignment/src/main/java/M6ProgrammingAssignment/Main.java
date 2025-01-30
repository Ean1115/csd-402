package M6ProgrammingAssignment;

public class Main {
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