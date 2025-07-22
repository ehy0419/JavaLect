package org.example.week2.interface6.v3;

public class TV implements ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("TV 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원이 꺼졌습니다.");
    }

    // 추가 기능 (인터페이스에는 없는 기능)
    void changeChannel() {
        System.out.println("채널을 변경합니다.");
    }
}
