import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String input = "";
        double maxVolume = Integer.MIN_VALUE;
        double sumVolume = 0;
        for (int i = 0; i < n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume = (Math.PI * (radius * radius)) * height;

            sumVolume += volume;
            if (sumVolume > maxVolume) {
                maxVolume = sumVolume;
                sumVolume = sumVolume - maxVolume;
                input = model;
            }
        }
        System.out.println(input);
    }
}