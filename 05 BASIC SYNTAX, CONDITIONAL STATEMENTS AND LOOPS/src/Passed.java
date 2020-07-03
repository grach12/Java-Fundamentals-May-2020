import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        double profit = 200;

        double turnover = 1500;

        double expense = turnover-profit;

        double margin = profit/expense*100;

        System.out.println(margin);
    }
}

//        if (grade>=3.00){
//            System.out.println("Passed!");
//        }
//    }
//}
