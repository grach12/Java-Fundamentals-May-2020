import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ivanchoMoney = Double.parseDouble(scan.nextLine());
        int padwanCount = 0;
        double lightsaberSinglePrice = 0;
        double roberSinglePrice = 0;
        double beltSinglePrice = 0;

        double lightSaberTotalPrice = Math.ceil(padwanCount*1.1)*lightsaberSinglePrice;
        double robesTotalPrice = padwanCount*roberSinglePrice;
        int freebrltConunt = padwanCount/6;
        double beltsTotalPrice = (padwanCount-freebrltConunt)*beltSinglePrice;

        double finalPrice = lightSaberTotalPrice+robesTotalPrice+beltsTotalPrice;

        if (finalPrice>ivanchoMoney){
            double moneyNeed = finalPrice-ivanchoMoney;
            System.out.printf("Ivan Cho will need %.2f lv more.", moneyNeed);
        }else  {
          //  double moneyRest = ivanchoMoney-finalPrice;
            System.out.printf("The money is enough - it would cost %.2f lv.", finalPrice);
        }

    }
}

