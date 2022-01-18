package ex10;

import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int total = 0;
        Scanner scan = new Scanner(System.in); // heap에 있는 메서드
        int[] scores = new int[STUDENTS];

        for (int i = 0; i < STUDENTS; i++) { // 5까지 1씩 더한다.
            System.out.println("성적을 입력하시오:");
            scores[i] = scan.nextInt(); // i번째 성적을 (입력하는 메소드) 추가
        }
        for (int i = 0; i < STUDENTS; i++) {
            total += scores[i]; // 성적과 토탈이 같을 때까지 더하기?
            System.out.println("평균 성적은" + total / STUDENTS + "입니다."); // 평균 구하기
            // 스코어 나누기 학생 수 나누면 평균이 나온다.
        }
    }
}
