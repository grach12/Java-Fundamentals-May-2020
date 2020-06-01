import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int dayCount = 0;
        int drops = 10;
        int mineCrew = 26;
        int sum = 0;
        while (n>=100){
            sum+=n;
            n-=drops;
            dayCount++;
            sum-=mineCrew;
            if (n<100){
                sum-=mineCrew;
            }
        }
        System.out.println(dayCount);
        System.out.println(sum);
    }
}
