public class RecursiveSearch {

    public static int recursiveSearch(LinkedList.Node head,int idx, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return idx;
        }

        return recursiveSearch(head.next, idx+1, key);

    }
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);

        int key = 8;
        int i = 0;
        System.out.println(recursiveSearch(ll.head,i,key));
    }
}
