public class IterativeSearch {
    public static int iterativeSearch(LinkedList ll,int key){
        if(ll.head == null){
            System.out.println("LL is empty");
        }

        int i = 0;
        LinkedList.Node temp = ll.head;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        int key = 4;
        int index = iterativeSearch(ll, key);
        System.out.println(index);
        System.out.println(iterativeSearch(ll, 14));
        System.out.println(iterativeSearch(ll, 6));

    }
}
