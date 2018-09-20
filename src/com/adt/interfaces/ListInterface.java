package com.adt.interfaces;

public interface ListInterface
{
    void add (Object item);
    void addAtPos (Object item, int position);
    boolean remove (Object item);
    boolean removeAtPos (int position);
    int size();
    Object getAtPos(int position);
    Object[] toArray();
    void print();
    boolean contains (Object item);
}
