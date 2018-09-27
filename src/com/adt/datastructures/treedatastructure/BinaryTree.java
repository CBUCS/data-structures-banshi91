package com.adt.datastructures.treedatastructure;


import com.adt.interfaces.BinaryTreeInterface;

public class BinaryTree<T> implements BinaryTreeInterface<T> {

    private BinaryTreeNode<T> btNode;

    //Constructor
    public BinaryTree()
    {
        btNode = null;
    }

    @Override
    public void insert(T data) {
        btNode = insert(btNode, data);
    }

    @Override
    public boolean search(T item) {
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
    public void print(T data) {
        System.out.print(data);
    }

    @Override
    public void inOrder() {
        inOrder(btNode);
    }

    @Override
    public void preOrder() {
        preOrder(btNode);
    }

    @Override
    public void postOrder() {
        postOrder(btNode);
    }

    // to insert data in interface insert function
    private BinaryTreeNode<T> insert(BinaryTreeNode<T> btNode, T data)
    {
        if (btNode == null)
            btNode = new BinaryTreeNode<T>(data);
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
    private int countNodes(BinaryTreeNode<T> btNode)
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
    private boolean search(BinaryTreeNode<T> btNode, T val)
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
    private void inOrder(BinaryTreeNode<T> btNode)
    {
        if (btNode != null)
        {
            inOrder(btNode.getLeft());
            System.out.print(btNode.getData() +" ");
            inOrder(btNode.getRight());
        }
    }

    //to print preOrder of inserted value
    private void preOrder(BinaryTreeNode<T> btNode)
    {
        if (btNode != null)
        {
            System.out.print(btNode.getData() +" ");
            preOrder(btNode.getLeft());
            preOrder(btNode.getRight());
        }
    }

    //to print postOrder of inserted value
    private void postOrder(BinaryTreeNode<T> btNode)
    {
        if (btNode != null)
        {
            postOrder(btNode.getLeft());
            postOrder(btNode.getRight());
            print(btNode.getData());

        }
    }
}
