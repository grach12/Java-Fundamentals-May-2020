import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int value = 0;
        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());

            value = (snow / time)*(quality*quality);
        }

    }
}
