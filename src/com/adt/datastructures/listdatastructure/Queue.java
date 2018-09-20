package com.adt.datastructures.listdatastructure;

import com.adt.interfaces.ListInterface;

public class Queue implements ListInterface
{
    int first, last, size;
    int  queueInt;
    int array[];

    public Queue(int queueInt) {
        this.queueInt = queueInt;
        first = this.size = 0;
        last = queueInt - 1;
        array = new int[this.queueInt];
    }

    // Queue is full when size becomes equal to
    // the capacity
    boolean isFull(Queue queue)
    {  return (queue.size == queue.queueInt);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue)
    {  return (queue.size == 0); }


   /* // Method to add an item to the queue.
    @Override
    public void add( int item)
    {
        if (isFull(this))
            return;
        this.last = (this.last + 1)%this.queueInt;
        this.array[this.last] = item;
        this.size = this.size + 1;
        System.out.println(item+ " Enqueued");
    }*/

    // It changes first and size
    /*@Override
    public int remove()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.first];
        this.first = (this.first + 1)%this.queueInt;
        this.size = this.size - 1;
        return item;
    }*/

    // Method to get first of queue
    public int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.first];
    }

    // Method to get last of queue
    public int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.last];
    }

    @Override
    public void add(Object item) {
        if (isFull(this))
            return;
        this.last = (this.last + 1)%this.queueInt;
        this.array[this.last] = (int) item;
        this.size = this.size + 1;
        System.out.println(item+ " Enqueued");
    }

    @Override
    public void addAtPos(Object item, int position) {

    }

    @Override
    public boolean remove(Object item) {
        if (isEmpty(this))
            return false;

        int item1 = this.array[this.first];
        this.first = (this.first + 1)%this.queueInt;
        this.size = this.size - 1;
        System.out.println(item +
                " de-queued from queue\n");
        return true;
    }

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

