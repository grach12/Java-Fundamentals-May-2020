import java.util.Scanner;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //strem - съкратен запис
        String inputLine = scan.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray(); //edna i sushta operacia



    }
}
