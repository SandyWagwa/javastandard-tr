package io.github.sandywagwa.excercises.javase018;

public class MainApp {
    public static void main(String[] args) {

        // -------- STACK TEST --------
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Apple");
        stringStack.push("Banana");
        System.out.println("Stack Pop: " + stringStack.pop());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Stack Peek: " + intStack.peek());

        // -------- QUEUE TEST --------
        Queue<Integer> intQueue = new Queue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        System.out.println("Queue Dequeue: " + intQueue.dequeue());

        // -------- CUSTOM OBJECT TEST --------
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("John", 20));
        studentStack.push(new Student("Mary", 22));
        System.out.println("Student Pop: " + studentStack.pop());

        // -------- TREE TEST --------
        TreeNode<Integer> root = new TreeNode<>(50);
        root.left = new TreeNode<>(80);
        root.right = new TreeNode<>(70);

        System.out.println("Tree Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
    }
}
