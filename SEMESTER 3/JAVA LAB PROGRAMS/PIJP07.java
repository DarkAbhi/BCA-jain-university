package com.bca;

interface LivingBeing {
    String drink = "Water";

    void status();
}

interface Animal {
    void eat();

    void move();
}

public class PIJP07 implements Animal, LivingBeing {
    public void status() {
        System.out.println("Living");
    }

    public void eat() {
        System.out.println("It eats food also drinks " + drink);
    }

    public void move() {
        System.out.println("It will move faster than cat");
    }

    public static void main(String[] args) {
        PIJP07 d = new PIJP07();
        d.status();
        d.eat();
        d.move();
    }
}
