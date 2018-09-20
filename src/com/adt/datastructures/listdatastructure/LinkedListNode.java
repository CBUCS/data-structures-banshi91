package com.adt.datastructures.listdatastructure;

public class LinkedListNode {
    //next node in the chain or null if there isn't one.
    LinkedListNode next;

    //data containing
    Object data;

    // default Node constructor
    LinkedListNode() {
    }

    // Node constructor
    LinkedListNode(Object data) {
        next = null;
        this.data = data;
    }

    public LinkedListNode(Object data, LinkedListNode next) {
        this.next = next;
        this.data = data;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    LinkedListNode getNext() {
        return next;
    }

    void setNext(LinkedListNode nextValue) {
        next = nextValue;
    }

}
