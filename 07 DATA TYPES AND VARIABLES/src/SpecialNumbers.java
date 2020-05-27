import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int digSum = 0;
            int currentNum = i;
            while (currentNum > 0) {
                digSum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            boolean isSpecial = ((digSum == 5) || (digSum == 7) || (digSum == 11));

            if (isSpecial) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");

            }

        }

    }
}
