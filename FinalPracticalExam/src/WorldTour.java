import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String input = scan.nextLine();
        while (!"Travel".equals(input)) {
            String[] tokens = input.split(":");
            switch (tokens[0]) {
                case "Add Stop":
                    int inputIndex = Integer.parseInt(tokens[1]);
                    if (inputIndex >= 0 && inputIndex < text.length()) {
                        if (inputIndex > 0) {
                            String startString = text.substring(0, inputIndex);
                            String endString = text.substring(inputIndex);
                            text = startString + tokens[2] + endString;
                        } else {
                            text = tokens[2] + text;
                        }
                    }
                    System.out.println(text);
                    break;
                case "Remove Stop":
                    int leftIndex = Integer.parseInt(tokens[1]);
                    int rightIndex = Integer.parseInt(tokens[2]);
                    if (leftIndex >= 0 && leftIndex < text.length() && rightIndex >= 0 && rightIndex < text.length()) {
                        String leftString = text.substring(0, leftIndex );
                        String rightString = text.substring(rightIndex+1);
                        text = leftString + rightString;
                    }
                    System.out.println(text);
                    break;
                case "Switch":
                    if (text.contains(tokens[1])) {
                        text = text.replace(tokens[1], tokens[2]);
                    }
                    System.out.println(text);
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: %s%n", text));
    }
}