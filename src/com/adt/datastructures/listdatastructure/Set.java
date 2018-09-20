package com.adt.datastructures.listdatastructure;

import com.adt.interfaces.ListInterface;

public class Set implements ListInterface {
    private LinkedList set;

    public Set() {
        set = new LinkedList();
    }

    @Override
    public void add(Object item) {
        set.add(item);
    }

    @Override
    public void addAtPos(Object item, int position) {

    }

    @Override
    public boolean remove(Object item) {
        return set.remove(item);
    }

    @Override
    public boolean removeAtPos(int position) {
        return false;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public Object getAtPos(int position) {
        LinkedListNode node = new LinkedListNode();
        node.data = set.getAtPos(position);
        return node.data;
    }


    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public void print() {
        set.print();
    }

    @Override
    public boolean contains(Object item) {
        return set.contains(item);
    }

    public Set unionSet(Set unionSet) {
        Set newSet = new Set();
        for (int j = 0; j < set.size(); j++) {
            newSet.add(set.getAtPos(j));
        }
        for (int i = 0; i < unionSet.size(); i++) {
            if (!newSet.contains(unionSet.getAtPos(i))) {
                newSet.add(unionSet.getAtPos(i));
            }

        }
        return newSet;
    }

    public Set intersection(Set intersectSet) {
        Set newSet = new Set();
        for (int i = 0; i < set.size(); i++)
            for (int j = 0; j < intersectSet.size(); j++) {
                if (set.getAtPos(i) == intersectSet.getAtPos(j)) {
                    newSet.add(set.getAtPos(i));
                }

            }
        return newSet;
    }

    public Set difference(Set diffSet) {
        Set intersection = intersection(diffSet);
        Set union = unionSet(diffSet);
        for (int i = 0; i < intersection.size(); i++) {
            if (union.contains(intersection.getAtPos(i))) ;
            union.remove(intersection.getAtPos(i));
        }
        return union;
    }

}
