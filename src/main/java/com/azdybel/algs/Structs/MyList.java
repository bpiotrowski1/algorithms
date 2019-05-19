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
            listElement.next = listElement;
            listElement.prev = listElement;
        } else {
            this.getLast().next = listElement;
            listElement.prev = this.getLast();
            listElement.next = this.getHead();
        }
        this.setLast(listElement);
        incSize();
    }

    //TODO
    @Override
    public void addOrdered(ListElement listElement) {
        if (getSize() == 0) {
            this.setHead(listElement);
            listElement.next = listElement;
            listElement.prev = listElement;
        } else {
            ListElement iterator = this.getHead();
            do {
                iterator = iterator.next;
            } while (iterator != this.head || iterator.getValue() < listElement.getValue());
            listElement.prev = iterator.prev;
            listElement.next = iterator;
            iterator.prev.next = listElement;
            iterator.prev = listElement;
        }
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
        ListElement iterator = this.getHead();
        do {
            if (iterator.getValue() == value) {
                return iterator;
            }
            iterator = iterator.next;
        } while (iterator.next != head);
        return null;
    }

    @Override
    public int findIndex(int value) {
        int index = 0;
        ListElement iterator = this.getHead();
        do {
            if (iterator.getValue() == value) {
                break;
            }
            iterator = iterator.next;
            index++;
        } while (iterator.next != head);
        return index;
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
