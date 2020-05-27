import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startUpBalance = Double.parseDouble(scan.nextLine());
        double finalBalance = startUpBalance;
        boolean balance = true;
        String input = scan.nextLine();

        double price = 0;

        while (!"Game Time".equals(input)) {
            if (("OutFall 4".equals(input)) || ("CS: OG".equals(input)) || ("Zplinter Zell".equals(input)) ||
                    ("Honored 2".equals(input)) || ("RoverWatch".equals(input)) ||
                    ("RoverWatch Origins Edition".equals(input))) {
                switch (input) {
                    case "OutFall 4":
                    case "RoverWatch Origins Edition":
                        price = 39.99;
                        break;
                    case "CS: OG":
                        price = 15.99;
                        break;
                    case "Zplinter Zell":
                        price = 19.99;
                        break;
                    case "Honored 2":
                        price = 59.99;
                        break;
                    case "RoverWatch":
                        price = 29.99;
                        break;
                }

                if (price > startUpBalance) {
                    System.out.println("Too Expensive");
                } else {
                    startUpBalance -= price;
                    System.out.println("Bought " + input);
                }

                if (startUpBalance == 0) {
                    System.out.println("Out of money!");
                    balance = false;
                    break;
                }
            } else {
                System.out.println("Not Found");
            }

            input = scan.nextLine();
        }

        if (balance) {
            double totalSpend = finalBalance - startUpBalance;
            System.out.printf("Total spent: $%.2f", totalSpend);
            System.out.printf(". Remaining: $%.2f", startUpBalance);
        }
    }
}
