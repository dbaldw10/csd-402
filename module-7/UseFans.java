// Dallas Baldwin
import java.util.ArrayList;

public class UseFans {
    public static void displayFan(Fan fan) {

        if (fan.getOn()) {
            System.out.println("Fan is ON");
        }
        else {
            System.out.println("Fan is OFF");
        }

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
    public static void displayFans(ArrayList<Fan> fans) {

        for (int i = 0; i < fans.size(); i++) {

            System.out.println("Fan " + (i + 1) + ":");

            displayFan(fans.get(i));

            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<Fan> fans = new ArrayList<>();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(
                Fan.FAST,
                true,
                10,
                "blue"
        );
        Fan fan3 = new Fan(
                Fan.MEDIUM,
                true,
                8,
                "black"
        );
        Fan fan4 = new Fan(
                Fan.SLOW,
                false,
                12,
                "red"
        );
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);
        System.out.println("Displaying one Fan:");
        System.out.println();
        displayFan(fan2);
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.println("Displaying all Fans:");
        System.out.println();

        displayFans(fans);
    }
}