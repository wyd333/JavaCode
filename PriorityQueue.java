import java.util.Arrays;

public class PriorityQueue {
    public int[] elem;
    public int usedSize;
 
    public PriorityQueue() {
        this.elem = new int[10];
    }
 
    /**
     * 建堆的时间复杂度：O(N)
     *
     * @param array
     */
    public void createHeap(int[] array) {
        //初始化堆数组
        this.elem = Arrays.copyOf(array,array.length);
        this.usedSize = array.length;

        //建大堆
        for (int root = (usedSize-1)/2; root >= 0; root--) {
            shiftDown(root,usedSize);
        }
    }
 
    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len  是每棵子树调整结束的结束条件
     * 向下调整的时间复杂度：O(logn)
     */
    private void shiftDown(int root,int len) {
        int child = 2 * root + 1;
        while(child < len) {
            if(child + 1 < len && elem[child+1] > elem[child]) {
                child++;
            }
            if(elem[child] > elem[root]) {
                swap(elem,child,root);
                root = child;
                child = 2 * root + 1;
            }else{
                break;
            }
        }
    }
    private void swap(int[] array,int i , int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
 
    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        if(isFull()) {
            elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize++] = val;
        shiftUp(usedSize-1);
    }
 
    private void shiftUp(int child) {
        int parent = (child-1)/2;
        while (parent >= 0){
            if(elem[parent] < elem[child]) {
                swap(elem,parent,child);
                child = parent;
                parent = (child-1)/2;
            }else{
                break;
            }
        }
    }
 
    public boolean isFull() {
        return usedSize == elem.length;
    }
 
    /**
     * 出队【删除】：每次删除的都是优先级高的元素
     * 仍然要保持是大根堆
     */
    public void pollHeap() {
        if(isEmpty()) {
            return;
        }
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
    }
 
    public boolean isEmpty() {
        return usedSize == 0;
    }
 
    /**
     * 获取堆顶元素
     * @return
     */
    public int peekHeap() {
        return elem[0];
    }
    public void print() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }
}