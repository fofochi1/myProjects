import java.util.*;

public class nameAndAge {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        int minAge = 0;
        String minName = "";
        for( int i=1; i <= 10; i++){
            System.out.println("What is your name and age: ");
            String name = input.next();
            int age = input.nextInt();
            if (i == 1) {
                minAge = age;
            }
            map.put(name, age);
        }
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            if (minAge > key.getValue()) {
                minAge = key.getValue();
                minName = key.getKey();
            }
        }
        System.out.println("The youngest person is " + minName + " and is " + minAge + " years old.");
    }
}
