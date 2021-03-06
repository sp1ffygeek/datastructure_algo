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

    public static Node setupData(){
        Node a = new Node(4);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(5);
        Node f = new Node(2);
        Node g = new Node(6);
        Node h = new Node(9);
        Node i = new Node(8);
        Node j = new Node(10);

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;
        d.nextNode = e;
        e.nextNode = f;
        f.nextNode = g;
        g.nextNode = h;
        h.nextNode = i;
        i.nextNode = j;

        a.printNodeTree();
        return a;
    }
}
