public class MergeSortDemo
{
    public static void main(String[] args)
    {
        int i=10000;
        for(i=10000;i<=90000;i=i+10000)
        {int[] array = ArrayUtil.randomIntArray(i,i);
            MergeSorter.resetCounter();
            MergeSorter.sort(array);
            System.out.println("Array size: " + i +  " comparisons: " + MergeSorter.getCounter());
        }
    }
}