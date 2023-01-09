 // 无头单向非循环链表实现
 public class SingleLinkedList {
    static class Node {
        public int val;
        public Node next;

        public Node(int val){
            this.val = val;
        }
    }

    //链表的头结点
    public Node head;

    //创建测试链表
     public void createLinkedList() {
        Node node1 = new Node(30);
        head = node1;
        Node node2 = new Node(20);
        Node node3 = new Node(40);
        Node node4 = new Node(70);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
     }

     public void display(){
         Node cur = head;
         while(cur != null) {
             System.out.print(cur.val + " ");
             cur = cur.next;
         }
         System.out.println();
     }

     //头插法
     public void addFirst(int val) {
         Node firstNode = new Node(val);
         firstNode.next = head;
         head = firstNode;
     }

     //找尾
     private Node findLast() {
         Node tail = head;
         while(tail.next != null) {
             tail = tail.next;
         }
         return tail;
     }
     //尾插法
     public void addLast(int val) {
         Node lastNode = new Node(val);
         if(head == null) {
             head = lastNode;
             return;
         }
         Node tail = findLast();
         tail.next = lastNode;
     }

     //得到单链表的长度
     public int size() {
         int count = 0;
         Node cur = head;
         while(cur != null) {
             count++;
             cur = cur.next;
         }
         return count;
     }

     //任意位置插入,第一个数据节点为0号下标
     public void addIndex(int index,int val)
             throws IndexOutOfBoundException{
         if(index < 0 || index > this.size()) {
             throw new IndexOutOfBoundException("index输入有误！");
         }
         if(index == 0) {
             this.addFirst(val);
             return;
         }
             Node newNode = new Node(val);
             Node cur = head;
             int count = 0;
             while (count != index - 1) {
                 cur = cur.next;
                 count++;
             }
             newNode.next = cur.next;
             cur.next = newNode;
     }

     //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key) {
         Node cur = head;
         while(cur != null) {
              if(cur.val == key) {
                  return true;
              }
              cur = cur.next;
         }
         return false;
     }

     //删除第一次出现关键字为key的节点
     public void remove(int key) {
         if(head == null) {
             return;
         }
         if(head.val == key) {
             head = head.next;
             return;
         }
         Node cur = head;
         while(cur.next != null) {
             if(cur.next.val == key) {
                 break;
             }
             cur = cur.next;
         }
         if(cur.next == null) {
             return;
         }
         cur.next = cur.next.next;
     }

     //删除所有值为key的节点
     public void removeAllKey(int key) {
         if(head == null){
             return;
         }
         Node cur = head.next;
         Node pre = head;
         while(cur != null) {
             if(cur.val == key) {
                 pre.next = cur.next;
             } else {
                 pre = cur;
             }
             cur = cur.next;
         }
         if(head.val == key) {
             head = head.next;
         }
     }

     public void clear() {
         head = null;
     }

     //反转链表
         public Node reverseList() {
             if(head == null){
                 return null;
             }

             Node cur = head.next;
             head.next = null;
             while(cur != null){
                 Node rear = cur.next;
                 cur.next = head;
                 head = cur;
                 cur = rear;
             }
             return head;
         }

 }