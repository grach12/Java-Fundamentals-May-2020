import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (String elementOne : second) {
            for (String secondElement : first) {
                if (elementOne.equals(secondElement)){
                    System.out.print(elementOne + " ");
                }
            }
        }
    }
}