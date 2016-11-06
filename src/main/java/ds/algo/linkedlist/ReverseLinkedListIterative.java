package ds.algo.linkedlist;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class ReverseLinkedListIterative {

    public static void main(String[] args){

        Node a = Node.setupData();

        Node r = reverseLinkedList(a);
        r.printNodeTree();
    }

    private static Node reverseLinkedList(Node head){

        Node next = null, previous=null, current=head;
        while(current != null){
            next = current.nextNode;
            current.nextNode=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
