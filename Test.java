/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-10
 * Time: 14:59
 */
public class Test {
    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.createLinkedList();
        list.display();
        System.out.println(list.size());
        list.addFirst(56);
        list.display();
        System.out.println(list.size());
        list.addLast(888);
        list.display();
        try {
            list.addIndex(0, 56);
            list.display();
        }catch (IndexOutOfBoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.contains(28));
        list.removeAllKey(56);
        list.display();
        list.remove(67);
        list.remove(45);
        list.remove(34);
        list.display();
        list.reverse();
        list.display();
    }
}
