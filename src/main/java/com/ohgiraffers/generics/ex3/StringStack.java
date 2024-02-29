package com.ohgiraffers.generics.ex3;

public class StringStack implements Stack<String> {
    private String[] stack;
    private int top;

    public StringStack(int capacity) {
        stack = new String[capacity];
        top = -1;
    }

    @Override
    public void push(String item) {
        stack[++top] = item;
    }

    @Override
    public String pop() {
        if (top == -1) {
            return null;
        }
        return stack[top--];
    }
}
