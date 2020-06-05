import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (int i = 0; i < first.length ; i++) {
          //  System.out.println(first[i]);
         //   System.out.println(second[i]);
            if (first[i].equals(second[i])) {
                System.out.print(first[i]);
            }
//                System.out.printf("Arrays are not identical."+
//                        " Found difference at %d index.",i);
                 //izliza ot main metoda
        }
       // System.out.printf("Arrays are identical. Sum: %d%n",sum);
    }
}

