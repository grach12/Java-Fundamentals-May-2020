import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] word = {"one", "two", "three"};

        for (int i = 0; i <word.length ; i++) {
            word[i] = "Hello";  //prezapisvame dannite v masiva
        }

        for (int i = 0; i <word.length ; i++) {
            System.out.println(word[i]);
        }
        
    }
}
