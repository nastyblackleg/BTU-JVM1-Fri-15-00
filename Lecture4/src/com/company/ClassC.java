package com.company;

import java.util.Scanner;

public class ClassC {
    public int a, b, c;

    public ClassC() {
        this.setVariables();
    }

    public void setVariables() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter first integer");
        this.a = keyboard.nextInt();

        System.out.println("enter second integer");
        this.b = keyboard.nextInt();

        System.out.println("enter third integer");
        this.c = keyboard.nextInt();
    }

    public int getLastOfA() {
        return (Math.abs(this.a) % 10);
    }

    public int getFirstOfB() {
        int copyB = this.b;
        while (copyB > 9) {
            copyB /= 10;
        }
        return copyB;
    }

    public int getDigitSumC() {
        int sum = 0;
        int copyC = this.c;

        while (copyC > 0) {
            sum = sum + (copyC % 10);
            copyC = copyC / 10;
        }

        return sum;
    }

    public int productOfALastBFirst() {
        return this.getLastOfA() * this.getFirstOfB();
    }

    public int sumOfMethodFiveAndThree() {
        return this.getFirstOfB() + this.productOfALastBFirst();
    }
}

