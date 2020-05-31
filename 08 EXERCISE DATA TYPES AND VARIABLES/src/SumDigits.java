import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
            /*
            112%10 -> 2 извеждаме последната цифра
            112/10 = 11 махаме последната цифра
            11%10 -> 1
            11/10=1
            1%10->1
            1
            */

