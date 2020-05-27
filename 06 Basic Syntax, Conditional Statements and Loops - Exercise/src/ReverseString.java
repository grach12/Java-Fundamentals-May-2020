import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int lenght = input.length();

        String oborotnoe = "";

        for (int i = lenght-1; i >=0 ; i--) {
            oborotnoe = oborotnoe+input.charAt(i);
        }
        System.out.println(oborotnoe);
    }
}
