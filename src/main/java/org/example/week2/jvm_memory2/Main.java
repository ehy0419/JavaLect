package org.example.week2.jvm_memory2;

public class Main {
    public static void main(String[] args) {
        String name = "Steve";
        int age = 20;
        Person personA = new Person(name, age);
        personA.introduce();

        int value1 = 1;
        int value2 = 2;

        int ret = personA.sum(value1, value2);
        System.out.println(ret);
    }
}
