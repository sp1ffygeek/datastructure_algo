package ds.algo.tree;

/**
 * Created by sp1ffygeek on 11/8/16.
 */
public class LowestCommonAncestor
{

    static Node LCANode = null;

    /**
     * @param args
     */
    public static void main(String[] args)
    {

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

        LCA(a, c, h);
        System.out.println(LCANode.value);

    }



    public static int LCA(Node currentNode, Node n1, Node n2)
    {
        if (currentNode == null)
            return 0;
        int currentValue = 0;
        if (currentNode == n1 || currentNode == n2)
            currentValue = 1;
        int leftValue = LCA(currentNode.leftNode, n1, n2);
        int rightValue = LCA(currentNode.rightNode, n1, n2);
        if ((currentValue == 1 && leftValue == 1)
                ||(currentValue == 1 && rightValue == 1)
                ||(leftValue == 1 && rightValue == 1))
        {
            LCANode = currentNode;
            return 2;
        }
        return currentValue + leftValue + rightValue;

    }

}