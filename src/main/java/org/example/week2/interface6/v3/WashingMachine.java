package org.example.week2.interface6.v3;

public class WashingMachine implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("세탁기가 작동을 시작합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("세탁기가 작동을 멈춥니다.");
    }

    // 추가 기능 (인터페이스에는 없는 기능)
    void setTime() {
        System.out.println("세탁 시간을 설정합니다.");
    }
}
