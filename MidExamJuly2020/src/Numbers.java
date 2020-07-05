import java.util.Scanner;


public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] numbersFromString = input.split(" ");
        int[] numbers = new int[numbersFromString.length];

        for (int i = 0; i < numbersFromString.length; i++) {
            numbers[i] = Integer.parseInt(numbersFromString[i]);
        }

        sortArray(numbers);

        int avr = 0;

        for (int i = 0; i < numbers.length; i++) {
            avr = avr + numbers[i];
        }
        avr = avr / numbers.length;

        int counter = -1;
        int[] result = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avr) {
                counter++;
                result[counter] = numbers[i];
            }
            if (counter >= 4) {
                break;
            }
        }

        if (counter == -1) {
            System.out.println("No");
        } else {
            for (int i = 0; i <= counter; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    private static void sortArray(int[] numbers) {
        boolean flag = true;
        int temporary;
        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    temporary = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temporary;
                    flag = true;
                }
            }
        }
    }
}