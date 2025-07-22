package org.example.week2.interface6.v3;

public class Main {
    public static void main(String[] args) {

        // ✅ 가전제품 객체 생성
        TV tv = new TV();
        AirConditioner airConditioner = new AirConditioner();
        WashingMachine washingMachine = new WashingMachine();

        // ✅ 개별적으로 전원 켜기
        System.out.println("🔌 가전제품을 켭니다.");
        tv.turnOn();
        airConditioner.turnOn();
        washingMachine.turnOn();

        System.out.println(); // 줄바꿈

        // ✅ 개별적으로 전원 끄기
        System.out.println("🔌 가전제품을 끕니다.");
        tv.turnOff();
        airConditioner.turnOff();
        washingMachine.turnOff();

        System.out.println(); // 줄바꿈

        // ✅ 추가 기능 사용
        tv.changeChannel();
        airConditioner.setTemperature();
        washingMachine.setTime();

    }
}
