import java.util.Scanner;


public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String oldUserName = userName;
        int userLenght = userName.length();
        String pass = "";

        for (int i = userLenght - 1; i >= 0; i--) {
            pass = pass + userName.charAt(i);
            //String.format("%s%s", pass, userName.charAt(i));
        }
        int counter = 0;
        userName = scan.nextLine();
        while (!userName.equals(pass)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", oldUserName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            userName = scan.nextLine();
        }
        if (counter < 4) {
            System.out.printf("User %s logged in.", oldUserName);
        }
    }
}
