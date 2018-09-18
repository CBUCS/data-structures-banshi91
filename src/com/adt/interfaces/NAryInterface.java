package com.adt.interfaces;


import com.adt.datastructures.treedatastructure.NAryTreeNode;

import java.util.ArrayList;

public interface NAryInterface {

    boolean addChild(String child);
    ArrayList<NAryTreeNode> getChildren();

}
