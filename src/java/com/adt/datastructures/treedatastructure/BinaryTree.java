package java.com.adt.datastructures.treedatastructure;

import java.com.adt.interfaces.TreeInterface;

public class BinaryTree implements TreeInterface {

    private BinaryTreeNode btNode;

    //Constructor
    public BinaryTree()
    {
        btNode = null;
    }

    @Override
    public void insert(int data) {
        btNode = insert(btNode, data);
    }

    @Override
    public boolean search(int item) {
        return search(btNode, item);
    }

    @Override
    public int count() {
        return countNodes(btNode);
    }

    @Override
    public boolean isEmpty() {
        return btNode==null;
    }

    @Override
    public void print(String data) {
        System.out.print(data);
    }

    @Override
    public void inOrder() {
        inOrder(btNode);
    }

    @Override
    public void preOder() {
        preOder(btNode);
    }

    @Override
    public void postOder() {
        postOrder(btNode);
    }

    // to insert data in interface insert function
    private BinaryTreeNode insert(BinaryTreeNode btNode, int data)
    {
        if (btNode == null)
            btNode = new BinaryTreeNode(data);
        else
        {
            if (btNode.getRight() == null)
                btNode.right = insert(btNode.right, data);
            else
                btNode.left = insert(btNode.left, data);
        }
        return btNode;
    }

    // to count number of nodes
    private int countNodes(BinaryTreeNode btNode)
    {
        if (btNode == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(btNode.getLeft());
            l += countNodes(btNode.getRight());
            return l;
        }
    }

    // to search for an element recursively
    private boolean search(BinaryTreeNode btNode, int val)
    {
        if (btNode.getData() == val)
            return true;
        if (btNode.getLeft() != null)
            if (search(btNode.getLeft(), val))
                return true;
        if (btNode.getRight() != null)
            return search(btNode.getRight(), val);
        return false;
    }

    //to print inOrder of inserted value
    private void inOrder(BinaryTreeNode btNode)
    {
        if (btNode != null)
        {
            inOrder(btNode.getLeft());
            System.out.print(btNode.getData() +" ");
            inOrder(btNode.getRight());
        }
    }

    //to print preOrder of inserted value
    private void preOder(BinaryTreeNode btNode)
    {
        if (btNode != null)
        {
            System.out.print(btNode.getData() +" ");
            preOder(btNode.getLeft());
            preOder(btNode.getRight());
        }
    }

    //to print postOrder of inserted value
    private void postOrder(BinaryTreeNode btNode)
    {
        if (btNode != null)
        {
            postOrder(btNode.getLeft());
            postOrder(btNode.getRight());
            print(btNode.getData() +" ");

        }
    }
}
