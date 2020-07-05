import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int employerOne = Integer.parseInt(scan.nextLine());
        int employerTwo = Integer.parseInt(scan.nextLine());
        int employerThree = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());

        int totalEmploy = employerOne + employerTwo + employerThree;

        int hours = studentsCount / totalEmploy;

        if (studentsCount%totalEmploy!=0){
            hours++;}
            if (hours % 3 == 0) {
                hours = hours + hours / 3 - 1;
                if (hours < 0) {
                    hours = 0;
                }
            } else {
                hours = hours + hours / 3;
            }


        System.out.println("Time needed: " + hours + "h.");
    }

}