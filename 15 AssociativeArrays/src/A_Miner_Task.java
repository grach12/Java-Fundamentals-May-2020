import java.util.*;

public class A_Miner_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        String item = scan.nextLine();

        while (!"stop".equals(item)){
            int count = Integer.parseInt(scan.nextLine());
            items.putIfAbsent(item, 0 );
            int newCount = items.get(item)+count;
            items.put(item, newCount);

            item = scan.nextLine();
        }
        items
                .forEach((k, v) ->System.out.println(String.format("%s -> %d",k,v )));
    }
}
