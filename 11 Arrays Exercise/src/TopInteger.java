import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i <numbers.length-1 ; i++) {
            int currentNumber = numbers[i];
            boolean isToInteger=true;
            for (int j = i+1; j <numbers.length ; j++) {
                if (currentNumber<=numbers[j]){
                    isToInteger=false;
                    break;
                }
            }
            if(isToInteger){
                System.out.print(currentNumber + " ");
            }
        }
        System.out.println(numbers[numbers.length-1]); //последния елемент
    }
}
