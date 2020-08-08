import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> train = readIntList(scan);
        int capacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!"end".equals(input)){
            //add x
            String [] tokens = input.split(" ");
            if ("Add".equals(tokens[0])) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            }else {
                int peopleToAdd = Integer.parseInt(tokens[0]);
                for (int wagoon = 0; wagoon < train.size(); wagoon++) {
                    int sum = train.get(wagoon)+peopleToAdd;
                    if (sum<=capacity){
                        train.set(wagoon, sum);
                        break;
                    }
                }
            }

            input=scan.nextLine();
        }
        
printTrain(train); 
        
    }
    private static void printTrain(List<Integer> list){
        for (Integer elementWagoon : list) {
            System.out.print(elementWagoon+" ");
        }
    }

    private static List<Integer> readIntList(Scanner scan) { //метод , който чете int list
       List<Integer> train = new ArrayList<>();
       String[] input = scan.nextLine().split(" ");
        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
        return train;
    }
}
