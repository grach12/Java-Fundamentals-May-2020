import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new LinkedList<>();
        double finalPrice = 0.0;

        String imput = scan.nextLine();

        while (!"Purchase".equals(imput)) {
            Matcher matcher = pattern.matcher(imput);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                furniture.add(name);
                finalPrice += price*count;
            }
            imput = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(e-> System.out.println(e));
        System.out.printf("Total money spend: %.2f ",finalPrice);
    }
}
