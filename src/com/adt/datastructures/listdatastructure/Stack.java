package com.adt.datastructures.listdatastructure;

import com.adt.interfaces.ListInterface;

/**
 * this class is used for implementing stack, using {@link LinkedListNode}
 * other interface methods are not of use as I had created common interface
 * here add is working as push, pull and peek is also created
 */
public class Stack<T> implements ListInterface<T>
{
    private LinkedList<T> commonList;
    private LinkedListNode<T> firstNode = new LinkedListNode<T>();
    private LinkedListNode<T> lastNode = new LinkedListNode<T>();

    public Stack(LinkedListNode<T>f, LinkedListNode<T> l) {
        firstNode = f;
        lastNode = l;
        firstNode.next = lastNode;
    }

    public Stack() {
        firstNode.next = lastNode;
    }

    @Override
    public void add(T item) {
      //  commonList.add(item);
        lastNode = new LinkedListNode(item, lastNode);
    }

    public T popStack (){
        if(lastNode == null) {
            return null;
        }
        else {
            T item = lastNode.getData();
            lastNode = lastNode.getNext();
            return item;
        }
    }

    public T peekStack() {
        if(lastNode == null) {
            return null;
        }
        return lastNode.getData();
    }

    @Override
    public void addAtPos(T item, int position) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public boolean removeAtPos(int position) {
        return false;
    }

    @Override
    public int size() {
        return commonList.size();
    }

    @Override
    public T getAtPos(int position) {
        return null;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

}
