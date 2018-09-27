package com.adt.interfaces;

import com.adt.datastructures.treedatastructure.BinaryTreeNode;

public interface BinaryTreeInterface<T>
{

    void insert(T data);
    boolean search(T item);
    int count();
    boolean isEmpty();
    void print(T data);
    void inOrder();
    void preOrder();
    void postOrder();

}
