package org.example.week2.polymorphism10;

public class Dog implements Animal {
    @Override
    public void exist() {
        System.out.println("Dog exists");
    }
    @Override
    public void makeSound() {
        System.out.println("Dog make sound");
    }

    public void wag() {
        System.out.println("Dog wag");
    };


}
