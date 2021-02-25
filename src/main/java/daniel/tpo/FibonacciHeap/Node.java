package daniel.tpo.FibonacciHeap;

public class Node
{
    Node left, right, child, parent;
    int degree = 0;
    boolean mark = false;
    int key;

    Node(int key)
    {
        this.left = this;
        this.right = this;
        this.parent = null;
        this.degree = 0;
        this.key = key;
    }

}
