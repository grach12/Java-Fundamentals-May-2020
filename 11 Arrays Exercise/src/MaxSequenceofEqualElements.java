import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int bestLenght = 0;
        int digit = 0;

        int currentLength=1;
        for (int i = 0; i <numbers.length-1 ; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i+1];
            if (currentElement==nextElement){
                currentLength++;
                if (currentLength > bestLenght){ //ако сложим >= ще принтира най дясното
                    bestLenght=currentLength;
                    digit=currentElement;
                }
            }else {
                currentLength=1;
            }
        }
        for (int i = 0; i <bestLenght ; i++) {
            System.out.print(digit+ " ");
        }

    }
}
