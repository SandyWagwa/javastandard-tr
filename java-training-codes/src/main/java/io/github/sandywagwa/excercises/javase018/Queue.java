package io.github.sandywagwa.excercises.javase018;

import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> items = new LinkedList<>();

    public void enqueue(T item) {
        items.addLast(item);
    }

    public T dequeue() {
        if (items.isEmpty()) {
            return null;
        }
        return items.removeFirst();
    }

    public T peek() {
        if (items.isEmpty()) {
            return null;
        }
        return items.getFirst();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
