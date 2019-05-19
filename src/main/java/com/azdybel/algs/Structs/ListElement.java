package com.azdybel.algs.Structs;

public class ListElement {
    private int value;
    public ListElement next;
    public ListElement prev;

    public ListElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
