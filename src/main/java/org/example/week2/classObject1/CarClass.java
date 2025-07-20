package org.example.week2.classObject1;

public class CarClass {

    // 1. 속성
    String name;
    String carModel;

    // 2. 생성자
    public CarClass(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    // 3. 기능
    public void drive() {
        System.out.println(name + "[" + this.carModel + "] 을 주행합니다.");
    }
}
