import java.util.*;
public class MainSorting {
    public static void main(String[] args){
        Random randomArray = new Random();
        int[] array = new int[100000];
        for(int i=0; i < array.length; i++){
            array[i] = randomArray.nextInt(1000000);
        }

        BubbleSort bbSort = new BubbleSort();
        bbSort.bubbleSort(array);

        SelectionSort ssSort = new SelectionSort();
        ssSort.selectionSort(array);

        InsertionSort isSort = new InsertionSort();
        isSort.insertionSort(array);

        MergeSort mmSort = new MergeSort();
        mmSort.mergeSort(array,0, array.length-1);
    }
}
