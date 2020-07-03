import java.util.Scanner;
import java.util.Arrays;
//Напишете програма, която принтира всички неповторими двойки
//в масив от числа , чиято сума е равна на числото по долу.

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int[] ints = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                int equalNum = Integer.parseInt(scan.nextLine());

                for (int i = 0; i < ints.length; i++) {
                    for (int j = i+1; j < ints.length; j++) {
                        if (ints[i] + ints[j] == equalNum){
                            System.out.println(ints[i] + " " + ints[j]);
                        }
                    }
                }
            }
        }

//        int n = Integer.parseInt(scan.nextLine()); //числото с което сравняваме двойките
//
//        int sum = 0;
//        for (int i = 0; i < 2; i++) {
//            int numbers = Integer.parseInt(scan.nextLine());
//
//            sum+=numbers;
//            if(sum==n){
//                System.out.print(numbers);
//            }
//        }
//
//    }
//}