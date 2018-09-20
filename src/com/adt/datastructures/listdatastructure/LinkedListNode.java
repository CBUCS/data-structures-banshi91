package com.adt.datastructures.listdatastructure;

import javafx.scene.Node;

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

    // another Node constructor if we want to specify the node to point to.
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
