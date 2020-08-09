import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        System.out.print("Destinations: ");
        int sum = 0;
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (sum == 0) {
                System.out.print(matcher.group("destination"));
            } else {
                System.out.print(", " +matcher.group( "destination"));
            }
            sum += matcher.group("destination").length();
        }
        System.out.println();
        System.out.printf("Travel Points: %d", sum);
    }
}