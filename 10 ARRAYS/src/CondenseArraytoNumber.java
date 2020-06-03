import java.util.Scanner;
import java.util.Arrays;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputs = scan.nextLine().split(" ");
        int[] numbers = new int[inputs.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
// 4 7 9 1 3
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}
