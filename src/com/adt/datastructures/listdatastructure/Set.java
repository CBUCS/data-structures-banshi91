package com.adt.datastructures.listdatastructure;

//I tried to solve it to solve
public class Set  {

    private int[] items = null;

    public Set(int[] items) {
        this.items = new int[items.length];
        for (int position = 0; position < items.length; position++) {
            this.items[position] = items[position];
        }
    }


    // toString returns a string representation of the set
    public String toString() {
        String s = "{";
        if (items.length == 0)
            s = s + "}";
        else {
            for (int position = 0; position < items.length - 1; position++)
                s = s + items[position] + ", ";
            s = s + items[items.length - 1] + "}";
        }

        return s;
    }

    // contains returns true if the given element is a member of the set, and false otherwise.
    public boolean contains(int element) {

        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == element)
                return true;
        }
        return false;
    }


    // intersection returns a set which contains the elements in the set that are also members of the given set
    public Set intersection(Set set) {
        // use the method contains
        int members = 0;
        for (int i = 0; i < items.length; i++) {
            if (set.contains(items[i]))
                members++;
        }

        int[] newMembers = new int[members];
        int position = 0;
        for (int i = 0; i < items.length; i++) {
            if (set.contains(items[i]))
                newMembers[position++] = this.items[i];

        }
        return new Set(newMembers);
    }

}
