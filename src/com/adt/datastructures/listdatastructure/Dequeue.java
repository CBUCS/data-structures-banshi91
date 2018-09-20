package com.adt.datastructures.listdatastructure;


import com.adt.interfaces.ListInterface;

public class Dequeue implements ListInterface {


    private LinkedList dequeue;

    public Dequeue (){
        dequeue = new LinkedList();
    }

    public boolean addFromTail(Object item) {
        dequeue.addAtPos(item,0);
        return true;
    }
    public boolean addFromHead(Object item) {

        dequeue.addAtPos(item,dequeue.size());
        return true;
    }

    public Object dequeueFromHead(){
        LinkedListNode n = new LinkedListNode();
        n.data = dequeue.getAtPos(size()-1);
        dequeue.removeAtPos(size()-1);
        return n.data;
    }

    public Object dequeueFromTail (){
        LinkedListNode n = new LinkedListNode();
        n.data = dequeue.getAtPos(0);
        dequeue.removeAtPos(0);
        return n.data;
    }

    @Override
    public Object[] toArray() {
        return dequeue.toArray();
    }

    @Override
    public void print() {
        dequeue.print();
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void addAtPos(Object item, int position) {

    }

    @Override
    public boolean remove(Object item) { return false; }

    @Override
    public boolean removeAtPos(int position) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object getAtPos(int position) {
        return null;
    }


}