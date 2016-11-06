package ds.algo.linkedlist;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class Node {

    public int value;

    public Node nextNode;

    public Node(int i){
        this.value = i;
    }

    public void printNodeTree(){
        Node head=this;
        while (head != null)
        {
            System.out.print(head.value + "->");
            head = head.nextNode;
        }
        System.out.println();
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
