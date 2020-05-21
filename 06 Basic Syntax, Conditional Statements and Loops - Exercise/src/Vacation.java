import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String weekday = scan.nextLine();

        double price = 0.0;

        switch (type) {
            case "Students":
                if ("Friday".equals(weekday)) {
                    price = 8.45;
                } else if ("Saturday".equals(weekday)) {
                    price = 9.80;
                } else if ("Sunday".equals(weekday)) {
                    price = 10.46;
                }
                if (n >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (n >= 100) {
                    n -= 10;
                }
                if ("Friday".equals(weekday)) {
                    price = 10.90;
                } else if ("Saturday".equals(weekday)) {
                    price = 15.60;
                } else if ("Sunday".equals(weekday)) {
                    price = 16;
                }
                break;
            case "Regular":
                if ("Friday".equals(weekday)) {
                    price = 15;
                } else if ("Saturday".equals(weekday)) {
                    price = 20;
                } else if ("Sunday".equals(weekday)) {
                    price = 22.50;
                }
                if ((n >= 10) && (n <= 20)) {
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price * n);
    }
}
