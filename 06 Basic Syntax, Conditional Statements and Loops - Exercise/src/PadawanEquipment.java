import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ivanchoMoney = Double.parseDouble(scan.nextLine());
        int padwanCount = Integer.parseInt(scan.nextLine());
        double lightsaberSinglePrice = Double.parseDouble(scan.nextLine());
        double roberSinglePrice = Double.parseDouble(scan.nextLine());
        double beltSinglePrice = Double.parseDouble(scan.nextLine());

        double lightSaberTotalPrice = Math.ceil(padwanCount * 1.1) * lightsaberSinglePrice;
        double robesTotalPrice = padwanCount * roberSinglePrice;
        int freebrltConunt = padwanCount / 6;
        double beltsTotalPrice = (padwanCount - freebrltConunt) * beltSinglePrice;

        double finalPrice = lightSaberTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalPrice > ivanchoMoney) {
            double moneyNeed = finalPrice - ivanchoMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            //  double moneyRest = ivanchoMoney-finalPrice;
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        }

    }
}

