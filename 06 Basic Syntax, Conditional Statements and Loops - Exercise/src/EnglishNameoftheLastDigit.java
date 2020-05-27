import java.util.Scanner;

public class EnglishNameoftheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = (input.length());

        char last = 0;
        for (int i = 0; i <= num - 1; i++) {
            last = input.charAt(i);
        }
        // System.out.println(last);
        switch (last) {
            case 48:
                System.out.println("zero");
                break;
            case 49:
                System.out.println("one");
                break;
            case 50:
                System.out.println("two");
                break;
            case 51:
                System.out.println("three");
                break;
            case 52:
                System.out.println("four");
                break;
            case 53:
                System.out.println("five");
                break;
            case 54:
                System.out.println("six");
                break;
            case 55:
                System.out.println("seven");
                break;
            case 56:
                System.out.println("eight");
                break;
            case 57:
                System.out.println("nine");
                break;
        }
    }
}
