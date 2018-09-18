package com.adt.datastructures.treedatastructure;

public class BinaryTreeNode
{
    BinaryTreeNode left, right;
    private int data;

    /* Constructor */
    public BinaryTreeNode()
    {
        left = null;
        right = null;
        data = 0;
    }

    /* Constructor */
    BinaryTreeNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    /* to set left node */
    public void setLeft(BinaryTreeNode n)
    {
        left = n;
    }

    /* to set right node */
    public void setRight(BinaryTreeNode n)
    {
        right = n;
    }

    /* to get left node */
    BinaryTreeNode getLeft()
    {
        return left;
    }

    /* to get right node */
    BinaryTreeNode getRight()
    {
        return right;
    }

    /* to set data to node */
    public void setData(int d)
    {
        data = d;
    }

    /* to get data from node */
    int getData()
    {
        return data;
    }
}
