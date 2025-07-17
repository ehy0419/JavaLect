package org.example.week1.basic1_3;

public class Lect1 {

    //// 학습 키워드
    // - [ ]  JDK - Java 프로그램을 개발할 때 필요한 개발 도구 모음
    //    - [ ]  Javac(Java Compiler) - 자바코드를 바이트코드로 변환하는 역할
    //    - [ ]  JVM - Java 프로그램을 실행하는 가상 머신
    //    - [ ]  바이트코드(.class) - Javac 가 변환한 마법의파일

    public static void main(String[] args) { // <- 프로그램의 시작점
        // public static void main(String[] args) { 실행될 명령어들을 작성하는 공간 }
        // 자바 코드 파일을 실행할 때 제일 먼저 실행되어야 하는 부분을 표시하는 약속된 규칙
        // 중괄호 {} 시작과 끝을 의미합니다. 괄호 사이에 작업할 내용을 작성하면 프로그램이 끝날때 까지 괄호안의 첫 문장 부터 마지막 문장까지 수행을 하게됩니다.
        // 주석 // 코드에 대한 설명을 적는 부분입니다. 프로그램 실행에는 영향을 주지 않습니다.

        System.out.println("Hello World");
        System.out.println("\uD83C\uDF89세상을 바꾸다\uD83C\uDF89");
        // sout 문자열 입력
    }

    // 자바 슬로건 : 한번 작성하면 어디서든 실행할 수 있도록
    // Write Once, Run Anywhere!

    // 자바 특징 중 객체지향 : 자바의 모든 것들은 객체(class)로 구성.

    // JDK (Java Development Kit)  ← Java 개발에 필요한 모든 것 포함
    // ├── JRE (Java Runtime Environment)  ← Java 실행 환경
    // │   ├── JVM 자바 가상 환경 (Java Virtual Machine)  ← 바이트코드 실행
    // │   ├── Java 라이브러리 (rt.jar 등)  ← 필수 API 제공 (java.lang, java.util 등)
    // │   ├── 클래스 로더 (Class Loader)  ← .class 파일 로드
    // │
    // ├── Javac 자바 컴파일러 (Java Compiler)  ← .java → .class 변환
    // ├── 기타 개발 도구 (디버거, Javadoc 생성기, JAR 도구 등)

    // 자바에서 모든 것이 객체 (class)
    // 코드를 작성할 때 서로 관련있는 기능들을 묶어 하나의 클래스로 관리
    // 개념   |  비유                           | 설명
    // 클래스  | 설계도                           | 객체를 만들기 위한 정의
    // 객체   |  설계도를 기반으로 만들어진 존재    | 클래스에서 만들어진 존재
    // Main.java 파일이 있으면 Main 이라는 객체(class)를 생성하기 위한 클래스
}
