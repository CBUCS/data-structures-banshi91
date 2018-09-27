package com.adt.datastructures.listdatastructure;

import com.adt.interfaces.ListInterface;

/**
 * this class is used for implementing LinkedList
 * using {@link LinkedListNode}
 */
public class LinkedList<T> implements ListInterface<T>
{
    private static int counter;
    private LinkedListNode<T> head;


    @Override
    public void add(T item) {
        // Initialize Node
        if (head == null) {
            head = new LinkedListNode<T>(item);
        }

        LinkedListNode<T> nodeTemo = new LinkedListNode<T>(item);
        LinkedListNode<T> nodeCurrent = head;

        if (nodeCurrent != null) {

            // starting at the head node, goto to end of the list
            //add element in other
            while (nodeCurrent.getNext() != null) {
                nodeCurrent = nodeCurrent.getNext();
            }

            // the last node next
            nodeTemo.setNext(nodeTemo);
        }

        // increment counter
        incrementCounter();
    }

    @Override
    public void addAtPos(T item, int position) {
        if (head == null) {
            head = new LinkedListNode<T>(item);
        }

        LinkedListNode<T> nodeTemp = new LinkedListNode<>(item);
        LinkedListNode<T> nodeCurrent = head;

        if (nodeCurrent != null) {
            for (int i = 0; i < position && nodeCurrent.getNext() != null; i++) {
                nodeCurrent = nodeCurrent.getNext();
            }
        }
        nodeTemp.setNext(nodeCurrent != null ? nodeCurrent.getNext() : null);
        nodeCurrent.setNext(nodeTemp);
        incrementCounter();
    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public boolean removeAtPos(int position) {
        // if the index is out of range, exit
        if (position < 1 || position > size())
            return false;

        LinkedListNode<T> node = head;
        if (head != null) {
            for (int i = 0; i < position; i++) {
                if (node.getNext() == null)
                    return false;
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext());
            // decrement counter
            decrementCounter();
            return true;

        }
        return false;
    }

    @Override
    public int size() {
        return getCounter();
    }

    @Override
    public T getAtPos(int position) {
        // position must be 1 or higher
        if (position < 0)
            return null;
        LinkedListNode<T> node = null;
        if (head != null) {
            node = head;
            for (int i = 0; i < position ; i++) {
//                if (node.getNext() == null)
//                    return null;
                node = node.getNext();
            }
            return node.getData();
        }
        return node.getData();
    }



    @Override
    public T[] toArray() {
        return (T[]) new Object[0];
    }

    @Override
    public void print() {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }


    public String toString() {
        String output = "";

        if (head != null) {
            LinkedListNode<T> node = head.getNext();
            while (node != null) {
                output = String.format("%s%s", output, "[" + node.getData().toString() + "]");
                node = node.getNext();
            }
        }
        return output;
    }
}
