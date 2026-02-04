package io.github.sandywagwa.excercises.javase018;

import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    public T peek() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
