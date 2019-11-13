import java.util.*;

public class numberLogic {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int number;
        int value;
        String key;

        for(number = 0; number < 5; number++){
            key = "Num" + (number +1) + ": ";
            value = number*2 + 1;
            hashMap.put(key, value);
            treeMap.put(key, value);
            System.out.println( key + value);
        }
        System.out.println("Hashmap: " + hashMap);
        System.out.println("Treemap: " + treeMap);
    }
}
