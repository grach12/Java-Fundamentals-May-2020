import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            sum += n;
            counter++;
            System.out.println(counter++);
        }
        System.out.println("Sum: " + sum);
    }
}
