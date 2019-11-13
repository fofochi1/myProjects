import java.util.*;

public class nonPrimeNumbers {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for(int i=1; i <= 10; i++){
            int numberInput = input.nextInt();
            if (prime(numberInput) == false){
                treeSet.add(numberInput);
            }
        }
        System.out.println("The none prime numbers are: " + treeSet);
    }
    public static boolean prime(int number){
        for(int b = 2; b < number; b++){
            if(number%b == 0){
                return false;
            }
        }
        return true;
    }
}

