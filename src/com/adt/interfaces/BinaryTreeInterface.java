package com.adt.interfaces;

import com.adt.datastructures.treedatastructure.BinaryTreeNode;

public interface BinaryTreeInterface
{

    void insert(int data);
    boolean search(int item);
    int count();
    boolean isEmpty();
    void print(String data);
    void inOrder();
    void preOrder();
    void postOrder();

}
