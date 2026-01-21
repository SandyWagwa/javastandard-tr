package io.github.sandywagwa.loops;

public class Primenumber {
    public static void main(String[] args) {

        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
