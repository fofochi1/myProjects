// Java program to illustrate 
// Java.util.HashMap 
import java.util.*;
import java.util.Map;
public class Dog {
    public static void main(String[] args)
    {
        Map<String, Integer> map
                = new TreeMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("Chintan", 33);
        map.put("Chintan", 33);
        System.out.println("Size of map is:- "
                + map.size());
// map.remove("Chintan");
        System.out.println("Size of map is:- "
                + map.size());
        System.out.println("Is empty:- "
                + map.isEmpty());
        System.out.println("Fetch value for Chintan Thakkar- "
                + map.get("Chintan"));
        print(map);
        if (map.containsKey("vishal")) {
            Integer a = map.get("vishal");
            System.out.println("value for key"
                    + " \"vishal\" is:- "
                    + a);
        }
        map.clear();
        print(map);
    }
    public static void print(Map<String, Integer> map)
    {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
        else {
            System.out.println(map);
        }
    }
} 