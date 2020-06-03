import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] parts = scan.nextLine().split(" ");
        // 0 --> parts.lenght-1
        //1--> parts.lenght-2
        for (int i = 0; i <parts.length/2 ; i++) {
            //swap
            int swapIndex = parts.length-1-i;
            String temp = parts[i];
            parts[i]=parts[swapIndex];
            parts [swapIndex]=temp;
        }
        System.out.println(String.join(" ",parts));
    }
}
