import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());  //poke power
        int m = Integer.parseInt(scan.nextLine());  //distance to poke Targets
        int y = Integer.parseInt(scan.nextLine());  //poke stamina

        int staminaN = n/2;
        int pokes = 0;
        while (n>=m) {
            n -= m;
            pokes++;
            if  ((n==staminaN)&&(y!=0)){
                n/=y;
            }
        }
        System.out.println(n);
        System.out.println(pokes);
    }
}

