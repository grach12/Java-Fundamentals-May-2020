import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGame = Integer.parseInt(scan.nextLine());

        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int displayCount = 0;
        double sum = 0;

        for (int i = 1; i <= lostGame; i++) {
            if (i % 2 == 0) {
                sum += headsetPrice;
            }
            if (i % 3 == 0) {
                sum += mousePrice;
            }
            if ((i % 2 == 0) && (i % 3 == 0)) {
                sum += keyboardPrice;
                displayCount++;

                if (displayCount % 2 == 0) {
                    sum += displayPrice;
                }
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
