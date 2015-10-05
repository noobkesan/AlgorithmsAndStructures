package ru.structures.queue;

public class Queue {
    private int front = 0;
    private int current = -1;
    private int itemsCount = 0;
    private int[] queue;


    public Queue(int maxSize) {
        queue = new int[maxSize];
    }

    public void insert(int el) {
        if(current == queue.length - 1) {
            current = -1;
        }

        queue[++current] = el;
        itemsCount++;
    }

    public int remove() {
        int result = queue[front++];
        if(front == queue.length) {
            front = 0;
        }

        itemsCount--;

        return result;
    }

    public int peek() {
        return queue[front];
    }

    public int size() {
        return itemsCount;
    }

    public boolean isEmpty() {
        return itemsCount == 0;
    }

    public boolean isFull() {
        return itemsCount == queue.length - 1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);

        queue.insert(123);
        queue.insert(54);
        queue.insert(-45);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
