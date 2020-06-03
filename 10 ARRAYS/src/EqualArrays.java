import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < first.length ; i++) {
            if (!first[i].equals(second[i])){
                System.out.printf("Arrays are not identical."+
                        " Found difference at %d index.",i);
                return; //izliza ot main metoda
            }
            sum+=Integer.parseInt(first[i]);
        }
        System.out.printf("Arrays are identical. Sum: %d%n",sum);
    }
}