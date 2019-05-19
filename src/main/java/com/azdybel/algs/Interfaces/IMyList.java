package com.azdybel.algs.Interfaces;

import com.azdybel.algs.Structs.ListElement;

import java.util.List;

public interface IMyList {
    void add(ListElement listElement);
    void addOrdered(ListElement listElement);
    void remove(ListElement listElement);
    ListElement find(int value);
    int findIndex(int value);
}
