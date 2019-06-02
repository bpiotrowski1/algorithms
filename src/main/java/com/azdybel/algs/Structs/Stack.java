package com.azdybel.algs.Structs;

import com.azdybel.algs.Interfaces.IStack;

public class Stack implements IStack {
    private int top = -1;
    private int[] array;

    public Stack(int size) {
        this.array = new int[size];
    }

    @Override
    public void push(int item) {
        array[++top] = item;
    }

    @Override
    public int pop() {
        return array[top--];
    }

    @Override
    public int top() {
        return array[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i < top + 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
