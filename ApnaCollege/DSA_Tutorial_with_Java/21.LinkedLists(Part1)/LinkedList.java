public class LinkedList {
    public static class Node{
        public int data;
        public Node next;
        // constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Methods and operations on ll : add(), remove(), print(), search()
    
    public void addFirst(int data){     // T.C: O(n)
        // Step 1: create new Node
        Node newNode = new Node(data);
        size++;
        // Empty linked list
        if (head == null){
            head = tail =  newNode;
            return;
        }
        // Non empty linked list
        // Step 2: newNode next = head
        newNode.next = head;
        // Step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // Step 1: create new node
        Node newNode = new Node(data);
        size++;
        // Case of Empty list
        if (head == null){
            head = tail = newNode;
            return;
        }

        // Case of non-empty list
        // Step 2: tail next = newNode
        tail.next = newNode;
        // Step 3: tail = newNode
        tail = newNode;
    }

    public void add(int index, int data){
        if(index<0 || index>size){
            System.out.println("INVALID INDEX : "+ index);
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }
        
        if(head == null){
            System.out.println("LL is empty");
            addFirst(data);
            return;
        }

        int counter = 0;
        Node temp = head;
        while(counter != index-1){
            temp = temp.next;
            counter ++;
        }
        
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Empty ll");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size --;
        return val;
    }

    // public int size(){
    //     if(head == null){
    //         return 0;
    //     }
    //     int counter = 0;
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         counter ++;
    //     }
    //     return counter;
    // }

    public void print(){
        if(head == null){
            System.out.println("Empty list!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
            // if(temp == null){
            //     System.out.print("null");
            // }
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.print();
        // System.out.println(ll.size());
        System.out.println(ll.size);
        
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.add(6,660);
        ll.print();
        System.out.println(ll.size);

        ll.addFirst(2);
        ll.print();
        System.out.println(ll.size);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.size);
        ll.addLast(3);
        ll.print();

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.size);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.size);

        ll.add(3,30);
        ll.print();
        System.out.println(ll.size);

        ll.add(0,660);
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.removeLast()+ " Removed");
        ll.print();
        System.out.print(ll.size);
    }
}
