/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-10
 * Time: 14:59
 */
public class SingleList {
    static class linkNode {
        public int val;
        public linkNode next;
        public linkNode(int val) {
            this.val = val;
        }
    }

    public linkNode head;

    public void createLinkedList(){
        linkNode node1 = new linkNode(34);
        linkNode node2 = new linkNode(45);
        linkNode node3 = new linkNode(56);
        linkNode node4 = new linkNode(67);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    //打印链表
    public void display(){
        linkNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //得到长度
    public int size() {
        linkNode cur = head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //头插法
    public void addFirst(int val) {
        linkNode newNode = new linkNode(val);
        newNode.next = head;
        head = newNode;
    }

    //尾插法
    public void addLast(int val) {
        linkNode newNode = new linkNode(val);

        if(head == null){
            head = newNode;
            return;
        }
        linkNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    //任意位置插入 第一个节点下标为0
    public void addIndex(int index,int val) throws IndexOutOfBoundException{
        if(index < 0 || index > size()) {
            throw new IndexOutOfBoundException("index不合法！");
        }
        if(index == 0) {
            this.addFirst(val);
            return;
        }
        linkNode newNode = new linkNode(val);
        linkNode cur = head;
        int count = 0;
        while(count != index-1) {
            count++;
            cur = cur.next;
        }

        newNode.next = cur.next;
        cur.next = newNode;
    }

    //查找是否包含
    public boolean contains(int key) {
        if(head == null){
            return false;
        }
        linkNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现的关键字为key的节点
    public void remove(int key) {
        //没有节点
        if(head == null){
            return;
        }
        //只有一个节点
        if(head.val == key){
            head = head.next;
            return;
        }

        linkNode cur = head;
        while(cur.next != null){
            if (cur.next.val == key) {
                break;
            }
            cur = cur.next;
        }
        if(cur.next == null) {
            return;
        }
        cur.next = cur.next.next;
    }
    //删除所有key节点
    public void removeAllKey(int key) {
        if(head == null) {
            return;
        }
        linkNode pre = head;
        linkNode cur = head.next;
        while(cur != null){
            if(cur.val == key){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        if(head.val == key){
            head = head.next;
        }
    }
    public void clear(){
        head = null;
    }

    public linkNode reverse(){
        if(head == null){
            return null;
        }
        linkNode cur = head.next;
        head.next = null;

        while(cur != null){
            linkNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }
}
