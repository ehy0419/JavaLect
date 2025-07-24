package org.example.week2.polymorphism10;

public class Cat implements Animal {


    @Override
    public void exist() {
        System.out.println("Cat exist");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makeSound");
    }

    public void scratch() {
        System.out.println("Cat scratch");
    }
}
