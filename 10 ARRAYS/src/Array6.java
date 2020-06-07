import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] word = {"one", "two", "three"};

//        for (String item : word) {
//            item = "Hello"; //това не работи! <ReadOnly>
//        }

        for (String element : word) {
            System.out.println(element);
        }
    }
}
