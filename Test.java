/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-17
 * Time: 19:32
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        int[] array = new int[]{27,15,19,18,28,34,65,49,25,37};
        priorityQueue.createHeap(array);
        priorityQueue.print();
        priorityQueue.push(80);
        priorityQueue.print();
        priorityQueue.pollHeap();
        priorityQueue.print();
        System.out.println(priorityQueue.peekHeap());
    }
}
