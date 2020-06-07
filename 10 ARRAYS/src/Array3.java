import java.util.Scanner;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];

        for (int i = 0; i <num.length ; i++) {
            num[i]=1;
            num[5]=num[2]+num[7];
            System.out.println(num[10]);
        }
    }
}



//        //strem - съкратен запис
//        String inputLine = scan.nextLine();
//        String[] items = inputLine.split(" ");
//        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray(); //edna i sushta operacia
//    }
//}
