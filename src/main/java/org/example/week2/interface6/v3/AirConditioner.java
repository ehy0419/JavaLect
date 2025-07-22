package org.example.week2.interface6.v3;

public class AirConditioner implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("에어컨이 가동됩니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨이 꺼졌습니다.");
    }

    // 추가 기능 (인터페이스에는 없는 기능)
    void setTemperature() {
        System.out.println("온도를 설정합니다.");
    }
}
