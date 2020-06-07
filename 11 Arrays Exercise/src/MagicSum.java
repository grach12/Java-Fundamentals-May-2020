import java.util.Scanner;

//Напишете програма, която принтира всички неповторими двойки
//в масив от числа , чиято сума е равна на числото по долу.


public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int unique : numbers) {

        }


    }
}
