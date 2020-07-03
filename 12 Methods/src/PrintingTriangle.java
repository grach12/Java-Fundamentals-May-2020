import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxLineNumber = Integer.parseInt(scan.nextLine());

        printTriangle(maxLineNumber);

    }
    private static void printTriangle(int maxLineNumber){
    printTOpHalf(maxLineNumber);
    printBottomHalf(maxLineNumber-1);
    }

    public static void printTOpHalf(int numberOfRows) {
        for (int i = 1; i <=numberOfRows ; i++) {
            printRow(1, i);
            System.out.println();
        }
    }

    public static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >=1 ; i--) {
           printRow(1, i);
            System.out.println();
        }
    }

    public static void printRow(int from, int to) {
        for (int i = from; i <=to ; i++) {
            System.out.print(i+" ");
        }
    }
}
