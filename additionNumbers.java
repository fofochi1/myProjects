import java.util.*;

public class additionNumbers {
    public static void main (String[] args){
        Random number = new Random();
        TreeSet list = new TreeSet<Integer>();
        for(int i=1; i <= 10; i++){
            int random = number.nextInt(1000);
            list.add(random);
        }
        System.out.println("The ten random numbers are: " + list);
        Iterator<Integer> extract = list.iterator();
        int sum = 0;
        while (extract.hasNext()) {
            int i = extract.next();
            sum += i;
        }
        System.out.print("The sum of the ten numbers is: " + sum);

    }
}
