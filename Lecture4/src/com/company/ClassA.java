package com.company;

import java.util.Scanner;

public class ClassA {
    int x;
    public ClassA() {
        System.out.println("Hello from ClassC constructor!");

        this.setX();
    }

    public void setX() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter X number");
        this.x = keyboard.nextInt();
    }

    public int getXPlusTwelve() {
        return this.x + 12;
    }

    public String isXOddOrEven() {
        if ( this.x % 2 == 0 ) {
            return "Even";
        }
        return "Odd";
    }
}
