package org.example.week1.array9;

public class EvenNumberFinder {
    public static void main(String[] args) {

        /// Q1. 1차원 배열에서 짝수만 출력하기
        //아래의 정수 배열이 주어졌을 때 짝수만 출력하세요.
        //배열 예시: {3, 4, 7, 10, 15, 20}

        int[] numbers = {3, 4, 7, 10, 15, 20};

        // 일반 for 문
        System.out.print("짝수 (일반 for문): ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // 향상된 for문
        System.out.print("짝수 (향상된 for문): ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

    }
}
