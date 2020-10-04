package com.company;

public class ExerciseThree {
    int a, b;

    int odd = 0;
    int even = 0;
    int oddSum = 0;
    int evenSum = 0;

    public ExerciseThree(int a, int b) {
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.b = a;
            this.a = b;
        }


        for (int i = 0; i < 40; i++) {
            int random_int = (int) (Math.random() * (this.b - this.a + 1) + this.a);

            if (random_int % 2 == 0) {
                this.even++;
                this.evenSum += random_int;
            } else {
                this.odd++;
                this.oddSum += random_int;
            }
        }

        int min, max;

        if(this.oddSum > this.evenSum) {
            max = this.oddSum;
            min = this.evenSum;
        } else {
            max = this.evenSum;
            min = this.oddSum;
        }

        for (int i = 0; i < 5; i++) {
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("Random numbers between " + min + " and " + max + " - " + random_int);
        }
    }
}
