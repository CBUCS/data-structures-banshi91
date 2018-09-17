package java.com.adt.interfaces;

import java.com.adt.datastructures.treedatastructure.BinaryTreeNode;

public interface TreeInterface
{

    void insert(int data);
    boolean search(int item);
    int count ();
    boolean isEmpty();
    void print(String data);
    void inOrder();
    void preOder();
    void postOder();

}
