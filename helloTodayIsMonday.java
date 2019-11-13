import java.util.*;

public class helloTodayIsMonday {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Hello");
        map.put(2, "Today");
        map.put(3, "Is");
        map.put(4, "Monday");
        System.out.println(map);
        Iterator<Integer> extract = map.keySet().iterator();
        if (extract.hasNext()) {
            map.remove(4);
            System.out.println(map);
        }
    }
}
