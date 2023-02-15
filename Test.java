import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-15
 * Time: 15:23
 */
public class Test {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        int[] array = new int[]{27,15,19,18,28,34,65,49,25,37};
        myHeap.createHeap(array);
        System.out.println(Arrays.toString(myHeap.elem));
    }
}
