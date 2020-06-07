import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //0 1 2 3 4 5 6
        String line = "1 2 3 4 5 6";

        String [] item = line.split(" ");

        int[] arr = new int[item.length];

        for (int i = 0; i <item.length ; i++) {
            arr[i]= Integer.parseInt(item[i]);
        }
    }
}
