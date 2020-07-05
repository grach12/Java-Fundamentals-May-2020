import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        switch (input){
            case "add":
                add(a,b);break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void divide(int a , int b) {
        System.out.println(a/b);
    }

    public static void  subtitute (int a, int b){

    }
}
