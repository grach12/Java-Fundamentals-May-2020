import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        int price = 0;

        if ("Weekday".equals(day) && age >= 0 && age <= 18) {
            price = 12;
        } else if ("Weekday".equals(day) && age >= 19 && age <= 64) {
            price = 18;
        } else if ("Weekday".equals(day) && age >= 65 && age <= 122) {
            price = 12;
        } else if ("Weekend".equals(day) && age >= 0 && age <= 18) {
            price = 15;
        } else if ("Weekend".equals(day) && age >= 19 && age <= 64) {
            price = 20;
        } else if ("Weekend".equals(day) && age >= 65 && age <= 122) {
            price = 15;
        } else if ("Holiday".equals(day) && age >= 0 && age <= 18) {
            price = 5;
        } else if ("Holiday".equals(day) && age >= 19 && age <= 64) {
            price = 12;
        } else if ("Holiday".equals(day) && age >= 65 && age <= 122) {
            price = 10;
        }

        if (price != 0) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }


    }
}

