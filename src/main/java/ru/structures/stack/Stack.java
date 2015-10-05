package ru.structures.stack;

public class Stack {
    private int top = -1;
    private int[] stack;

    public Stack(int size) {
        stack = new int[size];
    }

    public void push(int el) {
        stack[++top] = el;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public int size() {
        return stack.length;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
