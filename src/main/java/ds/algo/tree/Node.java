package ds.algo.tree;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class Node {

    public int value;

    public Node leftNode;
    public Node rightNode;

    public Node(int i){
        this.value = i;
    }

    public static Node setupData(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(8);
        Node g = new Node(6);
        Node h = new Node(7);
        a.leftNode = b;
        a.rightNode = c;
        b.leftNode = d;
        c.leftNode = e;
        c.rightNode = f;
        f.leftNode = g;
        f.rightNode = h;

        return a;
    }
}
