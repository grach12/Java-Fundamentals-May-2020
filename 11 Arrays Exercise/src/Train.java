import java.util.Scanner;
import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagoonsCount = Integer.parseInt(scan.nextLine());

        int[] train = new int[wagoonsCount];

        for (int i = 0; i < wagoonsCount; i++) {
            train[i] = Integer.parseInt(scan.nextLine());
        }

        int sum = 0;
        for (int waggon : train) {
            sum=sum+waggon;
            System.out.print(waggon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}


//     int wagoonsCount = Integer.parseInt(scan.nextLine());
//
//        int[] train = new int[wagoonsCount];
//        int sum = 0;
//        for (int i = 0;i < wagoonsCount; i++) {
//            train[i] = Integer.parseInt(scan.nextLine());
//            int people = train[i];
//
//            System.out.print (train[i]+" ");
//            sum+=people;
//        }
//        System.out.println();
//        System.out.println(sum);
//    }
//}

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
