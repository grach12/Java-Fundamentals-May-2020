import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];


        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String firstEl = (input[0]);
            String secondEl = (input[1]);

            if (i % 2 == 0) {  //така редуваме редовете по i
                firstArray[i] = firstEl;   //поставяме на i позиция 1-я елемент
                secondArray[i] = secondEl; //поставяме на i позиция 2-я елемент
            } else {
                firstArray[i] = secondEl;   //поставяме на i позиция 2-я елемент
                secondArray[i] = firstEl;   //поставяме на i позиция 1-я елемент
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
