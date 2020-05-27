import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        if ((a >= b) && (b >= c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((b >= a) && (a >= c)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((c >= b) && (b >= a)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if ((b >= c) && (c >= a)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((a >= b) && (c >= b)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    }
}
