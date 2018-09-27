package com.adt.datastructures.treedatastructure;

public class BinaryTreeNode<T>
{
    BinaryTreeNode left, right;
    private T data;

    /* Constructor */
    public BinaryTreeNode()
    {
        left = null;
        right = null;
        data = null;
    }

    /* Constructor */
    BinaryTreeNode(T n)
    {
        left = null;
        right = null;
        data = null;
    }

    /* to set left node */
    public void setLeft(BinaryTreeNode<T> n)
    {
        left = n;
    }

    /* to set right node */
    public void setRight(BinaryTreeNode<T> n)
    {
        right = n;
    }

    /* to get left node */
    BinaryTreeNode<T> getLeft()
    {
        return left;
    }

    /* to get right node */
    BinaryTreeNode<T> getRight()
    {
        return right;
    }

    /* to set data to node */
    public void setData(T d)
    {
        data = d;
    }

    /* to get data from node */
    T getData()
    {
        return data;
    }
}
