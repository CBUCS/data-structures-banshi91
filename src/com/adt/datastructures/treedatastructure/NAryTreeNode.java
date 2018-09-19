package com.adt.datastructures.treedatastructure;

import com.adt.interfaces.NAryInterface;

import java.util.ArrayList;

public class NAryTreeNode implements NAryInterface {
    private final String LABEL;
    private final int N;
    private final ArrayList<NAryTreeNode> children;

    public NAryTreeNode(String LABEL, int n) {
        this.LABEL = LABEL;
        this.N = n;
        children = new ArrayList<>(n);
    }

    private boolean addChild(NAryTreeNode node) {
        if (children.size() < N) {
            return children.add(node);
        }

        return false;
    }

    public boolean addChild(String label) {
        return addChild(new NAryTreeNode(label, N));
    }


    public ArrayList<NAryTreeNode> getChildren() {
        return new ArrayList<>(children);
    }

    public NAryTreeNode getChild(int index) {
        if (index < children.size()) {
            return children.get(index);
        }

        return null;
    }

    public static void print(NAryTreeNode root) {
        printUtil(root, 0);
    }

    private static void printUtil(NAryTreeNode node, int depth) {
        for (int i = 0; i < depth; ++i) {
            System.out.print("   ");
        }

        System.out.println(node.LABEL);

        for (NAryTreeNode child : node.getChildren()) {
            printUtil(child, depth + 1);
        }
    }
}
