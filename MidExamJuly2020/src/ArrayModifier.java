
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    int temp = numbers[index1];
                    numbers[index1] = numbers[index2];
                    numbers[index2] = temp;
                    break;
                case "multiply":
                    int numberIndex = Integer.parseInt(command[1]);
                    int multiplyerIndex = Integer.parseInt(command[2]);
                    numbers[numberIndex] = numbers[numberIndex] * numbers[multiplyerIndex];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length-1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i]+", ");
            }
        }
    }
}