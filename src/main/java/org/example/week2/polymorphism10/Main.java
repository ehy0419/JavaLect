package org.example.week2.polymorphism10;

public class Main {
    public static void main(String[] args) {

        // 다형성 활용
        Cat cat1 = new Cat();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound();
        animal2.makeSound();

        animal1.exist();
        animal2.exist();

//        int smallBox =
//        long bigBox = smallBox; 1;

        // 업캐스팅 주의사항
//        animal1.scratch();
//        animal2.wag();

        // 다운캐스팅
//        long bigBox2 = 1;
//        int smallBox2 = (int) bigBox2;

        Cat cat = (Cat) animal1;
        cat.exist();
        Dog dog = (Dog) animal2;
        dog.wag();

        // 잘못된 다운캐스팅 문제
//        Cat cat2 = (Cat) animal2;   // animal2 = dog;
        //**잘못된 다운캐스팅은 컴파일단계에서 감지할 수 없습니다.
//        cat2.scratch();

        // 다운캐스팅 시 instanceof 활용 방법
        // ✅ 안전한 다운캐스팅(animal2 가 Cat 의 인스턴스 유형인지 확인합니다.)
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니다.");
        }

        Animal[] animals = {new Cat(), new Dog()};
        System.out.println(";;;;");
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
