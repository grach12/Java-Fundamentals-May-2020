import java.util.Scanner;

public class PrintPartoftheASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        for (int i = first; i <=second ; i++) {
            System.out.printf("%c",i);
        }
    }
}
