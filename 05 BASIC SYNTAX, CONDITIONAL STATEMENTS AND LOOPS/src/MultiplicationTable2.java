import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        int result = 0;
        if (m > 10) {
            System.out.printf("%d X %d = %d%n", n, m, n * m);
        }
        for (int i = m; i <= 10; i++) {

            result = n * i;

            System.out.printf("%d X %d = %d%n", n, i, result);
        }
    }
}
