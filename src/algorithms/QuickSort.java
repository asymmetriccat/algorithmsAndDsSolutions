package algorithms;


public class QuickSort {
    private static int partition(int[] unsorted, int low, int high)
    {
        int pivot = unsorted[low];
        while (low < high)
        {
            while (low < high && unsorted[high] > pivot) {
                high--;
            }
            unsorted[low] = unsorted[high];
            while (low < high && unsorted[low] <= pivot) {
                low++;
            }
            unsorted[high] = unsorted[low];
        }
        unsorted[low] = pivot;
        return low;
    }

   public static void quick_sort(int[] unsorted, int low, int high)
    {
        int loc = 0;
        if (low < high)
        {
            loc = partition(unsorted, low, high);
            quick_sort(unsorted, low, loc - 1);
            quick_sort(unsorted, loc + 1, high);
        }
    }

    public static void main(String[] args)
    {
        int[] x = { 6, 2, 4, 1, 5, 9 };
        QuickSort.quick_sort(x, 0, x.length - 1);
        for (int in:x)
        {
            System.out.println(in + ",");
        }

    }
}
