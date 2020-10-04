package com.company;

import java.util.Scanner;

public class ClassB extends ClassA {
    int y;

    public ClassB() {
        this.setY();
    }

    public void setY() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter Y number");
        this.y = keyboard.nextInt();
    }

    public int sumOfXAndY() {
        return this.x + this.y;
    }
}
