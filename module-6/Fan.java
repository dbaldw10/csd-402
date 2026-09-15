//Dallas Baldwin
//Module 6.2

public class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for on
    public boolean getOn() {
        return on;
    }

    // Setter for on
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Returns information about the fan
    @Override
    public String toString() {

        if (on) {
            return "Fan is ON"
                    + "\nSpeed: " + speed
                    + "\nRadius: " + radius
                    + "\nColor: " + color;
        }
        else {
            return "Fan is OFF"
                    + "\nSpeed: " + speed
                    + "\nRadius: " + radius
                    + "\nColor: " + color;
        }
    }

    // Test code
    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(FAST, true, 10, "blue");

        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Fan 2:");
        System.out.println(fan2);

        System.out.println();

        // Test setter methods
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println("Fan 1 after using setter methods:");
        System.out.println(fan1);

        System.out.println();

        // Test getter methods
        System.out.println("Testing Fan 2 getter methods:");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.getOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}