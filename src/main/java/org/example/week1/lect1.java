package org.example.week1;

public class lect1 {

    // 학습 키워드
    // - [ ]  JDK - Java 프로그램을 개발할 때 필요한 개발 도구 모음
    //    - [ ]  Javac(Java Compiler) - 자바코드를 바이트코드로 변환하는 역할
    //    - [ ]  JVM - Java 프로그램을 실행하는 가상 머신
    //    - [ ]  바이트코드(.class) - Javac 가 변환한 마법의파일

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("\uD83C\uDF89세상을 바꾸다\uD83C\uDF89");
        // sout 문자열 입력
    }

    // 자바 슬로건 : 한번 작성하면 어디서든 실행할 수 있도록
    // Write Once, Run Anywhere!

    // 자바 특징 중 객체지향 : 자바의 모든 것들은 객체(class)로 구성.

    // JDK (Java Development Kit)  ← Java 개발에 필요한 모든 것 포함
    // ├── JRE (Java Runtime Environment)  ← Java 실행 환경
    // │   ├── JVM (Java Virtual Machine)  ← 바이트코드 실행
    // │   ├── Java 라이브러리 (rt.jar 등)  ← 필수 API 제공 (java.lang, java.util 등)
    // │   ├── 클래스 로더 (Class Loader)  ← .class 파일 로드
    // │
    // ├── Javac (Java Compiler)  ← .java → .class 변환
    // ├── 기타 개발 도구 (디버거, Javadoc 생성기, JAR 도구 등)
}
