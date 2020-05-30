import java.util.Scanner;

public class LowerorUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);


        if (first>='a'){
            System.out.println("lower-case");
        }else if (first<='Z'){
            System.out.println("upper-case");
        }
    }
}
