import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-27
 * Time: 13:37
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {-1,9,1000,8,34,5,7,2};
        Test.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
