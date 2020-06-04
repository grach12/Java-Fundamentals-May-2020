import java.util.Scanner;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     int n = Integer.parseInt(scan.nextLine());

        int[] countWagon = new int[n];
        int sum = 0;
        for (int i = 0;i < n; i++) {
            countWagon[i] = Integer.parseInt(scan.nextLine());
            int people = countWagon[i];
            System.out.print (countWagon[i]+" ");
            sum+=people;
        }
        System.out.println();
        System.out.println(sum);
    }
}

   /*     String values = scan.nextLine();
        String[] wagons = values.split(" ");
        int[] length = new int[wagons.length];
        int sum = 0;
        for (int i = 0; i < wagons.length ; i++) {
            length[i] = Integer.parseInt(scan.nextLine());
            int people = length[i];
            System.out.print (length+" ");
            sum+=people;
        }
        System.out.println();
        System.out.println(sum);
    }
}
*/


//        int n = Integer.parseInt(scan.nextLine());
//
//        int[] countWagons = new int [n];
//        int sum = 0;
//        for (int i = 0; i <n ; i++) {
//            int wagonData = Integer.parseInt(scan.nextLine());
//            System.out.printf("%d ",wagonData);
//
//            sum+=wagonData;
//        }
//        System.out.println();
//        System.out.println(sum);
//    }
//}
