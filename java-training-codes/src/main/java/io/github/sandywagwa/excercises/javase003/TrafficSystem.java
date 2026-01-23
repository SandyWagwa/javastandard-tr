package io.github.sandywagwa.excercises.javase003;

import java.util.Scanner;

public class TrafficSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic light color: ");
        String trafficLight = scanner.nextLine();
        switch (trafficLight) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Prepare to stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            case "Blinkedred":
                System.out.println("treat as stop sign");
                break;
            case "Blinkedyellow":
                System.out.println("proceed with caution");
            default:
                System.out.println("Invalid Color");
        }
        scanner.close();
    }
}
