/* Name: Dallas Baldwin */

import java.util.ArrayList;
import java.util.Scanner;

public class Baldwin_Mod9_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Strawberry");
        items.add("Blueberry");
        items.add("Watermelon");
        items.add("Pineapple");
        items.add("Grapes");
        items.add("Peach");
        items.add("Mango");

        System.out.println("Items in the ArrayList:");
        System.out.println();

        int count = 0;

        for (String item : items) {
            System.out.println(count + ": " + item);
            count++;
        }

        System.out.println();
        System.out.print("Enter the number of the element you would like to see again: ");

        String userInput = input.nextLine();

        try {

            // Convert the String input into an Integer object
            Integer selectedInteger = Integer.valueOf(userInput);

            // Auto-unboxing Integer into an int
            int selectedIndex = selectedInteger;

            System.out.println();
            System.out.println("You selected: " + items.get(selectedIndex));

        } catch (IndexOutOfBoundsException e) {

            System.out.println();
            System.out.println("Exception has been thrown: Out of Bounds");

        } catch (NumberFormatException e) {

            System.out.println();
            System.out.println("Exception has been thrown: Out of Bounds");

        }

        input.close();
    }
}