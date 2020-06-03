import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[]numbers = scan.nextLine().split(" ");

        int[] parsed = Arrays.stream(numbers)
                .mapToInt(i->Integer.parseInt(i))
                .toArray();


        int sum =0;



        for (String number : numbers) {
            int current = Integer.parseInt(number);

            if (current%2==0){
                sum+=current;
            }
        }
        System.out.println(sum);
    }
}
