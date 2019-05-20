package com.azdybel.algs.Structs;

import com.azdybel.algs.Interfaces.IMyList;

import java.util.concurrent.atomic.AtomicBoolean;

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

    @Override
    public void addOrdered(ListElement listElement) {
        if (getSize() == 0) {
            this.setHead(listElement);
            this.setLast(listElement);
            listElement.next = listElement;
            listElement.prev = listElement;
        } else {
            ListElement iterator = this.getHead();
            if (listElement.getValue() <= iterator.getValue()) {
                this.setHead(listElement);
            } else {
                AtomicBoolean isLast = new AtomicBoolean(false);
                while (listElement.getValue() > iterator.getValue() && !isLast.get()) {
                    iterator = iterator.next;
                    if (iterator.equals(this.getHead())) {
                        this.setLast(listElement);
                        isLast.set(true);
                    }
                }
            }
            listElement.prev = iterator.prev;
            listElement.next = iterator;
            listElement.prev.next = listElement;
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
    public ListElement findIndex(int index) {
        ListElement iterator = this.getHead();
        int i = 0;
        while(i < index) {
            iterator = iterator.next;
            i++;
        }
        return iterator;
    }

//    @Override
//    public void getElements() {
//        ListElement iterator = this.getHead();
//        for(int i=0; i < size; i++) {
//            System.out.print(iterator.getValue());
//            iterator = iterator.next;
//        }
//    }

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
