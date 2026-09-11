// Dallas Baldwin
// Module 5.2

public class BaldwinArrayMethods {

    public static void main(String[] args) {

        int[][] intArray = {
                { 12, 7, 9 },
                { 4, 25, 6 },
                { 11, 3, 18 }
        };

        double[][] doubleArray = {
                { 12.5, 7.2, 9.8 },
                { 4.1, 25.6, 6.3 },
                { 11.9, 3.4, 18.7 }
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Integer Array:");
        System.out.println("Largest element location: ["
                + largestInt[0] + "][" + largestInt[1] + "]");

        System.out.println("Smallest element location: ["
                + smallestInt[0] + "][" + smallestInt[1] + "]");

        System.out.println();

        System.out.println("Double Array:");
        System.out.println("Largest element location: ["
                + largestDouble[0] + "][" + largestDouble[1] + "]");

        System.out.println("Smallest element location: ["
                + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }

    public static int[] locateLargest(double[][] arrayParam) {

        int largestRow = 0;
        int largestColumn = 0;

        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] > largest) {

                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }

        int[] location = {
                largestRow,
                largestColumn
        };

        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {

        int largestRow = 0;
        int largestColumn = 0;

        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] > largest) {

                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }

        int[] location = {
                largestRow,
                largestColumn
        };

        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {

        int smallestRow = 0;
        int smallestColumn = 0;

        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] < smallest) {

                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }

        int[] location = {
                smallestRow,
                smallestColumn
        };

        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {

        int smallestRow = 0;
        int smallestColumn = 0;

        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {

            for (int column = 0; column < arrayParam[row].length; column++) {

                if (arrayParam[row][column] < smallest) {

                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }

        int[] location = {
                smallestRow,
                smallestColumn
        };

        return location;
    }
}