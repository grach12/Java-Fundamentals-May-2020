import java.util.Scanner;

public class PoundtoDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pound = Double.parseDouble(scan.nextLine());

        double poundToUSDCourse = 1.31;
        System.out.printf("%.3f", pound*poundToUSDCourse);
    }
}