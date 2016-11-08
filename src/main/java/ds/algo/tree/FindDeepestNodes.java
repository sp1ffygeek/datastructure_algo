package ds.algo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sp1ffygeek on 11/8/16.
 */
public class FindDeepestNodes
{
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
        b.rightNode = e;
        c.rightNode = f;
        f.leftNode = g;
        f.rightNode = h;

        List nodes = findDeepestNodes(a);
        /*for (Node node : nodes)
        {
            System.out.print(node.value + ", ");
        }*/
    }

    @SuppressWarnings("unchecked")
    private static List findDeepestNodes(Node root)
    {
        Object[] levelNodes = new Object[2];
        levelNodes[0] = 0;
        levelNodes[1] = new ArrayList();
        findDeepestNodes(root, 1, levelNodes);
        return (List) levelNodes[1];
    }

    @SuppressWarnings("unchecked")
    private static void findDeepestNodes(Node root, int level,
                                         Object[] levelNodes)
    {
        if (root == null)
            return;
        if((Integer)levelNodes[0]<=level)
        {
            if((Integer)levelNodes[0] < level)
                ((List)levelNodes[1]).clear();
            levelNodes[0]=level;
            ((List)levelNodes[1]).add(root);
        }
        findDeepestNodes(root.leftNode, level+1, levelNodes);
        findDeepestNodes(root.rightNode, level+1, levelNodes);
    }
}

