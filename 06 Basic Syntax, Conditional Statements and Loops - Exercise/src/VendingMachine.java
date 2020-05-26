import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String innputMoney = scan.nextLine();
        double totalMoney = 0;
        //double coins = 0;

        while (!"Start".equals(innputMoney)) {
            double coins = Double.parseDouble(innputMoney);
            if ((coins != 2) && (coins != 1) && (coins != 0.5) && (coins != 0.2) && (coins != 0.1)) {
                System.out.printf("Cannot accept %.2f%n", coins);
                coins -= coins;
            }
            totalMoney += coins;
            innputMoney = scan.nextLine();
        }
        // System.out.println(totalMoney);

        //double totalMoney=0;
        boolean food = true;
        String outputFood = scan.nextLine();
        while (!"End".equals(outputFood)) {
            boolean noteEnoughMoney = false;

            switch (outputFood) {
                case "Nuts":
                    totalMoney -= 2;
                    if (totalMoney < 0) {
                        noteEnoughMoney = true;
                        totalMoney += 2;
                    }
                    break;
                case "Water":
                    totalMoney -= 0.7;
                    if (totalMoney < 0) {
                        noteEnoughMoney = true;
                        totalMoney += 0.7;
                    }
                    break;
                case "Crisps":
                    totalMoney -= 1.5;
                    if (totalMoney < 0) {
                        noteEnoughMoney = true;
                        totalMoney += 1.5;
                    }
                    break;
                case "Soda":
                    totalMoney -= 0.8;
                    if (totalMoney < 0) {
                        noteEnoughMoney = true;
                        totalMoney += 0.8;
                    }
                    break;
                case "Coke":
                    totalMoney -= 1;
                    if (totalMoney < 0) {
                        noteEnoughMoney = true;
                        totalMoney += 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    food = false;
                    break;
            }
            if (food) {
                if (!noteEnoughMoney) {
                    System.out.println("Purchased " + outputFood);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            outputFood = scan.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}