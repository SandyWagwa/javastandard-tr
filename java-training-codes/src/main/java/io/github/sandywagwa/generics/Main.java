package io.github.sandywagwa.generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123456);
        System.out.println(intBox.getItem()); // 123456

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Sandra");
        System.out.println(strBox.getItem());
    }
}
