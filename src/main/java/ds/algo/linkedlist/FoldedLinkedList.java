package ds.algo.linkedlist;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class FoldedLinkedList {

    public static void main(String[] args){
        //mergeNodes(Node.setupData()).printNodeTree();

    }
    private static Node getMiddleNode(Node h){
        Node s=h, f=h;

        while(f != null){
            s = s.nextNode;
            f = f.nextNode;
            if(f != null){
                f = f.nextNode;
            }
        }
        return s;
    }

    private static void mergeNodes(Node head){
        Node middlePointer = getMiddleNode(head);
        Node reverseLastHalf = reverseLinkedList(middlePointer);
        while (reverseLastHalf != null && head != middlePointer)
        {
            Node tempHead = head.nextNode;
            Node tempReverse = reverseLastHalf.nextNode;
            reverseLastHalf.nextNode = head.nextNode;
            head.nextNode = reverseLastHalf;
            head = tempHead;
            reverseLastHalf = tempReverse;
        }

        //return head;
    }

    private static Node reverseLinkedList(Node h){

        if(h.nextNode == null) return h;
        Node newHead = reverseLinkedList(h.nextNode);
        h.nextNode.nextNode = h;
        h.nextNode=null;

        return newHead;
    }

}
