import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        int elevatorCapacity = Integer.parseInt(scan.nextLine());

        int count = peopleCount/elevatorCapacity;
        if (count*elevatorCapacity<peopleCount){
            count++;
        }
        System.out.println(count);
    }
}
