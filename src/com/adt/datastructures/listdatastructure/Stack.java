package com.adt.datastructures.listdatastructure;

import com.adt.interfaces.ListInterface;

/**
 * this class is used for implementing stack, using {@link LinkedListNode}
 * other interface methods are not of use as I had created common interface
 * here add is working as push, pull and peek is also created
 */
public class Stack implements ListInterface
{
    private LinkedList commonList;
    private LinkedListNode firstNode = new LinkedListNode();
    private LinkedListNode lastNode = new LinkedListNode();

    public Stack(LinkedListNode f, LinkedListNode l) {
        firstNode = f;
        lastNode = l;
        firstNode.next = lastNode;
    }

    public Stack() {
        firstNode.next = lastNode;
    }

    @Override
    public void add(Object item) {
      //  commonList.add(item);
        lastNode = new LinkedListNode(item, lastNode);
    }

    public Object popStack (){
        if(lastNode == null) {
            return -1;
        }
        else {
            Object item = lastNode.getData();
            lastNode = lastNode.getNext();
            return item;
        }
    }

    public Object peekStack() {
        if(lastNode == null) {
            return -1;
        }
        return lastNode.getData();
    }

    @Override
    public void addAtPos(Object item, int position) {

    }

    @Override
    public boolean remove(Object item) {
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
    public Object getAtPos(int position) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void print() {

    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

}
