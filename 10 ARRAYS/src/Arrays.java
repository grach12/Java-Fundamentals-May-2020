import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 3
        // Pesho
        // Gosho
        //Sasho


        int size = Integer.parseInt(scan.nextLine());

        String[] name = new String[size];

        for (int i = 0; i < size ; i++) {  //zapiswame info
            name[i]=scan.nextLine();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        }
    }

