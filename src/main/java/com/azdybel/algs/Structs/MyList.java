package com.azdybel.algs.Structs;

import com.azdybel.algs.Interfaces.IMyList;

import java.util.List;

public class MyList implements IMyList {
    private int size = 0;
    private ListElement head;
    private ListElement last;


    @Override
    public void add(ListElement listElement) {
        if (getSize() == 0) {
            this.setHead(listElement);
        } else {
            this.getLast().next = listElement;
            listElement.prev = this.getLast();
            listElement.next = this.getHead();
        }
        this.setLast(listElement);
        incSize();
    }

    @Override
    public void remove(ListElement listElement) {
        listElement.prev.next = listElement.next;
        listElement.next.prev = listElement.prev;
        listElement.prev = null;
        listElement.next = null;
        decSize();
    }

    @Override
    public ListElement find(int value) {
        return null;
    }

    @Override
    public ListElement findIndex(int value) {
        return null;
    }

    public int getSize() {
        return size;
    }

    public void incSize() {
        this.size++;
    }

    public void decSize() {
        this.size--;
    }

    public ListElement getHead() {
        return head;
    }

    public void setHead(ListElement head) {
        this.head = head;
    }

    public ListElement getLast() {
        return last;
    }

    public void setLast(ListElement last) {
        this.last = last;
    }
}
