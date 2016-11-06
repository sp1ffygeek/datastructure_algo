package ds.algo.linkedlist;

import sun.plugin2.applet.context.NoopExecutionContext;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class ReverseLinkedListRecursive {

    public static void main(String[] args){
        Node a = Node.setupData();
        reverseNode(a).printNodeTree();


    }

    private static Node reverseNode(Node head){
        if(null == head.nextNode) return head;

        Node newHead = reverseNode(head.nextNode);
        head.nextNode.nextNode = head;
        head.nextNode = null;

        return newHead;
    }
}
