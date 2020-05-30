import java.util.Scanner;

public class CharstoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);

        String input = "";

        System.out.println(input+first+second+third);
    }
}
