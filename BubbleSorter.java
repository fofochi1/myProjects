import java.util.*;
public class BubbleSorter {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers would you like in the array: ");
        int count = in.nextInt();
        int[] arr = new int[count];
        System.out.println("What numbers would you like in the array: ");
        Scanner userNumbers = new Scanner(System.in);
        for(int i = 0; i < count; i++){
            if(userNumbers.hasNextInt()){
                arr[i] = userNumbers.nextInt();
            }
        }

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
