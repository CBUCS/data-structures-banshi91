package com.adt.datastructures.listdatastructure;

/**
 * this is the node for linked list
 * containing next and object data
 */
public class LinkedListNode<T> {
    //next node in the chain or null if there isn't one.
    LinkedListNode<T> next;

    //data containing
    T data;

    // default Node constructor
    LinkedListNode()
    {
    }

    // Node constructor
    LinkedListNode(T data) {
        next = null;
        this.data = data;
    }

    public LinkedListNode(T data, LinkedListNode<T> next) {
        this.next = next;
        this.data = data;
    }

    // these methods should be self-explanatory
    public T getData() {
        return data;
    }

    public void setData(T dataValue) {
        data = dataValue;
    }

    LinkedListNode<T> getNext() {
        return next;
    }

    void setNext(LinkedListNode<T> nextValue) {
        next = nextValue;
    }

}
