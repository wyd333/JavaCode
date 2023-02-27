import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-27
 * Time: 13:37
 */
public class Test {
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
    private static void quick(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(array,start,end);
        quick(array,start,pivot-1);
        quick(array,pivot+1, end);
    }
    private static int partition(int[] array, int left, int right) {
        int tmp = array[left];
        while(left < right) {
            while(left < right && array[right] >= tmp) {
                right--;
            }
            array[left] = array[right];
            while(left < right && array[left] <= tmp) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = tmp;
        return left;
    }


}
