import java.util.Arrays;

public class BaldwinAverage {

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30, 40};
        int[] intArray = {15, 25, 35, 45, 55};
        long[] longArray = {100, 200, 300, 400, 500, 600};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5, 14.5};

        System.out.println("Short Array");
        System.out.println("Elements: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println();

        System.out.println("Integer Array");
        System.out.println("Elements: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println();

        System.out.println("Long Array");
        System.out.println("Elements: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println();

        System.out.println("Double Array");
        System.out.println("Elements: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }

    public static short average(short[] array) {
        int sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}