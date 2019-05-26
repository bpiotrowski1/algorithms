package com.azdybel.algs.Interfaces;

import com.azdybel.algs.Trees.Node;

public interface IBinarySearchTree {
    void setup();
    void add(int value);
    void getElements(Node node);
    Node search(Node node, int value);
}
