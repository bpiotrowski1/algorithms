package com.azdybel.algs.Trees;

import com.azdybel.algs.Interfaces.IAlgorithmRunner;
import com.azdybel.algs.Interfaces.IBinarySearchTree;
import com.azdybel.algs.Statics.Constants;
import lombok.Getter;

import java.util.Random;

public class BinarySearchTree implements IAlgorithmRunner, IBinarySearchTree {
    @Getter Node root;

    public BinarySearchTree() {
        setup();
    }

    public void add(int value) {
        Node i = root, parent = null;
        Node toInsert = new Node(value, null);
        if (i == null) {
            root = toInsert;
        } else {
            while (i != null) {
                parent = i;
                if (value < i.getValue()) {
                    i = i.getLeft();
                } else {
                    i = i.getRight();
                }
            }
            toInsert.setParent(parent);
            if (value < parent.getValue()) {
                parent.setLeft(toInsert);
            } else {
                parent.setRight(toInsert);
            }
        }
    }

    public void setup() {
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < Constants.ARRAY; i++) {
            add(rand.nextInt(Constants.RAND));
        }
    }

    @Override
    public void getElements() {
        getElements(root);
    }

    @Override
    public void run() {

    }

    public void getElements(Node node) {
        if (node != null) {
            getElements(node.getLeft());
            System.out.print(node.getValue() + " ");
            getElements(node.getRight());
        }
    }

    @Override
    public Node search(Node node, int value) {
        while ((node != null) && (node.getValue() != value)) {
            if (value < node.getValue()) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
        }
        return node;
    }

    public Node findMin(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public Node findMax(Node node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }
}
