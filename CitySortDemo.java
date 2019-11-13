import java.util.*;
public class CitySortDemo {

        public static void main(String[] args)
        {
            ArrayList<String> cities = new ArrayList<String>();
            Scanner in = new Scanner(System.in);
            System.out.print("How many cities would you like to add: ");
            int n = in.nextInt();
            System.out.println("What cities would like to add ");
            for(int i =0; i < n; i++){
                cities.add(in.next());
            }
            Collections.sort(cities);

            for (int j = 0; j < cities.size(); j++)
            {
                System.out.println(cities.get(j));
            }
        }
    }


