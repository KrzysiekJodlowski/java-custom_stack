package com.codecool;

public class CustomStack<T> {

    /*
     *   Inner class
     */

    private static class Node<T> {
        private int index;
        private T data;

        private Node(T data) {
            this.data = data;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public T getData() {
            return this.data;
        }
    }

    /*
     *   The right one class
     */

    private Node top;
    private int size;
    private final int COUNT_ONE = 1;

    public CustomStack (int initialSize) {
        this.size = initialSize;
        this.top = null;
    }

    public void push(T data) throws StackOverflow {
        if (this.top == null) {
            this.top = new Node(data);
        } else {
            if (this.top.getIndex() + this.COUNT_ONE == this.size) {
                throw new StackOverflow("Stack is full!");
            } else {
                Node newTop = new Node(data);
                newTop.setIndex(this.top.getIndex() + this.COUNT_ONE);
                this.top = newTop;
            }
        }
    }

    public T pop() throws StackUnderflow {
        if (this.top == null) {
            throw new StackUnderflow("Stack is empty!");
        }
        T data = (T) this.top.getData();
        this.top = null;
        return data;
    }

    public T peek() {
        return (T) this.top.getData();
    }

    public int getSpace() {
        if (this.top == null) {
            return this.size;
        }
        return this.size - (this.top.getIndex() + this.COUNT_ONE);
    }

    public int size(){
        return this.size;
    }
}

/*
 *   Custom exceptions
 */

class StackOverflow extends Exception {
    public StackOverflow(String message) {
        super(message);
    }
}

class StackUnderflow extends Exception {
    public StackUnderflow(String message) {
        super(message);
    }
}
