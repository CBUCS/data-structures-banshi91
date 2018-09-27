package com.adt.interfaces;

public interface ListInterface<T>
{
    void add (T item);
    void addAtPos (T item, int position);
    boolean remove (T item);
    boolean removeAtPos (int position);
    int size();
    T getAtPos(int position);
    T[] toArray();
    void print();
    boolean contains (T item);
}
