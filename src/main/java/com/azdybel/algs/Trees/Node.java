package com.azdybel.algs.Trees;

import lombok.Getter;
import lombok.Setter;

public class Node {
    @Getter @Setter private int value;
    @Getter @Setter private Node parent;
    @Getter @Setter private Node left;
    @Getter @Setter private Node right;

    Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
        right = null;
        left = null;
    }
}
