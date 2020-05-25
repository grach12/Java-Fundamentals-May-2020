import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();

        int m = n.length();
        int totalSum = 0;
        for (int i = 0; i < m; i++) {
            int digit = Integer.parseInt("" + n.charAt(i));
            //     System.out.println(digit);
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;

        }
        int num = Integer.parseInt(n);
        if (totalSum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
