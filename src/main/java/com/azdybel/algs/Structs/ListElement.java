package com.azdybel.algs.Structs;

import lombok.Getter;

public class ListElement {
    @Getter private int value;
    public ListElement next;
    public ListElement prev;

    public ListElement(int value) {
        this.value = value;
    }
}
