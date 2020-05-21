import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if (n < 3) {
            System.out.println("baby");
        } else if (n < 14) {
            System.out.println("child");
        } else if (n < 20) {
            System.out.println("teenager");
        } else if (n < 66) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }

    }
}
