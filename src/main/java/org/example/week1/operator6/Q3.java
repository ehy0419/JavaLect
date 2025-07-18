package org.example.week1.operator6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        // Q3. 두 문자열이 같은지 비교할 수 있는 프로그램을 만들어 봅시다
        // 입력한 두 개의 문자열 `str1`과 `str2`  을 비교한 결과를 `result` 에 담아서 출력하세요.
        //- 두 문자열이 같은지  비교할 때 활용 (`.equals()`)

        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        // TODO: 사용자로부터 두 번째 문자열 입력받기
        // TODO: 문자열 비교 결과를 변수 result 에 저장
        // TODO: 결과 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 문자열을 입력하세요: "); //println 줄바꿈
        String str1 = scanner.nextLine();

        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();

        boolean result = str1.equals(str2);

        System.out.println("문자열이 같은가요?: " + result);
    }
}
