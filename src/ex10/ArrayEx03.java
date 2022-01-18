package ex10;

import java.util.Scanner;

public class ArrayEx03 {
    final static int STUDENTS = 5; // 클래스 상태로 지정
    // final은 상수로 지정하여 변수가 아니게 만들어 버림.

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];
        getVaules(scores); // scores라는 배열을
        getAverage(scores);
    }

    static void getVaules(int[] array) { // 매개변수에 대입한다.
        // 배열을 메소드의 매개변수로 전달 가능하다.
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하시오:");
            array[i] = scan.nextInt();
        }
    }

    static void getAverage(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++)
            total += array[i];
        System.out.println("평균 성적은" + total / array.length + "입니다.");

    }
}
