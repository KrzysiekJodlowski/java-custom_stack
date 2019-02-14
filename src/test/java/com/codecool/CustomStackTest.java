package com.codecool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CustomStackTest {

    @Test
    public void testCustomStackCreation() {
        CustomStack<String> customStack = new CustomStack<>(12);
    }

    @Test
    public void checkIfUserCanPushAString() throws StackOverflow {
        CustomStack<String> customStack = new CustomStack<>(5);
        customStack.push("string");
        assertEquals("string", customStack.peek());
    }

    @Test
    public void checkIfUserCanPushIntegers() throws StackOverflow {
        CustomStack<Integer> customStack = new CustomStack<>(3);
        customStack.push(99);
        assertEquals(99, customStack.peek());
    }

    @Test
    public void getCustomStackSize() throws StackOverflow {
        CustomStack<String> customStack = new CustomStack<>(5);
        assertEquals(5, customStack.size());
    }

    @Test
    public void checkIfUserCanPopAString() throws StackOverflow, StackUnderflow {
        CustomStack<String> customStack = new CustomStack<>(5);
        customStack.push("string");
        assertEquals("string", customStack.pop());
        assertEquals(5, customStack.getSpace());
    }

    @Test
    public void checkIfUserCanPeekAString() throws StackOverflow {
        CustomStack<String> customStack = new CustomStack<>(5);
        customStack.push("string");
        assertEquals("string", customStack.peek());
    }

    @Test
    public void throwsStackOverflownExceptionWhenAddingToFullStack() throws StackOverflow {
        CustomStack<String> customStack = new CustomStack<>(3);
        customStack.push("string");
        customStack.push("string");
        customStack.push("string");
        assertThrows(StackOverflow.class, ()-> customStack.push("string"));
    }

    @Test
    public void throwsStackUnderflowExceptionWhenPoppingEmptyStack() throws StackUnderflow{
        CustomStack<String> customStack = new CustomStack<>(3);
        assertThrows(StackUnderflow.class, ()-> customStack.pop());
    }

}