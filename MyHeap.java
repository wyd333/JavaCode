import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-15
 * Time: 15:23
 */
public class MyHeap {
    public int[] elem;
    public int usedSize;

    public MyHeap() {
        this.elem = new int[10];
    }

    //建堆 建小堆
    public void createHeap(int[] array) {
        this.elem = Arrays.copyOf(array,array.length);
        this.usedSize = this.elem.length;
        for (int parent = (elem.length-1-1)/2; parent >= 0; parent--) {
            shiftDown(parent,usedSize);
        }
    }

    private void shiftDown(int parent, int len) {
        int child = 2*parent+1;
        while(child < len) {
            if(child+1 < len && elem[child+1] < elem[child]) {
                child++;
            }

            if(elem[parent] > elem[child]) {
                int tmp = elem[parent];
                elem[parent] = elem[child];
                elem[child] = tmp;
                parent = child;
                child = 2*parent+1;
            }else{
                break;
            }
        }
    }
}
