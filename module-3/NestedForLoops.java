public class NestedForLoops {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < (rows - i - 1) * 2; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }
            int numberLength = 0;
            for (int j = 0; j <= i; j++) {
                numberLength += String.valueOf((int) Math.pow(2, j)).length() + 1;
            }
            for (int j = i - 1; j >= 0; j--) {
                numberLength += String.valueOf((int) Math.pow(2, j)).length() + 1;
            }
            int leftSpaces = (rows - i - 1) * 2;
            for (int space = leftSpaces + numberLength; space < 43; space++) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
    }
}