package org.example.week2.wrapperClass3;

public class CustomInteger {
    // 속성 - 기본형 변수
    int value;

    // 생성자
    CustomInteger(int value) {
        this.value = value;
    }
    // 생성자를 만들 때 이름이 클래스와 같아야 한다

    // 기능
    // 값을 가져오는 메서드
    int getValue() {
        return value;
    }

    // 값을 설정하는 메서드
    void setValue(int value) {
        this.value = value;
    }

    // 자동으로 문자열로 변환해주는 기능
    // toString() 오버라이딩 (값을 출력할 수 있도록)

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
