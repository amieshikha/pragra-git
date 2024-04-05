// 2. Write a program that simulates a traffic light.

package Assignments.Assignment1.TrafficLights;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Which Traffic-light is Flashing : ");
        System.out.println("***************************");
        Scanner scanner = new Scanner(System.in);
        String colour = scanner.next();
             switch (colour) {
            case "Red":
                System.out.println("Signal is " + colour + " --> so you have to Stop");
                break;
            case "Green":
                System.out.println("Signal is " + colour + " --> so you can go");
                break;
            case "Yellow":
                System.out.println("Signal is " + colour + " --> so you have to wait");
                break;
            default:
                System.out.println("You have to follow Traffic rules");

        }
    }
}