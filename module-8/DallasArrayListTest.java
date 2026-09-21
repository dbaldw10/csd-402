import java.util.ArrayList;
import java.util.Scanner;

 /* Dallas Baldwin Module 8.2
 */
public class DallasArrayListTest {
    public static Integer max(ArrayList list) {

        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);

            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter some integers to add to the ArrayList.");
        System.out.println("When you are ready, Enter 0 when you are finished.");
        int number;
        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            numbers.add(number);
        } while (number != 0);

        System.out.println();
        System.out.println("ArrayList: " + numbers);
        System.out.println("Largest value: " + max(numbers));

        // Additional testing of the max method.
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(12);
        testList.add(48);
        testList.add(7);
        testList.add(25);
        testList.add(0);

        System.out.println();
        System.out.println("Test ArrayList: " + testList);
        System.out.println("Expected largest value: 48");
        System.out.println("Returned largest value: " + max(testList));

        // Test an empty ArrayList.
        ArrayList<Integer> emptyList = new ArrayList<>();

        System.out.println();
        System.out.println("Testing an empty ArrayList...");
        System.out.println("Expected value: 0");
        System.out.println("Returned value: " + max(emptyList));

        scanner.close();
    }
}