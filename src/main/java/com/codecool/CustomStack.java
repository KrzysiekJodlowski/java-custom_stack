package com.codecool;

public class CustomStack<T> {

    private static class Node<T> {
        
    }

    private int size;
    private T data;

    public CustomStack (int initialSize) {
        this.size = initialSize;
    }

    public void push(T data) throws StackOverflow {

    }

    public T pop() throws StackUnderflow {
        return (T) data;
    }

    public T peek() {
        return (T) data;
    }

    public int getSpace() {
        return 0;
    }

    public int size(){
        return this.size;
    }
}

class StackOverflow extends Exception {

}

class StackUnderflow extends Exception {

}
