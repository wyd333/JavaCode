public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.createLinkedList();
        list.display();
/*        System.out.println("//////////////////////");
        System.out.println("头插");
        list.addFirst(999);
        list.display();
        System.out.println("//////////////////////");
        System.out.println("尾插");
        list.addLast(666666);
        list.display();*/
/*        System.out.println("//////////////////////");*/
 /*       System.out.println("求长度");
        System.out.println(list.size());*/
//        try {
/*            list.addIndex(9, 888);
        }catch (IndexOutOfBoundException e) {
            e.printStackTrace();
        }
        list.display();*/
        list.reverseList();
        list.display();
    }
}
