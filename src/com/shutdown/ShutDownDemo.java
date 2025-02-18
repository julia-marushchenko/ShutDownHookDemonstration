package com.shutdown;
import java.util.Scanner;

class ThreadChild extends Thread {

    public void run(){

        System.out.println("It cleans up thread");
        System.out.println("It shut downs hook");

    }
}


public class ShutDownDemo {

    public static void main(String [] args){

        Runtime current = Runtime.getRuntime();
        current.addShutdownHook(new ThreadChild());

        System.out.print("Enter value of a:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("Enter value of b:");
        scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println("b = " + b);
        System.out.println("Enter value of c:");
        scan = new Scanner(System.in);
        int c = scan.nextInt();
        System.out.println("c = " + c);

        System.out.println("Quadratic Equation: " + a + "x^2 + " + b + "x + " + c +" = 0");
        int stepin = 2;
        double D = Math.pow(b, stepin) - 4 * a * c;

        double x1 = 0;
        double x2 = 0;

        if(D >= 0) {
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
        } else {
            x1 = (-b + Math.sqrt(-D)) / 2 * a;
            x2 = (-b - Math.sqrt(-D)) / 2 * a;
        }

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
