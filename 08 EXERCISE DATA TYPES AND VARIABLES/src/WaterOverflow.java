import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int flou = 0;
        for (int i = 0; i <n ; i++) {
            int in = Integer.parseInt(scan.nextLine());
            flou+=in;
            if (flou>255){
                System.out.println("Insufficient capacity!");
                flou=flou-in;
            }
        }
        System.out.println(flou);
    }
}
